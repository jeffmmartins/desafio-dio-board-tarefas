package br.com.dio.persistence.config;

import lombok.NoArgsConstructor;

import java.sql.Connection;
import java.sql.DriverManager;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public final class ConnnectionConfig {
    public static Connection getConnection() throws java.sql.SQLException {
        String url = "jdbc:postgresql://localhost:5432/meubanco";
        String user = "postgres";
        String password = "minhasenha";
        //Estabelecendo uma conexão com o banco de dados
        var connection = DriverManager.getConnection(url, user, password);
        //para não salvar automaticamente no vanco de dados
        connection.setAutoCommit(false);
        return connection;
    }
}
