import java.io.*;

public class FlujoLecturaCaracteres1{
	public static void main(String args[]){
		String rutaFichero="c:\\ejemplo.txt";
		try{
			FileReader fr=new FileReader(rutaFichero);
			BufferedReader br=new BufferedReader(fr);
			String siguienteLinea;
			System.out.println("Lineas que componen el fichero:");
			while((siguienteLinea=br.readLine())!=null)
				System.out.println(siguienteLinea);
			br.close();
		}catch(IOException e){
			System.out.println("Error---"+e.toString());
		}
	}
}