package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProdutoDAO {

    public List<Produto> ListarDisponíveis() throws SQLException{

        String sql = """
                
                SELECT id, nome, ctagoria, descricao, preco, emoji
                FROM produtos
                WHERE isponivel = true
                ORDER BY categoria,nome
                
                """;

        List<Produto> produtos = new ArrayList<>();
        try(

                Connection conexao = Conexao.conectar();
                PreparedStatement comando = conexao.prepareStatement(sql);
                ResultSet resultado = comando.executeQuery()

                ){

            while(resultado.next()){

                produtos.add(CriarProduto(resultado));

            }

        }

        return produtos;

    }

    public Optional<Produto> buscarPorId(int id) throws SQLException{

        String sql = """
                
                SELECT id, nome, categoria, descricao, preco, emoji
                FROM produtos
                WHERE id = ? AND disponivel = TRUE
                
                """;

        try(

                Connection conexao = Conexao.conectar();
                PreparedStatement comando = conexao.prepareStatement(sql);

                ){

            try(ResultSet resultado = comando.executeQuery()){

               if(resultado.next()){

                   return Optional.of(CriarProduto(resultado));

               }

            }

        }

        return Optional.empty();

    }

    private Produto CriarProduto(ResultSet resultado) throws SQLException{

        return new Produto(

                resultado.getInt("id"),
                resultado.getString("nome"),
                resultado.getString("categotia"),
                resultado.getString("descricao"),
                resultado.getDouble("preco"),
                resultado.getString("emoji")

        );

    }

}
