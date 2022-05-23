import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner fe = new Scanner(System.in);

        double a, b, c, suma, producto;

        System.out.println("Ingrese el primer valor ");
        a = fe.nextDouble();

        System.out.println("Ingrse el segundo valor ");
        b = fe.nextDouble();

        System.out.println("Ingrese el tercer valor ");
        c = fe.nextDouble();

        suma = a + b + c;

        producto = a * b * c;

        if (a < 0) {
            System.out.println("El resultado de la suma es " + suma);
        } else {
            System.out.println("El resultado del producto es " + producto);
        }

     fe.close();

    }
}
