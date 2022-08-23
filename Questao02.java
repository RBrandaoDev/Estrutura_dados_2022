/*
Faça um programa que preencha uma matriz mat 3 x 4 de inteiros randômicos. 
Descobrir o maior e menor elemento da matriz. 
Exibir a matriz (use a tabulação) e também o menor e maior elemento.
 */
package Tarefa01;
import java.util.Random;


public class Questao02 {
    public static void main(String[] args) {
        Random numrandomico = new Random();
        
        int[][] matriz = new int[3][4];
            
            for(int linhas=0;linhas<3;linhas++){
                for(int cols=0;cols<4;cols++){	
                    
                    matriz[linhas][cols] = numrandomico.nextInt(100);
                    
                    System.out.printf("%d\t",matriz[linhas][cols]);  
                }
                
                System.out.printf("\n");
        }    
            
                int maxValue= Integer.MIN_VALUE; 
                int minValue = Integer.MAX_VALUE;
                
                 for(int linhas=0;linhas<3;linhas++){
                     for(int cols=0;cols<4;cols++){
                         
                        if (matriz[linhas][cols]>maxValue)	
                                maxValue=matriz[linhas][cols];
                        
                        if (matriz[linhas][cols]<minValue)	
                               minValue=matriz[linhas][cols];
                    }
                }
                 
                 System.out.println("O maior valor � " + maxValue);
                 System.out.println("O menor valor � " + minValue);
    
    }
}
