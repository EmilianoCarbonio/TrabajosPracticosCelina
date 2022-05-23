import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner logea = new Scanner(System.in);
        String usuario, user = "Emiliano", contraseña, password = "Carbonio";

        System.out.println("Ingese usuario");
        usuario = logea.nextLine();

        System.out.println("Ingrese contraseña");
        contraseña = logea.nextLine();

        if (usuario.equals(user) && contraseña.equals(password))
            System.out.println("Ha ingresado al sistema su usuario y contrasseña son correctos");
        else {
            System.out.println("Ingreso usuario o contraseña incorrectos");

        }
        logea.close();
    }

    
}
