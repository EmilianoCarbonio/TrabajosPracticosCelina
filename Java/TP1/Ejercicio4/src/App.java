import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el monto de la compra");
        float contado, descuento;
        int ct;
        contado = teclado.nextFloat();
        System.out.println("ingrese la forma de pago 1_contado 2_tarjeta ");
        ct= teclado.nextInt();
        if (ct== 1){
            descuento = contado - (contado * 10 / 100);
            System.out.println("El monto con descuento es :" + descuento);
        }else if (ct != 1 && ct !=2) {
            System.out.println("el numero ingresado es incorrecto ");
        }else {
            System.out.println("El monto a pagar es: " + contado);
        }
        {
        }
        teclado.close();
       

}
}

