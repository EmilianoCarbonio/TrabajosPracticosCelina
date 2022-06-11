import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner num = new Scanner(System.in);
        String usuario, contraseña, user = "Emiliano", password = "Carbonio"; 
        do {
        System.out.println("Ingrese el usuario ");
        usuario =  num.nextLine();
        System.out.println("Ingrese la contraseña ");
        contraseña = num.nextLine();

        if  (usuario.equals(user) && contraseña.equals(password)){

          System.out.println("ha Ingresado con exito ");
        } else {
           System.out.println("su contraseña o usuario es incorrecto ");
        }
       } while (!usuario.equals(user) && !contraseña.equals(password)); 
        
        
         
  
        num.close();
      
        
      } 
    }

