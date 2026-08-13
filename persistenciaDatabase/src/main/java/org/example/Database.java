package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

    // FIX: Changed "jbdc" to "jdbc"
    private static final String URL = "jdbc:sqlite:agenda.db";

    public static Connection conectar(){

        try{
            return DriverManager.getConnection(URL);

        } catch(SQLException e){
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
            return null;
        }

    }

    public static void CriarTabela(){

        System.out.println("Agenda de contato");

        String sql = "CREATE TABLE IF NOT EXISTS contatos ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "Name TEXT NOT NULL,"
                + "Fone TEXT"
                + ");";

        try(Connection conn = conectar();
            Statement stmt = conn.createStatement()){

            stmt.execute(sql);

        } catch (SQLException e){
            System.out.println("Erro ao gerar a tabela: " + e.getMessage());
        }

    }

}