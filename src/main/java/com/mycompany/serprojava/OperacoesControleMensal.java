package com.mycompany.serprojava;
import java.sql.PreparedStatement;
import java.sql.Connection;
/**
 *
 * @author willians
 */
public class OperacoesControleMensal {
    BancoDados banco = new BancoDados();
    Connection con = null;
    
    public void inserirEntradas(int ano, String mes, String fonte, String descricao, 
            double salarioLiquido, String categoria){
        String sql = "INSERT INTO CONTROLEMENSAL.ENTRADAS VALUES (null,?,?,?,?,?,?)" ;
        try{
            con = banco.getConection();
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1, ano);
            stm.setString(2, mes);
            stm.setString(3, fonte);
            stm.setString(4, descricao);
            stm.setDouble(5, salarioLiquido);
            stm.setString(6, categoria);
            stm.execute();
            System.out.println("Inserido com sucesso!");
            con.close();
            banco.closeConnection();
            
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Inserção falhou!");
        }
    }
    
}
