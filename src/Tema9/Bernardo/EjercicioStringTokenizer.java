
package Tema9.Bernardo;
import java.io.*;
import java.util.StringTokenizer;

public class EjercicioStringTokenizer {
    public static void main(String args[]){
        String s="";           
        InputStreamReader ir= new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader (ir);
        try{ 
            System.out.println("Introduzca una frase: ");
            s=br.readLine();
           
            br.close();
           
        }catch(IOException e){
            System.out.println("Exception------"+e);
        }
        
        StringTokenizer st=new StringTokenizer (s);
        int aux=st.countTokens();
        System.out.println("Esta frase tiene "+st.countTokens()+" palabras");
        StringBuffer sb[]=new StringBuffer[aux];
        /*while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
            //sb.append(st.nextToken());
            
        }*/
       
        for(int i=0; st.hasMoreTokens(); i++){
            sb[i]=new StringBuffer(st.nextToken());
            System.out.println(sb[i]);
        }
        
        for(int i=0; i<aux; i++){
            System.out.println(sb[i].reverse()+" "+sb[i].getClass().getName());
        }        
        
        
        
    }


}
