/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.serprojava;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author willians
 */
public class Ordenacoes_Buscas {

    public ArrayList<Integer> ordenacaoBolha(ArrayList<Integer> listaNumeros) {
        for (int i = 0; i < listaNumeros.size(); i++) {
            for (int j = 0; j < listaNumeros.size() - 1; j++) {
                if (listaNumeros.get(j) > listaNumeros.get(j + 1)) {
                    int aux = listaNumeros.get(j);
                    listaNumeros.set(j, listaNumeros.get(j + 1));
                    listaNumeros.set(j + 1, aux);
                }
            }
        }
        return listaNumeros;
    }

    public String buscaSequencial(ArrayList<Integer> listaNumeros, int elementoBuscado) {
        int tamanhoLista = listaNumeros.size();
        for (int i = 0; i < tamanhoLista; i++) {
            if (elementoBuscado == listaNumeros.get(i)) {
                return "Existe! Indice " + i;
            }
        }
        return "Inexistente na Lista!";
    }

//    public boolean hasPalindro(String palavra) {
//        List<String> listaDeLetras_1 = new ArrayList<>();
//        List<String> listaDeLetras_2 = new ArrayList<>();
//
//        for (int i = palavra.length(); i > 0; i--) {
//            listaDeLetras_1.add(palavra.substring(i - 1, i).toUpperCase());
//        }
//        for (int i = 0; i < palavra.length(); i++) {
//            listaDeLetras_2.add(palavra.substring(i, i + 1).toUpperCase());
//        }
//        if(listaDeLetras_1.equals(listaDeLetras_2)){
//            return true;
//        }else {
//            return false;
//        }
//    }
    
    public boolean eUmPalindromo(String palavra){
        List<String> listaDeLetras = new ArrayList<>();

        for(int i = 0; i < palavra.length(); i++) {
            listaDeLetras.add(palavra.substring(i, i + 1).toUpperCase());
        }
        int contaLetrasIguais = 0;
        int tamanhoListaLetras = listaDeLetras.size();
        for (int i = 0; i < listaDeLetras.size(); i++) {
            if (listaDeLetras.get(i).equals(listaDeLetras.get(tamanhoListaLetras - 1))) {
                contaLetrasIguais++;
                tamanhoListaLetras--;
            }
        }
        if(contaLetrasIguais == listaDeLetras.size()) {
            return true;
        } else {
            return false;
        }
    }
}
