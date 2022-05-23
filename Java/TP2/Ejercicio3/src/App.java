import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner valor = new Scanner (System.in);
        System.out.println("Valor mayor");

        int a, b;

        System.out.println("ingresa el primer numero ");

        a = valor.nextInt();

        System.out.println("ingresa el segundo numero ");

        b = valor.nextInt();

        if (a == b) {
            System.out.println(" Los numeros ingresados son iguales ");
        
        } else if (a > b) {
            System.out.println("El primer numero ingresado es mayor que el segundo " + a);
            }else { 
            System.out.println("El segundo numero ingresado es mayor que el primero " + b);

         valor.close();
          
            }
        }
    }

    

