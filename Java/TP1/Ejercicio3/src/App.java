import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Aula de clases");
        int alumnos, bancos, resultado;

        Scanner resta = new Scanner(System.in);

        System.out.println("ingrese la cantidad de alumnos");

        alumnos = resta.nextInt();

        System.out.println("ingerese la cantidad de bancos");

        bancos = resta.nextInt();

        if (bancos >= alumnos) {
            System.out.println("En esta aula se puede dictar clases");
        } else {
            resultado = alumnos - bancos;
            System.out.println(
                    "En esta aula no se puede dictar clases porque la cantidad de bancos que falta es " + resultado);
        }
        resta.close();
     
    }
}