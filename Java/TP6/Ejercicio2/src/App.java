import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner entrada = new Scanner(System.in);

        int nota, mayores = 0, menores = 0;
        
        do {
            System.out.println("ingrese una nota ");
            nota = entrada.nextInt();
            if (nota >= 7) {
            mayores++;
        }else
            menores++;
           
        } while (nota != 0); {
        
        System.out.println("la cantidad de notas mayores son " +mayores+ "\nla cantidad de notas menores son " + menores);
        }
        entrada.close();
        }
        
    
}
