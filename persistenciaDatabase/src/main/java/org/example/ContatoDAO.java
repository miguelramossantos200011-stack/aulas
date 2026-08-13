package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ContatoDAO {

    public void adicionar(Contato contato){

        // FIX: Changed "INT" to "INTO"
        String sql = "INSERT INTO contatos(Name, Fone) VALUES(?, ?)";

        try(Connection conn = Database.conectar(); PreparedStatement pstmt = conn.prepareStatement(sql)){

            pstmt.setString(1, contato.getName());
            pstmt.setString(2, contato.getFone());
            pstmt.executeUpdate();

        } catch(SQLException e){
            System.out.println("Erro ao adicionar contato: " + e.getMessage());
        }
    }

    public List<Contato> listar(){

        List<Contato> contatos = new ArrayList<>();
        // FIX: Ensure table name matches your database (changed to lowercase "contatos")
        String sql = "SELECT * FROM contatos";

        try (Connection conn = Database.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)){

            while(rs.next()){
                int id = rs.getInt("id");
                String Name = rs.getString("Name");
                String Fone = rs.getString("Fone");

                contatos.add(new Contato(id, Name, Fone));
            }

        } catch (SQLException e){
            System.out.println("Erro ao listar contatos: " + e.getMessage());
        }

        return contatos;
    }

    public void Atualizar(Contato contato){

        // FIX: Removed trailing comma before WHERE
        String sql = "UPDATE contatos SET Name = ?, Fone = ? WHERE id = ?";

        try (Connection conn = Database.conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)){

            pstmt.setString(1, contato.getName());
            pstmt.setString(2, contato.getFone());
            pstmt.setInt(3, contato.getId()); // FIX: Added missing ID parameter

            pstmt.executeUpdate(); // FIX: Added execution call

        } catch (SQLException e){
            System.out.println("Erro ao atualizar contatos: " + e.getMessage());
        }
    }

    public void Remover(int id) {

        String sql = "DELETE FROM contatos WHERE id = ?";

        try (Connection conn = Database.conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)){

            pstmt.setInt(1, id);
            pstmt.executeUpdate();

        } catch (SQLException e){
            System.out.println("Erro ao remover contato: " + e.getMessage());
        }
    }
}