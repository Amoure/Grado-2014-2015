import java.io.*;

public class FlujoLecturaBytes1{
	public static void main(String args[]){
		String rutaFichero="c:\\Windows\\System32\\mspaint.exe";
		try{
			
			//Crear flujo de lectura y asociarlo a un fichero
			FileInputStream fis=new FileInputStream(rutaFichero);
			
			//Asignar filtro para optimizar la lectura
			BufferedInputStream bis=new BufferedInputStream(fis);
						
			//Leer datos del fichero
			int primerByte=bis.read();
			if(primerByte==-1)
				System.out.println("El fichero no contiene ningun byte");
			else
				System.out.println("Entero asociado al primer byte del "+
					"fichero= "+primerByte);
					
			//Cerrar filtro. No hace falta cerrar el flujo
			bis.close();
		}catch(IOException e){
			System.out.println("Error---"+e.toString());
		}
	}
}