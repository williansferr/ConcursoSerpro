/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.serprojava;

/**
 *
 * @author willians
 */
public class Servidor {
    private String nome;
    private long chapa;
    private String endereco;
    private double salario;

    Servidor( String nome,long chapa, String endereco,double salario){
        this.nome = nome;
        this.chapa = chapa;
        this.endereco = endereco;
        this.salario = salario;
        
    }
    
    Servidor( String nome,long chapa, String endereco){
        this.nome = nome;
        this.chapa = chapa;
        this.endereco = endereco;
        this.salario = salario;
        
    }
    
    public String getNome() {
        return nome;
    }

    public double getSalario(){
        return salario;
    }
    
    public long getChapa() {
        return chapa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setChapa(long chapa) {
        this.chapa = chapa;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEndereco() {
        return endereco;
    }
    
    public String toString(){
        return "Nome: " + getNome() + " Chapa: " + getChapa() + " Endereço: " + getEndereco();
    }
    
}
