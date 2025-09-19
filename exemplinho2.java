
import java.util.Scanner;

public class exemplinho2 {
     public static void main(String[] args) {
         
          Scanner scn = new Scanner(System.in);

          int idade [] = new int[4];
          for(int pos = 0; pos < idade.length; pos++){
               System.out.println("digite uma idade");
               idade[pos]= scn.nextInt();
          }
          
          System.out.println("As idades digitadas foram");
          for(int pos = 0; pos < idade.length; pos++){
               System.out.println(idade[pos]);
          }

          System.out.println("FIM");
     }
}



