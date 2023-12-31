/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.produto.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Aluno
 */

public class ConnectionFactory {

    public static Connection getConnection() throws Exception {
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection("jdbc:postgresql://localhost:5433/DB_Produtos", "postgres", "20010510");
        } catch (Exception ex) {
            System.out.println("falha ao conectar");
            throw new Exception(ex.getMessage());
        }
    }

    private static void close(Connection conn, Statement stmt, ResultSet rs) throws Exception {
        try {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }
    public static void closeConnection(Connection conn, Statement stmt, ResultSet rs) throws Exception{
        close(conn,stmt,rs);
    }
    public static void closeConnection(Connection conn, Statement stmt) throws Exception{
        close(conn,stmt, null);
    }
     public static void closeConnection(Connection conn) throws Exception{
        close(conn,null,null);
    }
}