package Tema9.Bernardo;

import java.io.*;
import java.util.*;

public class BuscaFicheros {
    public static void main(String args[]){
       InputStreamReader ir= new InputStreamReader(System.in);
       BufferedReader br= new BufferedReader(ir);
       Vector vr=new Vector();
      
       try{
           
       System.out.println("Introduzca la dirección de los ficheros:");
       String dire=br.readLine();
       System.out.println("Introduzca la extensión de los ficheros:");
       String exte=br.readLine();
       vr=obtenerFicherosBuscados(dire,exte);
       br.close();
       }catch(IOException e){
           System.out.println("Exception----"+e);
       }
       
    }
    
    private static boolean comprobarExtension (File f, String ext){
    
        return true;
    }
    
    private static Vector obtenerFicherosBuscados(String dir, String ext){
        Vector v=new Vector();
                
        return v;
    }
}
