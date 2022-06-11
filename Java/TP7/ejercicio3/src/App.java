
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        long suma = 0L;
        int numero1 = 20, numero2 =100;
        double producto = 1;
    
        for (int i = numero1; i <= numero2; i++){
            if (i % 2 == 0) {
                suma += i;
                producto *= i;
            }
        }
        System.out.println("la suma de los numero es " + suma);
            System.out.println("la multiplicacion de los numeros es "+ producto);

        
    entrada.close();
    }
    
}