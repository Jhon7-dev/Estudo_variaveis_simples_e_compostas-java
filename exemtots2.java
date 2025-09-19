
import java.util.Random;
import java.util.Scanner;

public class exemtots2 {
     public static void main(String[] args) {
         
          Random random = new Random();
          
          Scanner scn = new Scanner (System.in);

          int [] vet = new int [9];

          // GERA NÚMERO PARA OS VETORES

          for(int p = 0;p < vet.length;p++){

               vet[p]=random.nextInt(1,10);
          }

          // MOSTRAR O VETOR NA TELA 

          System.out.println(" O VETOR GERADO FOI : ");
          for (int p = 0; p < vet.length; p++){

               System.out.println( vet[p] );

          }

          System.out.println("FIM\n");
          System.out.println("QUER SOMAR ACIMA DE QUAL VALOR ?");
          int chave, soma = 0;
          chave = scn.nextInt();

          // RESULTADOS 

          for(int p = 0; p < vet.length; p++){
               
               if (vet[p] >= chave){
                   
                    
                    soma = soma + vet[p];
                    
               }

          }
          System.out.println("A SOMA DE TODOS OS VALORES É IGUAL A " + soma);
     }
     
}
