package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VendaDAO {

    private static final String URL = "jdbc:h2:./vendas_db";

    private static final String USER = "Lee Mah Mai";

    private static final String PASS = "123321";

    public VendaDAO(){

        CriarTabelaSeNaoExisir();

    }

    private Connection getConexao() throws SQLException {

        return DriverManager.getConnection(URL,USER, PASS);

    }

    private void CriarTabelaSeNaoExisir(){

        String sql = """
                CREATE TABLEN IF NOT EXISTS Venda(
                id INT AUTO_INCREMENT PRIMARY KEY,
                produto VARCHAR(50),
                ValorUnitario DOUBLE,
                Quantidade INT
                );
                """;

        try(Connection conn = getConexao(); Statement stmt = conn.createStatement()){

            stmt.execute(sql);

        }   catch (SQLException e){

            e.printStackTrace();

        }

    }

    public void Salva(Venda venda){

        String sql = "INSERT INTO Venda(Produto, Categoria, ValorUnitario, Quantudade)"  +
                     "VALUES (?, ?, ?, ?)";

        try(Connection conn = getConexao(); PreparedStatement pstmt = conn.prepareStatement(sql)){

            pstmt.setString(1, venda.getProduto());
            pstmt.setString(2, venda.getCategoria());
            pstmt.setDouble(3, venda.getValorUnit());
            pstmt.setInt(4, venda.getQuant());
            pstmt.executeUpdate();

            System.out.println("Venda registrada");

        } catch(SQLException e){

            System.out.println("Falha ao salvar a venda. " + e.getMessage());

        }

    }

    public List<Venda> ListarTodos(){

        List<Venda> lista = new ArrayList<>();

        String sql = "SELECT * FROM venda";

        try(Connection conn = getConexao(); Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){

            while (rs.next()){

                Venda v = new Venda();
                v.setId(rs.getInt("id"));
                v.setProduto(rs.getString("Produto"));
                v.setCategoria(rs.getString("Categoria"));
                v.setValorUnit(rs.getDouble("ValorUnit"));
                v.setQuant(rs.getInt("Quant"));
                lista.add(v);

            }

        } catch (SQLException e){

            System.out.println("Erro ao buscar vendas. " + e.getMessage());

        }

        return lista;

    }

}
