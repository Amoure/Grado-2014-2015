/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tema4;
import java.io.*;
/**
 *
 * @author Vespertino
 */
public class EjercicioExcepciones {
    public static void main(String args[]){
        try{
            
            int inicio, fin;
            
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Escribe el numero de inicio: ");
            inicio=Integer.parseInt(br.readLine());
            System.out.print("Escribe el numero de fin: ");
            fin=Integer.parseInt(br.readLine());

            if(fin>inicio)
                System.out.println("El inicio tiene que ser mayor que el final");
            else{
                for(int i=inicio;i>fin;i--){
                    System.out.println(10/i);
                }
              
            }
        }catch(IOException ioe){
            System.out.println("Exception--- "+ioe);
        
        
        }catch(NumberFormatException nf){
            System.out.println("Tienes que introducir un numero");
         
        }catch(ArithmeticException ae){
            System.out.println("Ojito division por cero");
        }
        finally{
            System.out.println("FIN DE PROGRAMA");
        }

    }
}
