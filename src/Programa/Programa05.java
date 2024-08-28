
package Programa;
import java.util.Scanner;
public class Programa05 {
    public static void main(String[]args){
        //declarar las variables
        double temperatura;
        String mensaje;
        Scanner lectura=new Scanner(System.in);
        // ingresar datos
        System.out.print("ingrese la temperatura: ");
        temperatura=lectura.nextDouble();
        //proceso de datos
        if(temperatura>=25){
          mensaje="UFFFF Que calor, vamos a la PLAYA";
        }else{
            mensaje="clima moderado";
            
        }
       //salida de datos
       System.out.println(mensaje);
        //fin de metodo
        //fin de proyecto
    }
    
}
