import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner cs = new Scanner (System.in);
       
        int a;
        int contador = 0;
        int suma = 0;

        do {

            System.out.println("ingrese un numero ");
            a = cs.nextInt();
            contador++;
            suma = a + suma;
        } 
        
        while (contador <= 10);
        System.out.println("la suma de todos los numeros es " + suma);

        cs.close();
        
    }
}
