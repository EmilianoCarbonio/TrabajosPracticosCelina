import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        double a;
        double suma = 0;
        int contador = 1, positivo = 0, negativo = 0;

        Scanner id = new Scanner(System.in);

        do {

         System.out.println("ingrese un numero ");
         a = id.nextDouble();
         contador++;
         suma = suma + a;
         if (a < 0) {
             negativo++;

         }
         if (a > 0) {
             positivo++;
         }


        } while (contador <= 10);
      System.out.println("la suma de todos los numeros es " + suma);
      
      System.out.println("los numeros positivos ingresados son " + positivo);
      System.out.println("los numeros negativos ingrresados son " + negativo);
    id.close(); 
    }
}
