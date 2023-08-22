/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.serprojava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author willians
 */
public class BancoDados {

    private Connection con = null;
    private String hostName = null;
    private String userName = null;
    private String password = null;
    private String url = null;
    private String jdbcDriver = null;
    private String dataBaseName = null;
    private String dataBasePrefix = null;
    private String dataBasePort = null;

    public BancoDados() {
        super();
        dataBasePrefix = "jdbc:mysql://";
        dataBasePort = "3306";
        userName = "willians";
        password = "Will@6411";
        hostName = "localhost";
        jdbcDriver = "com.mysql.jdbc.Driver";
        dataBaseName = "controlemensal";

        url = dataBasePrefix + hostName + ":" + dataBasePort + "/" + dataBaseName ;
        System.out.println(url);
    }

    public Connection getConection() throws SQLException {
        try {
            if (con == null) {
                Class.forName(jdbcDriver);
                con = DriverManager.getConnection(url, userName, password);
            } else if (con.isClosed()) {
                con = null;
                return getConection();
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return con;
    }

    public void closeConnection() {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }

}
