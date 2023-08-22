/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.serprojava;

/**
 *
 * @author willians
 */
public class Analista extends Servidor {

    public Analista(String nome, long chapa, String endereco, double salario) {
        super(nome, chapa, endereco, salario);
    }

    @Override
    public long getChapa(){
        return super.getChapa();
    }

    @Override
    public String getNome() {
        return super.getNome(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
