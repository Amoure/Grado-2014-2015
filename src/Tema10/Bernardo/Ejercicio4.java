/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tema10.Bernardo;
import java.util.*;
import java.text.*;
import java.io.*;

public class Ejercicio4 {

        public static void main(String args[]) {
                Ejercicio4 e4 = new Ejercicio4();
                try {
                        e4.comunicarUsuario();
                } catch (IllegalArgumentException iae) {
                        System.out.println("La fecha tecleada no existe o su formato es incorrecto");
                }
        }

        public void comunicarUsuario() {
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);
                String fecha = "";
                try {
                        System.out.print("Hola majete, escribe tu nombre y pulsa enter: ");
                        String nombre = br.readLine();
                        System.out.println("BIENVENIDO, " + nombre.toUpperCase());
                        System.out.println("Si me ayudas un poquito te dire el día de la semana en que naciste y tu edad en días.");
                        System.out.println("Sigue las instrucciones.");
                        System.out.print("Teclea tu fecha de nacimiento (dd/mm/aaaa): ");
                        fecha = br.readLine();
                } catch (IOException e) {
                        System.out.println("Error de Entrada de Datos" + e.toString());
                } finally {
                        GregorianCalendar gc = this.obtenerCalendar(fecha);
                        this.calcularDiaSemanaNacimiento(gc);
                        this.calcularDiasVividos(gc);
                }
        }

        private GregorianCalendar obtenerCalendar(String fechaNacString) {

                int meses[] = {Calendar.JANUARY, Calendar.FEBRUARY, Calendar.MARCH, Calendar.APRIL,
                        Calendar.MAY, Calendar.JUNE, Calendar.JULY, Calendar.AUGUST,
                        Calendar.SEPTEMBER, Calendar.OCTOBER, Calendar.DECEMBER};

                int primera = 0, segunda = 0;
                for (int i = 0; i < fechaNacString.length(); i++) {
                        if (fechaNacString.charAt(i) == '/') {
                                if (primera == 0) {
                                        primera = i;
                                } else {
                                        segunda = i;
                                }
                        }
                }

                int dia = Integer.parseInt(fechaNacString.substring(0, primera));
                int mes = Integer.parseInt(fechaNacString.substring(primera + 1, segunda));
                int anio = Integer.parseInt(fechaNacString.substring(segunda + 1, fechaNacString.length()));

                GregorianCalendar gc = new GregorianCalendar(anio, meses[mes - 1], dia);
                return gc;
        }

        private void calcularDiaSemanaNacimiento(GregorianCalendar calNac) {
                DateFormatSymbols dfs = new DateFormatSymbols();
                String dias[] = dfs.getWeekdays();
                System.out.println("Naciste en " + dias[calNac.get(Calendar.DAY_OF_WEEK)]);
        }

        private void calcularDiasVividos(GregorianCalendar calNac) {
                Date ahora = new Date();
                System.out.println("DÍas vividos= " + (ahora.getTime() - calNac.getTime().getTime()) / 1000 / 60 / 60 / 24);
        }
}