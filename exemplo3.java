
import java.util.Scanner;

/* FAZER UM PRORAMA LER UM NÚMERO INTEIRO POSITIVO N ( máximo = 10), depois ler N números quaisquer e armazená-los em um vetor. Em seguida, mostrar na tela todos elemntos do vetor*/

public class exemplo3{
     
     public static void main(String[] args) {
          
          Scanner scn = new Scanner (System.in);

          
          
          int [] vetordenumero = new int[0-10];
          
          

          int p = 1;

          System.out.println("QUANTOS NÚMEROS VOCÊ VAI DIGITAR ?");
          p = scn.nextInt();

               for(int i = 0 ; i < p; i++){

               System.out.println("DIGITE UM NÚMERO:");
                   vetordenumero [i] = scn.nextInt();

               }


               for(int cont = 0; cont <= p; cont++){

                     System.out.println(vetordenumero[cont]);
                    
                    System.out.println(" os numeros digitados foram " + cont);
                    
               }
          }
     }
