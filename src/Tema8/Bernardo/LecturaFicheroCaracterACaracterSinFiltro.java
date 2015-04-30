import java.io.*;

public class LecturaFicheroCaracterACaracterSinFiltro{
	public static void main(String args[]){
		String rutaFichero="c:\\setuplog.txt";
		try{
			long ini=System.currentTimeMillis();
			
			//Lectura de un fichero de 700 KB
			FileReader fr=new FileReader(rutaFichero);
			int siguienteCaracter;
			while((siguienteCaracter=fr.read())!=-1){}
			fr.close();
			System.out.println("Tiempo ejecucion="+
				(System.currentTimeMillis()-ini)+" ms");
				
			//Se obtienen tiempos de ejecucion del orden de los 5400 ms
		}catch(IOException e){
			System.out.println("Error---"+e.toString());
		}
	}
}