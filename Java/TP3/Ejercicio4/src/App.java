import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner nr = new Scanner(System.in);

        float num1 = 0, suma = 0;

        for (int i = 1; i <= 4; i++) {  //la primer parta declara la variable y iguala a 1, en la segunda le da el limite a calcular, y la ultima parte es para que se incremente sumando de a 1
            System.out.println("ingrese el valor " + i);
            num1 = nr.nextFloat();
            suma = suma + num1;
        }

            System.out.println("el promedio de los 4 numeros es: " + suma / 4.0);
            
            nr.close();
        }
        

       
    }

