/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.serprojava;

/**
 *
 * @author willians
 */
public class AuxiliarOperacional extends Servidor{
    
    AuxiliarOperacional(String nome, long chapa, String endereco, double salario){
        super(nome, chapa, endereco, salario);
    }

    public AuxiliarOperacional() {
        super(null, 0, null);
    }
    
    
    
    @Override
    public String getNome(){
        return super.getNome();
    }
    @Override
    public long getChapa(){
        return super.getChapa();
    }
    
    public String toStringAuxiliar(){
        return "Nome: " + getNome() +  " Chapa: " + getChapa();
        
    }
    
    public double getSalario(){
        return super.getSalario();
    }
    
}
