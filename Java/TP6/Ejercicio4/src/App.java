import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("iniciando contador ");
        Scanner real = new Scanner(System.in);
        // imprima por pantalla los numeros del 0 al 100
        // se compone por 3 partes
        for (int num = 0; num <= 100; num++)
        System.out.println(num);
        
        real.close();


        
    }
}
