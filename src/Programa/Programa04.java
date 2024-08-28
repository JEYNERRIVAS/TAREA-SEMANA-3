
package Programa;
import java.util.Scanner;
public class Programa04 {
    public static void main(String[]args){
        //declarar las variables
        double sueldoempleado;
        String mensaje;
        Scanner lectura=new Scanner(System.in);
        // ingreso de datos
        System.out.print("ingrese el sueldo del empleado : ");
        sueldoempleado=lectura.nextDouble();
        //proceso de datos
        if(sueldoempleado>1025){
            mensaje="ganas mayor al sueldo minimo vital";
            //salida de datos
            System.out.println(mensaje);
                 
        }
          //fin de metodo
            //fin de proceso
    }
    
}
