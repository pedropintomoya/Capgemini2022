import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
public class TerceiroDesafio{
    public static void resposta(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Escreva uma palavra ");

        String palavra = scan.nextLine();
        int resposta = quantosAnagramas(palavra);
        System.out.println(resposta);
        
    }
    
    /*Faz as contas de quantos anagramas conseguimos achar na palavra*/
    public static int quantosAnagramas(String palavra){
        ArrayList<String> possiveisArrays = repartirPalavra(palavra);
        int anagramas = 0;
        /*Por usar uma lista na etapa de repartir a palavra, precisei atribuir a */
        String[] stringArrays = possiveisArrays.toArray(new String[possiveisArrays.size()]);
        ArrayList<String> respostasAchadas = new ArrayList<>();
        for(int i = 0; i < stringArrays.length; i++){
            for(int j = 1; j < stringArrays.length; j++){
                /*
                O primeiro teste checa se as subpalavras que estamos testando tem o mesmo tamanho.
                O segundo teste avalia se eu ele esta atualmente vendo o mesmo elemento duas vezes
                O terceiro e quarto testes procuram na lista respostasAchadas para ter certeza que nao estou vendo o subpalavras que ja passei e contei como anagramas
                */
                if(stringArrays[i].length() == stringArrays[j].length() && i != j && !respostasAchadas.contains(stringArrays[i]) && !respostasAchadas.contains(stringArrays[j])){
                    if(checkAnagrama(stringArrays[i], stringArrays[j])){
                        anagramas++;
                        respostasAchadas.add(stringArrays[i]);
                        respostasAchadas.add(stringArrays[j]);
                    }  
                }  
            }
        }
        return anagramas;   
    }
    /*Esta funcao dividi a palavra em todas as possiveis subpalavras que queremos testar para checarmos a existencia de anagramas*/
    public static ArrayList repartirPalavra(String palavra){
        int tamanhoPalavra = palavra.length();
        ArrayList<String> possiveisArrays = new ArrayList<>();
        for(int i = 1; i < tamanhoPalavra; i++){
            for(int j = 0; j < tamanhoPalavra; j++){
                if (i + j <= tamanhoPalavra){
                    possiveisArrays.add(palavra.substring(j,j+i));
                }
            }
        }
        return possiveisArrays;
    }
    /*Checa se duas palavras sao anagramas*/
    public static boolean checkAnagrama(String palavra1, String palavra2){
        char[] word1 = palavra1.replaceAll("[\\s]", "").toCharArray();
        char[] word2 = palavra2.replaceAll("[\\s]", "").toCharArray();
        Arrays.sort(word1);
        Arrays.sort(word2);
        return Arrays.equals(word1, word2);
    }
}