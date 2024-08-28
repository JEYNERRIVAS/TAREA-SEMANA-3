
package Programa;
import java.util.Scanner;
public class Programa06 {
    public static void main(String[]args){
        // declarar las varibales
        double peso;
        String alumno;
        String mensaje;
        Scanner lectura=new Scanner(System.in);
        // ingresar datos
        System.out.print("ingrese el nombre de la persona : ");
        alumno=lectura.next();
        System.out.print("ingrese el peso del alumno : ");
        peso=lectura.nextDouble();
        // proceso de datos
        if(peso>75){
            mensaje="Alumno debe realizar ejercicio fisico URGENTE, no participa del campeonato";
        }else if(peso<40){
            mensaje="Alumno debe alimentarse para subir su peso ideal y participar del campeonato";
        }else{
            mensaje="Alumno ideal en su peso, y esta listo para ser titular en los juegos olimpicos";
        }
        //salida de datos
        System.out.println(mensaje);
        //fin de datos
        //fin de proyecto
        
    }
}
 