
package Programa;
import java.util.Scanner;
public class Programa03 {
    public static void main(String[]args){
        //declarar las variables
        int num;
        String mensaje;
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.print("ingresar el numero : ");
        num=lectura.nextInt();
        //proceso de datos
        if(num>0){
            mensaje="El numero positivo";
        }else if(num<0){
            mensaje="El numero es negativo";
        }else{
            mensaje="El numero es Neutro";
        }
            //salida de datos
            System.out.println(mensaje);
        }
           

        
    } 
    

