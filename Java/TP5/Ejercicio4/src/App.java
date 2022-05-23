import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner rp = new Scanner(System.in);
        int dia; 
        
       System.out.println("ingrese el numero de la semana ");
       dia = rp.nextInt();
       switch (dia) {
           case 1:
               System.out.println("lunes ");
               break;
           case 2:
               System.out.println("Martes ");
               break;
           case 3:
               System.out.println("miercoles ");
               break;

           case 4:
               System.out.println("jueves ");
               break;

           case 5:
               System.out.println("viernes ");
               break;

           case 6:
               System.out.println("sabado ");
               break;
           case 7:
               System.out.println("domingo ");
               break;
           default:
               System.out.println("es un numero no valido ");
               break;
       }
       rp.close();
    }

   
    }
