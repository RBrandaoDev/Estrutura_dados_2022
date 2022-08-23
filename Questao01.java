/*
Busca Sequencial: Fazer um programa que insira 10 valores inteiros randômicos
em um vetor, mostre o vetor e busque um determinado elemento (mostrar a 
posição que encontrou). Caso não exista imprimir mensagem de não localizado.
 */
package Tarefa01;

import java.util.Random;
import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);      
        
        int vetor[] = new int[10];
        int aux;
        
        Random numrandomico = new Random();
        
        for ( int i = 0; i < 10; i++){
            vetor[i]= numrandomico.nextInt(50);
            System.out.println("indice do vetor: " + i + " Valor do Vetor:" + vetor[i]);
        }    
        
         System.out.println("Entre com o número até 50, para ser localizado");
         int numDigitado = ler.nextInt();
         
         boolean encontrou = false;
         int i;
         for ( i=0; i< vetor.length; i++){
             int elementoVetor = vetor[i];
             
            if (elementoVetor == numDigitado){
                encontrou = true;
                break;
            }   
        }   
         
            if (encontrou == true){
               System.out.println("Numero encontrado:" + numDigitado + " na posição:" + i ); 
           
           }else{
               System.out.println("número não encontrado");
           }  
    }  
}
