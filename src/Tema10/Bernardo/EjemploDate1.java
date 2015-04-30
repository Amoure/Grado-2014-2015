/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tema10.Bernardo;
import java.util.*;

public class EjemploDate1 {

        public static void main(String args[]) throws Exception {
                //Crear objeto Date con el primer constructor
                Date ahora = new Date();
                System.out.println("Fecha de ejecucion: " + ahora);

                //Obtener msg transcurridos desde el epoch hasta el instante de
                //ejecución de la línea de creación del objeto Date
                long msg = ahora.getTime();
                System.out.println("Milisegundos desde el epoch hasta la ejecucion"
                          + " de este codigo= " + msg);

                //Crear otro objeto Date que almacena la misma información temporal
                //con el segundo constructor
                Date ahoraBis = new Date(msg);
                System.out.println("Fecha de ejecucion: " + ahoraBis);
                msg = ahoraBis.getTime();
                System.out.println("Milisegundos desde el epoch hasta la ejecucion"
                          + " de este codigo= " + msg);

                //Comprobación de que los msg desde el epoch hasta el instante de
                //tiempo que representan los objetos Date ahora y ahoraBis son los
                //mismos
                System.out.println("********************************");
                System.out.println("Comparando Dates equivalentes...");
                EjemploDate1.compararDates(ahora, ahoraBis);
                System.out.println("********************************");

                //Se introduce un retardo de 1 segundo en la ejecución del código
                Thread.sleep(1000);

                //Crear objeto Date tras el retardo
                Date trasUnSegundo = new Date();
                msg = trasUnSegundo.getTime();
                System.out.println("Milisegundos desde el epoch hasta la ejecucion"
                          + " de este codigo= " + msg);

                System.out.println("Comparando Dates NO equivalentes...");
                EjemploDate1.compararDates(ahora, trasUnSegundo);
        }

        private static void compararDates(Date d1, Date d2) {
                System.out.println(d1.before(d2));
                System.out.println(d1.after(d2));
                System.out.println(d1.equals(d2));
        }
}