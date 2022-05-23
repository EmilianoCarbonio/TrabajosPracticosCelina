import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner id = new Scanner(System.in);

        double a;
        double suma = 0;
        int contador, positivo = 0, negativo = 0;

        for (contador = 1; contador <= 10; contador++) {

            System.out.println("ingrese un numero a sumar");
            a = id.nextInt();
            suma = suma + a;
            if (a < 0) {
                negativo++;

            }
            if (a > 0) {
                positivo++;
            }
        }
        {

            System.out.println("la suma de los numeros es " + suma);
            System.out.println("la cantidad de numeros positivos son " + positivo);
            System.out.println("la cantidad de numeros negativos son " + negativo);
            
        }
        
        
        

    }


        
    }

