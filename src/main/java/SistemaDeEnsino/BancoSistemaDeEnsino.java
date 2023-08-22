/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaDeEnsino;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author willians
 */
public class BancoSistemaDeEnsino {

    Connection con = null;
    String url = null;
    String banco = null;
    String password = null;
    String usuario = null;
    String jdbcDriver = "com.mysql.cj.jdbc.Driver";

    public BancoSistemaDeEnsino() {
        super();
        url = "jdbc:mysql://localhost:3306/";
        banco = "sistemadeensino";
        password = "Will@6411";
        usuario = "willians";
    }

    public Connection getConection() {
        try {
            if (con == null) {
                Class.forName(jdbcDriver);
                con = DriverManager.getConnection(url + banco, usuario, password);
            } else if (con.isClosed()) {
                con = null;
                return con;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    public void closeConection() {
        try {
            if (con != null) {
                con.close();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
