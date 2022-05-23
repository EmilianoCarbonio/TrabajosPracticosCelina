import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner valor = new Scanner(System.in);
        System.out.println("Calculo de valores");

        float num1, num2, multiplicacion, division, suma, resta;
    
        System.out.println("ingrese el primer numero ");
        num1 = valor.nextFloat();
        
        System.out.println("ingrese el segundo valor ");
        num2 = valor.nextFloat();

        multiplicacion = num1 * num2;
        
        division = num1 / num2;

        suma = num1 + num2;

        resta = num1 - num2;

        System.out.println("La multiplicacion de estos dos numeros es " + multiplicacion);
        
        System.out.println("La division de estos dos numeros es " + division);

        System.out.println("La suma de estos numeros es " + suma);

        System.out.println("La resta de estos numeros es " + resta);

        valor.close();
     

       

    }
}
