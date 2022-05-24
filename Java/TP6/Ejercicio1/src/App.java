import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner in = new Scanner(System.in);

        int a = 0;
        
        do {
            
          System.out.println("ingrese un numero del 1 al 999 ");
          a = in.nextInt();
          if (a >= 100) {
              System.out.println("tiene tres digitos ");
          
          } else { 
              if (a >= 10) {
                  System.out.println("tiene dos digitos ");
                
              } else {
                  System.out.println("tiene un digito ");
              }

          }
         


        }while ( a != 0);
        System.out.println(" el programa se finalizo " );



     in.close();
    }
}
