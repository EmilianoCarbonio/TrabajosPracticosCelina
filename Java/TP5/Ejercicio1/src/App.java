import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner in = new Scanner(System.in);

        int num1, num2;

        do{
        
         System.out.println("Ingrese el primer valor ");
            num1 = in.nextInt();
        
         System.out.println("Ingrese el sundo valor");
            num2 = in.nextInt();

        } while (num1 != num2);
         System.out.println("los valores ingresados son iguales ");

         in.close();

    }
}
