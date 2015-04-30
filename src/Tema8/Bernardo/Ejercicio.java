/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tema8.Bernardo;

import java.io.*;

public class Ejercicio {

        public static void main(String[] args) throws IOException {
                String rutaFichero = "quijote.txt";
                String rutaFichero1 = "quijote1.txt";
                try {
                        FileReader fr = new FileReader(rutaFichero);
                        BufferedReader br = new BufferedReader(fr);
                        FileWriter fw = new FileWriter(rutaFichero1);
                        BufferedWriter bw = new BufferedWriter(fw);
                        int siguienteCaracter = 0;
                        int i = 0;
                        while ((siguienteCaracter = br.read()) != -1) {
                                bw.write(siguienteCaracter);
                                i++;
                                if (i==40){
                                        bw.newLine();
                                        i=0;
                                }
                        }
                        br.close();
                        bw.flush();
                        bw.close();
                } catch (IOException e) {
                        System.out.println("Error---" + e.toString());
                }
        }
}
