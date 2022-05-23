import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola, cree su cuenta ");

        String usuario, contrasena, usuarioIngresado, contrasenaIngresada;

        Scanner ing = new Scanner(System.in);

        System.out.println("Ingrese el usuario que desea ");
        usuario = ing.nextLine();
        System.out.println("Utilice una contraseña ");
        contrasena = ing.nextLine();
        System.out.println("Su cuenta a sido creada con exito");

        System.out.println("Entrar ");
        System.out.println("ingresar usuario");
        usuarioIngresado = ing.nextLine();

        if (usuario.equals(usuarioIngresado)) {
            System.out.println("ingresar contraseña");
            contrasenaIngresada = ing.nextLine();
            if (contrasena.equals(contrasenaIngresada)) {
                System.out.println("se inicio sesion correctamente");
            } else {
                System.out.println("no se pudo iniciar sesion por contraseña incorrecta");
            }
        } else {
            System.out.println("usuario inexistente ");
        }
        ing.close();
     
    }

}
