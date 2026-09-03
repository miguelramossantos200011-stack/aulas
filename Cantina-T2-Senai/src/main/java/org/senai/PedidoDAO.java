package org.senai;

import java.sql.*;
import java.util.Optional;

public class PedidoDAO {

    public double buscarDescontoDoDia() throws SQLException {
        String sql = """
                SELECT percentual
                FROM cupom
                WHERE data_cupom = CURRENT_DATE()
                AND ativo = TRUE
                LIMIT 1
                """;

        try(
                Connection conn = Conexao.connectar();
                PreparedStatement comando = conn.prepareStatement(sql);
                ResultSet rs = comando.executeQuery()
                ){
            if(rs.next()){
                return rs.getDouble("percentual");
            }
        }
        return 0.0;
    }

    public Pedido salvar(Pedido pedido) throws SQLException {
        String sql = """
                INSERT INTO pedidos(codigo, nome_aluno, matricula, peiodo, 
                                    produto_id, quantidade, valor_original, 
                                    pecerntual_desconto, valor_final, status)
                VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)
                """;

        try(
            Connection conn = Conexao.connectar();
            PreparedStatement comando = conn.prepareStatement(
                    sql, Statement.RETURN_GENERATED_KEYS
            );
            ResultSet rs = comando.executeQuery();
        ){
            comando.setInt(1, pedido.getId());
            comando.setString(2, pedido.getNomeAluno());
            comando.setString(3, pedido.getMatricula());
            comando.setString(4, pedido.getPeriodo());
            comando.setInt(5, pedido.getProdutoId());
            comando.setInt(6, pedido.getQuantidade());
            comando.setDouble(7, pedido.getValorOriginal());
            comando.setDouble(8,pedido.getPercentualDesconto() );
            comando.setDouble(9, pedido.getValorTotal());
            comando.setString(10, pedido.getStatus());

            comando.executeUpdate();

            try(ResultSet key = comando.getGeneratedKeys()){
                if(key.next()){
                    pedido.setId(key.getInt(1));
                }
            }
        }

        return pedido;
    }

    public Optional<Produto> buscarPorId(int produtoId) {


    }
}
