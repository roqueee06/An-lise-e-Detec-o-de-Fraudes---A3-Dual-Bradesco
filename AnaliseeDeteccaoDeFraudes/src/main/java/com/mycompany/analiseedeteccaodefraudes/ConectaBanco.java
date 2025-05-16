/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.analiseedeteccaodefraudes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Guilh
 */
public class ConectaBanco {
    public Connection conexao(){
        Connection conexao = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost/FraudeDeCompras", "root", "1234");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver do banco de dados não foi encontrado!");
        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao conectar ao banco de dados:" + ex.getMessage());
        }
        return conexao;
    }
}
