import java.util.Random;
import java.util.Scanner;

public class exemcontagemdevetor {
     public static void main(String[] args) {
         
        Scanner scn = new Scanner(System.in);
 
                  // Criação do vetor com 9 elementos
                  int[] vet = new int[9];
                  
                  // Criando um objeto Random para gerar números aleatórios
                  Random random = new Random();
                  
                  // Sorteando e preenchendo o vetor
                  for (int p = 0; p < vet.length; p++) {
                      vet[p] = random.nextInt(10) + 1; // Gera um número aleatório entre 1 e 10
                  }
                  
                  // Exibindo os valores sorteados
                  System.out.print("Os valores sorteados são: ");
                  for (int p = 0; p < vet.length; p++) {
                      System.out.print(vet[p] + " --> ");
                  }
                  System.out.println("fim!\n");

                  int chave,tot = 0;
                  System.out.println("ESTÁ PROUCURANDO POR QUAL VALOR ?");
                  chave = scn.nextInt();
                  System.out.println("Proucurando pela " + chave + "...");
                  
                  for ( int p = 0; p < vet.length; p++){
                    if(vet[p] == chave) {
                        System.out.println(" achado na posição " + p);
                        tot++;
                    }
                  }
                  if ( tot == 0 ){
                    System.out.println(" O VALOR " + chave + "NÃO FOI ENCONTRADO DENTRO DO VETOR\n");
                  }else{

                      System.out.println(" O VALOR " + chave + " FOI ENCONTRADO " + tot + " VEZES\n");
                  }
              }
          }
           