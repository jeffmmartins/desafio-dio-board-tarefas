package br.com.dio.persistence.migration;

import lombok.AllArgsConstructor;

import java.sql.Connection;

@AllArgsConstructor
public class MigrationStrategy {
     //Defenindo a propriedade privada e já construiu nosso contrutor por causa da anotação;
     private final Connection connection;

     //Trabalhar com o liquibase
     private void executeMigration(){

     }
}
