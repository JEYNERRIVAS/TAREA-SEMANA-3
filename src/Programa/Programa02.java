
package Programa;
import java.util.Scanner;
public class Programa02 {
    public static void main(String[]args){
        // declarar variables
        int edad;
        String mensaje;
        Scanner lectura=new Scanner(System.in);
        // ingreso de datos
        System.out.print("ingrese la edad de la persona : ");
        edad=lectura.nextInt();
        // proceso de datos
        if (edad>=18){
            mensaje="Es mayor de edad";
        }else{
            mensaje="Es menor de edad";
        }
            // salida de datos
            System.out.println(mensaje);
        
    }
        
}
    

