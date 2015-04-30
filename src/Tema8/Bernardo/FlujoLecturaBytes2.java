import java.io.*;

public class FlujoLecturaBytes2{
	public static void main(String args[]){
		String rutaFichero="c:\\Windows\\System32\\mspaint.exe";
		try{
			FileInputStream fis=new FileInputStream(rutaFichero);
			BufferedInputStream bis=new BufferedInputStream(fis);			//Leer datos del fichero
			System.out.println("Enteros asociados al fichero:");
			int siguienteByte;
			
			//Se emplea un bucle para leer todo el fichero
			//Es la forma típica de trabajar
			while((siguienteByte=bis.read())!=-1)
				System.out.print(siguienteByte+" ");
			bis.close();
		}catch(IOException e){
			System.out.println("Error---"+e.toString());
		}
	}
}