
import java.util.Scanner;


public class exemplinho1 {
     public static void main(String[] args) {
         
          Scanner scn = new Scanner(System.in);

          int [] idade = new int [4];
          
          for(int pos = 0; pos < idade.length;pos++){

               System.err.println("digite uma idade");
               idade[pos] = scn.nextInt();
               
          }
          
          System.out.println("AS IDADES DIGITADAS FORAM:");
          for(int pos = 0; pos < 4; pos++){
               System.out.println(idade[pos]);

          }
                
                System.out.println("fim"); 
     
          
          
     }
}
