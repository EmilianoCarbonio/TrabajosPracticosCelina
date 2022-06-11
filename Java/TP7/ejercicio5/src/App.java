import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.TimeZone;

import javax.sound.sampled.SourceDataLine;

public class App {
    private static final String quot = null;

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner nb = new Scanner(System.in);
        int anio, mes, dia;
    
    String letraD= quot;
    System.out.println("ingrese un numero de año ");
    anio= nb.nextInt();
    System.out.println("ingrese un numero de mes ");
    mes = nb.nextInt();

    System.out.println("ingrese un numero de dia ");
    dia= nb.nextInt();

     TimeZone timezone = TimeZone.getDefault();
     Calendar calendar = new GregorianCalendar(timezone);
     calendar.set(anio, mes-1, dia);
     int nD=calendar.get(Calendar.DAY_OF_WEEK);
     System.out.println("resultado: \nSemana:"+nD + "\nDia: "+dia+"\nMes: "+mes+"\nAño: " +anio);
    switch (nD){
    case 1: letraD = "lunes" ;;
    break;
    case 2: letraD = "martes";;
    break;
    case 3: letraD = "miercoles";;                                 
    break;
    case 4: letraD = "jueves";;
    break;
    case 5: letraD = "viernes";;
    break;
    case 6: letraD = "sabado";;
    break;
    case 7: letraD = "domingo";;
    break;
}
    }
}