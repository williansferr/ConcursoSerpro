/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaDeEnsino;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import static java.util.Collections.list;

/**
 *
 * @author willians
 */
public class BeanManagerSistemaEnsino {

    BancoSistemaDeEnsino banco_ensino = new BancoSistemaDeEnsino();
    Connection conn = null;

//    public void insertAluno(Aluno aluno) {
//        String sql = "insert into sistemadeensino.aluno values(null,?)";
//        try {
//            conn = banco_ensino.getConection();
//            PreparedStatement stm = conn.prepareStatement(sql);
//            stm.setString(1, aluno.getNome());
//            stm.execute();
//            System.out.println("Inserido com sucesso! " + aluno.toString());
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
    public void inserirAlunoNotaPorDisciplina(String nome, String disciplina,
            double nota1, double nota2, double nota3) {
        String sql = "insert into sistemadeensino.aluno values(null,?,?,?,?,?)";
        try {
            conn = banco_ensino.getConection();
            PreparedStatement stm = conn.prepareStatement(sql);

            stm.setString(1, nome);
            stm.setString(2, disciplina);
            stm.setDouble(3, nota1);
            stm.setDouble(4, nota2);
            stm.setDouble(5, nota3);
            stm.execute();
            System.out.println("Aluno, Disciplina e Notas inseridas com sucesso!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public HashMap<String,String> getNotaDisciplina(Aluno aluno){
//        String sql = "select "
//    }
    public ArrayList<Aluno> getNotasAlunoDisciplina() {
        ArrayList<Aluno> listaNotas = new ArrayList();
        ResultSet res;
        String sql = "select nome, disciplina, nota1, nota2, nota3 from aluno";
        int contador = 0;
        try {
            conn = banco_ensino.getConection();
            PreparedStatement stm = conn.prepareStatement(sql);
            res = stm.executeQuery();
            while (res.next()) {
                Aluno aluno = new Aluno();
                aluno.setNome(res.getString("nome"));
                aluno.setDisciplina(res.getString("disciplina"));
                aluno.setNota1(res.getDouble("nota1"));
                aluno.setNota2(res.getDouble("nota2"));
                aluno.setNota3(res.getDouble("nota3"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaNotas;
    }

    public void inserirDisciplina(Disciplina disciplina) {
        String sql = "insert into sistemadeensino.disciplina values (null,?)";
        try {
            conn = banco_ensino.getConection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1, disciplina.getNome());
            stm.execute();
            System.out.println("Disciplina " + disciplina.getNome() + " Cadastrada com Sucesso!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void closeConection() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
