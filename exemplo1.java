
import java.util.Scanner;

public class exemplo1 {

     public static void main(String[] args) {
          
          Scanner scn = new Scanner(System.in);

                  
        int idade [] = new int[4];

        for (int pos = 0; pos < 4; pos++){

          System.out.println("DIGITE UMA IDADE:");
          idade [pos] = scn.nextInt();
          
      }

          for (int pos = 0; pos < 4; pos++){
               
   
               System.out.println("AS IDADES DIGITADAS FORAM:" + idade[pos]);
               System.out.println( );
               
               }
               System.out.println("FIM\n");
          }
     }
 