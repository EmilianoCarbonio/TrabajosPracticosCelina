import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner lm = new Scanner(System.in);

        int multiplicacion = 1, num1, num2;

        System.out.println("ingrese un numero que desee multiplicar ");
        num1 = lm.nextInt();

        System.out.println("ingrese hasta que numero quiere multiplicarlo ");
        num2 = lm.nextInt();

        while (multiplicacion <= num2)
        {
            System.out.println(num1 + " x " + multiplicacion + " = " + num1 * multiplicacion);
            multiplicacion++;

        }    
        

        lm.close();
    }
}
