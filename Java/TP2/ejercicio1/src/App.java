import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        float a, b, c;

        Scanner sd = new Scanner(System.in);
        

        System.out.println("Ingrese el primer valor");
        a = sd.nextFloat();
        
        System.out.println("Ingrese el segundo valor");
        b = sd.nextFloat();
        System.out.println("Ha ingrasado los siguientes valores a="+a+ "b= "+b);

        c = a + b;

        b = c - b;

        a = c - a;
        System.out.println("los valores intercambiados de a= "+a+" y los de b= "+b);



        sd.close();
        
    }
}
