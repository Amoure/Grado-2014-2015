/*
Realizar un programa que sume una serie de números introducidos por consola 
y que además obtenga la suma de los positivos y de los negativos. 
El programa, antes de que el usuario introduzca los números, le preguntará cuántos 
desea sumar.
 */

package Tema4;
import java.io.*;

public class Ejercicio2 {
    public static void main(String args[]) throws IOException{
        double total=0;
        double totalPositivos=0;
        double totalNegativos=0;
        int cantidad;
        String numero;
        Ejercicio2 e=new Ejercicio2();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
            
            System.out.print("Cuantos numeros quieres sumar: ");
                cantidad=Integer.parseInt(br.readLine());
                System.out.println(cantidad);
            System.out.println("Teclea los numeros");
            
            for(int i=1;i<=cantidad;i++){
                numero=br.readLine();
                if(e.esNegativo(numero)){
                    totalNegativos=+Integer.parseInt(numero);
                    total=+Integer.parseInt(numero);
                }
                else{
                    totalPositivos=+Integer.parseInt(numero);
                    total=+Integer.parseInt(numero);
                }    
            }
            System.out.println(total);
            System.out.println(totalPositivos);
            System.out.println(totalNegativos);
        }catch(NumberFormatException ne){
            System.out.println("Debes introducir un numero");
        }
    }
    
    public boolean esNegativo(String x){
        return (x.charAt(0))=='-';
    }
    
}
