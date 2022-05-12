import java.util.Scanner;

public class CidadesDDD {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      if(a == 61){
          System.out.printf("Brasilia\n");
      }
      else if(a == 71){
          System.out.printf("Salvador\n");
      }
      else if(a == 11){
          System.out.printf("Sao Paulo\n");
      }
       else if(a == 21){
          System.out.printf("Rio de Janeiro\n");
      }
       else if(a == 32){
          System.out.printf("Juiz de Fora\n");
      }
       else if(a == 19){
          System.out.printf("Campinas");
      }
       else if(a == 27){
          System.out.printf("Vitoria");
      }
       else if(a == 31){
          System.out.printf("Belo Horizonte\n");
      }
       else{
           System.out.printf("DDD nao cadastrado\n");
       }
      sc.close();
    }  
}