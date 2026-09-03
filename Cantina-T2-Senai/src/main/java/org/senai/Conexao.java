package org.senai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String URL = "jdbc:mysql://localhost:3306/cantina_senai_db" +
            "?userSSL=false" +
            "&allowPublicKeyRetrieval = true" +
            "&serverTimezone=America/Sao_Paulo";

    private static final String USER = "cantina";
    private static final String PASSWORD = "cantina123";

    private Conexao() {}

    public static Connection connectar() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void testar() throws SQLException {
        try (Connection conn = conectar()) {
            if (!conn.isValid(2)) {
                throw new SQLException("O MySQL não confirmou a conexão");
            }
        }
    }
}
