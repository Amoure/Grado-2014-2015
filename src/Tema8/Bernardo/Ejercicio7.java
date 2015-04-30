/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tema8.Bernardo;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio7 {

        public static void main(String args[]) throws IOException {
                String rutaFichero = "quijote.txt";
                try {
                        FileReader fr = new FileReader(rutaFichero);
                        BufferedReader br = new BufferedReader(fr);

                        int caracter;
                        while ((caracter = br.read()) != -1) {

                                System.out.print((char)mayuscula(caracter));
                        }

                        br.close();
                } catch (IOException e) {
                        System.out.println("Error---" + e.toString());
                }
        }

        public static int mayuscula(int letra){
                char acentuadas[]={'á','à','ä','â'};
                if (letra>='a' && letra<='z')
                        return letra-'a'+'A';
                else
                        return letra;
        }
}