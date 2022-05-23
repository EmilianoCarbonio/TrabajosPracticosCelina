import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Suma de Enteros");

        Scanner valor = new Scanner(System.in);

        System.out.println("ingresar primer valor a sumar");

        int num1 = valor.nextInt();

        System.out.println("ingresar segundo valor a sumar");
        int num2 = valor.nextInt();

        int resultado = num1 + num2;
        System.out.println("el resultado es: " + resultado);
     valor.close();
    }

}
