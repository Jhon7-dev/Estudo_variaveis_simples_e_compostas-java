
public class exemtotsl {
     public static void main(String[] args) {
         
          int chave = 15;
          int soma = 0;
          int [] vet = { 11,15,9,12,15,32,20,15,10};

          for (int p = 0; p < 9; p ++){

               if(vet[p] >= chave){

                    soma = soma + vet[p];
                    
               }
          }
               System.out.println("SOMA É " + soma);
     }
}