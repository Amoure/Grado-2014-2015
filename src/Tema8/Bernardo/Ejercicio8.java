/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tema8.Bernardo;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio8 {

        public static void main(String args[]) throws IOException {
                String rutaFichero = "quijote.txt";
                try {
                        int enes=0;
                        int contador[]=new int['Z'-'A'+1];
                        for (int i=0;i<contador.length;i++)
                                contador[i]=0;

                        FileReader fr = new FileReader(rutaFichero);
                        BufferedReader br = new BufferedReader(fr);

                        int caracter;
                        while ((caracter = br.read()) != -1) {
                                Letra l=new Letra(caracter);
                                int ms=l.mayus_sin();
                                if (ms>='A' && ms<='Z')
                                        contador[ms-'A']++;
                                if (ms=='Ñ')
                                        enes++;
                        }
                        br.close();

                        for (int i=0;i<contador.length;i++)
                                System.out.println((char)('A'+i)+"="+contador[i]);
                        System.out.println("Ñ="+enes);

                } catch (IOException e) {
                        System.out.println("Error---" + e.toString());
                }
        }

}