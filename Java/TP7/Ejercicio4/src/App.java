import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
        Scanner fv = new Scanner(System.in);
        int numero = 100;
        while (numero >= 1) {

            System.out.println(numero);
            numero--;
        }

        do {
            System.out.println(numero);
            numero--;

        } while (numero >= 1);
        
        for (numero = 100; numero >= 1; numero--)
            System.out.println(numero);

        
       
    }
}
