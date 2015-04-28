
package Tema9.Bernardo;
import java.io.*;

public class CuentaPalabras {
    public static void main(String args[]){
        File f=new File(args[0]);
        
        if(f.isFile()){
            try{
            FileReader fr= new FileReader(f);
            BufferedReader br= new BufferedReader(fr);
            
            
            }catch(IOException e){
                System.out.println("Exception----"+e);
            }
        }
    }
}
