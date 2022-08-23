/*
 Entrar com um vetor randômico de 50 posições. Implementar o método de ordenação da Bolha – Bubble Sort
(https://www.devmedia.com.br/entendendo-o-algoritmo-bubble-sort-em-java/24812)
Realizar a rotina de busca de um elemento no vetor – método de pesquisa Binária
 */
package Tarefa01;


import java.util.Random;
import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        int[] vetor = new int[50];
        
        Random numrandomico = new Random();
        
        // Criando Vetor Randomico "desordenado"
        for(int i = 0; i < vetor.length; i++){
             vetor[i]= numrandomico.nextInt(999);
            System.out.println(vetor[i]);      
        }
        
        // Implementado o método (Bubble Sort) Organizando vetor
        int aux;
        for(int i = 0; i < vetor.length; i++){ 
            for(int j = i + 1; j < vetor.length; j++){ 
                if (vetor[i] > vetor[j]){
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                }
            }
        }
        
        // Imprimindo vetor Organizado 
        System.out.println("Vetor ordenado");
        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }   
        
        // Informando número desejado
        System.out.println("Qual número vc busca?");
        Scanner leitor = new Scanner(System.in);
        int buscado = leitor.nextInt();
        
        // Validação Variavel "achou" e criando variaveis de inicio,meio e fim.
        boolean achou = false;
        int inicio = 0;
        int fim = vetor.length - 1;
        int meio;
        while(inicio <= fim){
            meio = (int) ((inicio + fim) / 2);
            
            // Buscando número desejado
            if (vetor[meio] == buscado){
                achou = true;
                break;
            }else if (vetor[meio] < buscado){
                inicio = meio + 1;
            }else{ //só pode ser maior
                fim = meio - 1;
            }
        }
        // retorno da validação do número buscado
        if (achou == true){
            System.out.println("Achou");
        }else{
            System.out.println("Não achou");
        }
    }
}