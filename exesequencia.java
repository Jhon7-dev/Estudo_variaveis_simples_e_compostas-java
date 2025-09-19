 
import java.util.Scanner;

public class exesequencia {
     public static void main(String[] args) {
         
     /*   int chave = 3;
       int [] num = new int [5];

          num[0] = 7;
          num[1] = 5;
          num[3] = 3;
          num[4] = 6;

       for(int p = 0; p < 5; p++){
          
          if (num[p] == chave){
               System.out.println("POS:" + p);
               System.out.println("HIT!");
          }
       }

       */

      
      Scanner scn = new Scanner(System.in);

       
       int [] num = {2,5,7,3,2,9,4,2};
       boolean achei = false;
       int chave;
       Character  opcao = 0;


       
       System.out.println("QUAL É A CHAVE?");
       chave = scn.nextInt();
        
       

    

      for (int p = 0; p < num.length; p ++){
          
         if (num[p] == chave){

         System.out.println("\nencontrei a chave na posição " + p);
         achei = true;
         
        }        
      }

      if(!achei){

         System.out.println("Infelizmente a chave " + chave + " não se encontra no vetor");
         

 
      
      }
   
       }    
  }

  