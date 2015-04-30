import java.io.*;

public class LecturaFicheroCaracterACaracterConFiltro{
	public static void main(String args[]){
		String rutaFichero="c:\\setuplog.txt";
		try{
			long ini=System.currentTimeMillis();
			
			//Lectura de un fichero de 700 KB
			FileReader fr=new FileReader(rutaFichero);
			BufferedReader br=new BufferedReader(fr);
			int siguienteCaracter;
			while((siguienteCaracter=br.read())!=-1){}
			br.close();
			System.out.println("Tiempo ejecucion="+
				(System.currentTimeMillis()-ini)+" ms");
				
			//Se obtienen tiempos de ejecucion del orden de los 90 ms
		}catch(IOException e){
			System.out.println("Error---"+e.toString());
		}
	}
}