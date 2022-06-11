import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        String fruta;

        System.out.println("ingrese el nombre de la fruta ");
        fruta = entrada.nextLine();
        System.out.println("el nombre de la fruta que ingreso es ");
        
        for (int num1 = 1; num1 <=10; num1++){
            System.out.println(fruta);
        }
        entrada.close();
    }
}
