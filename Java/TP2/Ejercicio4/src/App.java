import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner and = new Scanner(System.in);

        int a, b, c;

        System.out.println("Ingrese el primer numero ");
        a = and.nextInt();

        System.out.println("ingrese el segundo numero ");
        b = and.nextInt();

        System.out.println("ingrese el tercer numero ");
        c = and.nextInt();

        if (a > b && a > c) {
            System.out.println("El primer numero ingresado es el mayor " + a);
        } else if ( b > a && b > c) {
            System.out.println("El segundo numero ingresado es el mayor " + b);
        } else {
            System.out.println("El tercer numero ingresado es el mayor " + c);
        }
        and.close();
        }
        }
        
    

