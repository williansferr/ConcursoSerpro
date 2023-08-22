package Testes;

import com.mycompany.serprojava.AuxiliarOperacional;
import SistemaDeEnsino.Aluno;
import SistemaDeEnsino.BancoSistemaDeEnsino;
import SistemaDeEnsino.BeanManagerSistemaEnsino;
import SistemaEstoqueRoupa.PecaRoupa;
import java.util.ArrayList;
import com.mycompany.serprojava.OperacoesDiversas;
import java.util.Scanner;

/**
 *
 * @author willians
 */
public class Teste {

    public static void main(String[] args) {
//        AuxiliarOperacional aux = new AuxiliarOperacional();
//        aux.setChapa(2302725);
//        aux.setEndereco("João Miguel Caram, 1075");
//        aux.setNome("Willians Ferreira da Silva");
//        System.out.println(aux.toStringAuxiliar());
//        Aluno aluno = new Aluno("Joao Miguel", "Geografia", 80,87,94);
//        ArrayList cloneListAluno = new ArrayList();
//        try {
//            BeanManagerSistemaEnsino sistema_ensino = new BeanManagerSistemaEnsino();
//            cloneListAluno = sistema_ensino.getNotasAlunoDisciplina();
//            sistema_ensino.closeConection();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        for (int i = 0; i < cloneListAluno.size(); i++) {
//            System.out.println(cloneListAluno.get(i));
//        }

        Scanner entrada = new Scanner(System.in);
        OperacoesDiversas opDiv = new OperacoesDiversas();

        String[] palavras = new String[5];
        ArrayList listaPalavras = new ArrayList();
        palavras[0] = "Camila";
        palavras[1] = "Willians";
        palavras[2] = "Bruno";
        palavras[3] = "Alves";
        palavras[4] = "Augusto";

//        System.out.println("Lista com 'String[]' Simples:"+"\n");
//        for(String linha : palavras){System.out.println(linha);}
//        System.out.println("\n");
//        
//        for(String cont : palavras){listaPalavras.add(cont);}
//        System.out.println("Lista com 'ArrayList':"+"\n");
//        for(Object cadaPalavra : listaPalavras){System.out.println(cadaPalavra);}
//        System.out.println("\n");
        System.out.println("METODOS ORDENAR ATIVADO:" + "\n");

        //TESTE ORDENAR PALAVRAS COM LISTA SIMPLES STRING []
//        String[] cloneListString = new String[5];
//        cloneListString = opDiv.ordemCrescente(palavras);
//        System.out.println("String []: ");
//        System.out.println("\n");
//        for(String linha : cloneListString){System.out.println(linha);}
//        System.out.println("\n");
        //TESTE ORDENAR PALAVRAS COM ARRAYLIST
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Digite uma palavra: ");
//            listaPalavras.add(entrada.nextLine());
//        }
//        entrada.close();
//        System.out.println(opDiv.ordemCrescente(listaPalavras).toString());
        String texto = "Há uma necessidade de fornecer um comparador externo em Java que ajudaria na classificação "
                + "de um Array em ordem decrescente. Isso pode ajudar a ordenação dos elementos na ordem inversa "
                + "e o bom é que nós temos que construir como java.util.Collections.reverseOrder().Isso vai ajudar "
                + "no retorno de um comparador de ordem inversa que é capaz de fornecer o reverso da ordem natural "
                + "dos objetos do elemento. Você poderia passar este comparador reverso a fim de classificar o método "
                + "e o ajudará na classificação do Array em ordem decrescente. Isso é ilustrado no exemplo de código "
                + "presente na última seção deste artigo. Uma das outras formas que poderiam ser usadas para "
                + "classificar o Array em ordem decrescente é converter Array em ArrayList e, em seguida, classificar o ArrayList.";
        ArrayList vetorTexto = new ArrayList();

//        Scanner palavraDigitada = new Scanner(System.in);
//        int numeroDigitado = Integer.parseInt(palavraDigitada.nextLine());
//        String palavraNova = palavraDigitada.nextLine();
        System.out.println("Digite qual palavra deseja buscar:");

//        opDiv.filtrarQndPalavrasExistem(palavraNova, texto);
//        System.out.println("Número "+opDiv.isParOrImpar(numeroDigitado));
        PecaRoupa pr = new PecaRoupa(0012, "Cueca", "Roupa de Baixo Masculina", 25, 50.90);
        System.out.println((pr.margemLucro()) + " % de Lucro");
//        System.out.print("Exitem "+opDiv.filtrarQndPalavrasExistem(palavraNova,texto)+" incidências de palavras '"
//                + palavraNova +"' neste texto!");
//        for (int i = 0; i < texto.length(); i++) {
//            System.out.println(texto.split(" "));
//            vetorTexto.add(i, texto.split(""));
//        }
//        for (int i = 0; i < vetorTexto.size(); i++) {
//            System.out.println(vetorTexto.get(i));
//        }
    }

}
