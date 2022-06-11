import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner fr = new Scanner(System.in);
        float edad1 , edad2, promedio = 0, suma = 0;
        do{
            System.out.println("ingrese una edad ");
            edad1 = fr.nextFloat();
            System.out.println("ingrese una segunda edad ");
            edad2 = fr.nextFloat();
            suma = edad2 + edad1;
            promedio = suma / 2;
               
            System.out.println("la suma de las edades es " + suma +"\n el promedio de las edades es " + promedio);
            
        } while (promedio <= 25);
        {
            System.out.println("su promedio es mayor a 25");
        }   
       fr.close();
    }
}
