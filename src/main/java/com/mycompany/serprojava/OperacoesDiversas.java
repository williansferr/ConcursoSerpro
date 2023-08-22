/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.serprojava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import com.mycompany.serprojava.Analista;

/**
 *
 * @author willians
 */
public class OperacoesDiversas {

    public OperacoesDiversas() {
    }

    //Ordenar por meio de uma lista simples de String
    public String[] ordemCrescente(String[] lista) {
//    StringBuilder sb = new StringBuilder(lista[0]);
//    ArrayList<String> listaPalavras = new ArrayList<String>();
        int tamanhoLista = lista.length;
//    String[] newLista = new String[5];
        Arrays.sort(lista);
        for (int i = 0; i < tamanhoLista; i++) {
            for (int j = 1; j < tamanhoLista; j++) {
//            if(lista[i].compareTo(lista[j])){

            }
        }
        return lista;
    }

    //ordenar por meio de um ArrayList
    public ArrayList<String> ordemCrescente(ArrayList<String> lista) {
        Collections.sort(lista);
        return lista;
    }

    //buscar a palavra em meio ao texto também passado como parametro
    public void filtrarQndPalavrasExistem(String palavraPesquisada, String textoCompleto) {
        int index = textoCompleto.indexOf(palavraPesquisada);
        if (textoCompleto.indexOf(palavraPesquisada) != 0) {
            System.out.println("Palavra Encontrada na sequencia: '"
                    + textoCompleto.substring(index, palavraPesquisada.length() + 5) + "'");
        }
//        return textoCompleto.toLowerCase().indexOf(palavraPesquisada.toLowerCase());
    }

    //Verifica se o numero é Par ou Impar
    public String isParOrImpar(double numero) {
        if (numero % 2 == 0) {
            return "PAR";
        } else {
            return "IMPAR";
        }
    }
    
    public void validarCPF(String cpf){
        int total = 0;
        String[] cpfLista = cpf.split("");
        int cont = 10;
        for(int i = 0; i < cpfLista.length-2; i++){
            System.out.println(Integer.parseInt(cpfLista[i])+" x "+cont);
            total += Integer.parseInt(cpfLista[i])*cont;
            cont--;
        }
        System.out.println(total);
    }
    
    
    
}
