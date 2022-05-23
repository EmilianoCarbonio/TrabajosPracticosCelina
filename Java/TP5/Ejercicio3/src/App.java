import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner fr = new Scanner(System.in);

        int a;
        int contador = 1;
        int suma = 0;
        for (contador = 1; contador <= 10; contador++) {
            System.out.println("ingrese un numero" + contador + "a sumar");
            a = fr.nextInt();
            suma = suma + a;
        }
        System.out.println("la suma de todos los numeros es " + suma);
        
    }
     
}
