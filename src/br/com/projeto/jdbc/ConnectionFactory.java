package br.com.projeto.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://127.0.0.1/bdvendas", "teste", "123");
        } catch (SQLException erroSql) {
            throw new RuntimeException(erroSql);

        }
    }

}
