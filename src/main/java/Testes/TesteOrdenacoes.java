package Testes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import com.sun.source.tree.InstanceOfTree;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mycompany.serprojava.BancoDados;
import com.mycompany.serprojava.OperacoesControleMensal;
import com.mycompany.serprojava.BancoDados;
public class TesteOrdenacoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {

//        String palavra = JOptionPane.showInputDialog("Digita uma palavra e descubra se é um Palindro..");
        

        try {
            
          OperacoesControleMensal ocm = new OperacoesControleMensal();
          
          ocm.inserirEntradas(2022, "DEZEMBRO", "SALARIO WILLIANS", "SALARIO WILLIANS", 4300, "SALARIOS");
           
        }catch(Exception e){
            e.printStackTrace();
        } 

    }

}
