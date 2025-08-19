package br.com.dio.persistence.config;

import lombok.NoArgsConstructor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public final class ConnnectionConfig {
    public static <SQLException> Connection getConnection() throws java.sql.SQLException {
        String url = "jdbc:postgresql://localhost:5432/meubanco";
        String user = "postgres";
        String password = "minhasenha";
        var connection = DriverManager.getConnection(url, user, password);
        connection.setAutoCommit(false);
        return connection;
    }
}
