import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner n = new Scanner(System.in);
        
        float convertidor, grados;

        System.out.println("ingrese la cantidad de grados a convertir ");
        grados = n.nextFloat();
        
        convertidor = grados = 32 + (9 * grados / 5);
        System.out.println("los grados convertidos a Fahrenheit son: " + convertidor);


     n.close();
        
    }
}
