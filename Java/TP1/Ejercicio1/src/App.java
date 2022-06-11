import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Suma de Enteros");

        Scanner valor = new Scanner(System.in);

        System.out.println("ingresar primer valor a sumar");

        float num1 = valor.nextFloat();

        System.out.println("ingresar segundo valor a sumar");
        float num2 = valor.nextFloat();

        float resultado = num1 + num2;
        System.out.println("el resultado es: " + resultado);
     valor.close();
    }

}
