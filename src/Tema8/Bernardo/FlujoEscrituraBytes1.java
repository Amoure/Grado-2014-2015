import java.io.*;

public class FlujoEscrituraBytes1{
	public static void main(String args[]){
		String rutaFichero="c:\\lolo.txt";
		try{
			FileOutputStream fos=new FileOutputStream(rutaFichero);
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			bos.write(72);
			
			//Vaciar el filtro
			bos.flush();
			
			//Cerrar el filtro
			bos.close();
		}catch(IOException e){
			System.out.println("Error---"+e.toString());
		}
	}
}