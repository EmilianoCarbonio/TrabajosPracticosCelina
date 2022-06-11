import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner fr = new Scanner(System.in);
        int num1;

        System.out.println("Ingrese un numero");
        num1 = fr.nextInt();
        System.out.println("los numeros son los siguientes ");
        while (num1 <= 20) {
            System.out.println(num1);
            num1++;
        }
        fr.close();

    }
}
