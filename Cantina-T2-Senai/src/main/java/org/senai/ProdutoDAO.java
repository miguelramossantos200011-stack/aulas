package org.senai;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProdutoDAO {

    public List<Produto> listarProdutos() throws SQLException {
        String sql = """
                SELECT id, nome,categoria, descricoa, preco, emoji
                FROM produto
                WHERE disponivel = TRUE
                ORDER BY categoria, nome""";

        List<Produto> produtos = new ArrayList<>();

        try(
                Connection conexao = Conexao.connectar();

                PreparedStatement stmt = conexao.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                ) {
            while (rs.next()){
                produtos.add(criarProduto(rs));
            }

        }
        return produtos;
    }

    public Optional<Produto> buscarPorId(int id) throws SQLException {
        String sql = """
                SELECT id, nome, categoria, descricao, preco, emoji
                FROM produto
                WHERE id = ? AND disponivel = TRUE 
                """;

        try(
                Connection conn = Conexao.connectar();
                PreparedStatement comando = conn.prepareStatement(sql);
                ){
            comando.setInt(1, id);
            try(ResultSet rs = comando.executeQuery()){
                if(rs.next()){
                    return Optional.of(criarProduto(rs));
                }
            }
        }
        return Optional.empty();
    }

    private Produto criarProduto(ResultSet rs) throws SQLException {
        return new Produto(
                rs.getInt("id"),
                rs.getString("nome"),
                rs.getString("categoria"),
                rs.getString("descricao"),
                rs.getDouble("preco"),
                rs.getString("emoji")
        );
    }
}
