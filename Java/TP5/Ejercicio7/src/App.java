import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner lin = new Scanner(System.in);
        
        int nota;
        System.out.println("ingrese su nota");
        nota = lin.nextInt();
        switch (nota) {
            case 1:
                System.out.println("suspenso");
                break;
            case 2:
                System.out.println("suspenso ");
                break;
            case 3:
                System.out.println("suspenso ");
                break;

            case 4:
                System.out.println("suspenso ");
                break;

            case 5:
                System.out.println("suficiente ");
                break;

            case 6:
                System.out.println("bien ");
                break;
            case 7:
                System.out.println("notable bajo ");
                break;
            case 8:
                System.out.println("notable alto ");
                break;
            case 9:
                System.out.println("sobresaliente ");
                break;
            case 10:
                System.out.println("matriculado de honor ");
                break;
            case 11:
                System.out.println("nota superior ");
                break;
                

        }
        lin.close();
        
        }

    }

