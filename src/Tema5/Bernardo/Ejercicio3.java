/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tema5.Bernardo;

public class Ejercicio3 {

        String frutas[] = new String[5];

        void inicilizarArray() {
                frutas[0] = "pera";
                frutas[1] = "limon";
                frutas[2] = "melocoton";
                frutas[3] = "nectarina";
                frutas[4] = "uva";
                mostrarArrayInicial(frutas);
        }

        void mostrarArrayInicial(String frutasCaracteres[]) {
                int i, producto = 1;
                System.out.print("Elementos del primer array fruticola: [");
                for (i = 0; i < frutasCaracteres.length - 1; i++) {
                        System.out.print(frutasCaracteres[i] + ", ");
                        producto *= frutasCaracteres[i].length();
                }
                System.out.println(frutasCaracteres[frutasCaracteres.length - 1] + "]");
                producto *= frutasCaracteres[frutasCaracteres.length - 1].length();
                System.out.println("Producto del numero de caracteres= " + producto);
        }

        String[] crearNuevoArray() {
                String frutillasNuevo[] = new String[5];
                for (int i = 0; i < frutas.length; i++) {
                        if (frutas[i].length() > 6) {
                                frutillasNuevo[i] = "melon";
                        } else {
                                frutillasNuevo[i] = frutas[i];
                        }
                }
                return frutillasNuevo;
        }

        void mostrarNuevoArray(String frutasNuevo[]) {
                System.out.print("Elementos del nuevo array fruticola: [");
                for (int i = 0; i < frutasNuevo.length - 1; i++) {
                        System.out.print(frutasNuevo[i] + ", ");
                }
                System.out.println(frutasNuevo[frutasNuevo.length - 1] + "]");
        }

        public static void main(String args[]) {
                Ejercicio3 e3 = new Ejercicio3();
                e3.inicilizarArray();
                e3.mostrarArrayInicial(e3.crearNuevoArray());
                System.out.println("FIN DE PROGRAMA");
        }
}