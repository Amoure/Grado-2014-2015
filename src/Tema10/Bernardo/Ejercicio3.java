/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tema10.Bernardo;

import java.util.*;
import java.text.*;

public class Ejercicio3 {

        public static void main(String args[]) {
                GregorianCalendar futuro = new GregorianCalendar(2025, Calendar.DECEMBER, 25);
                DateFormatSymbols dfs = new DateFormatSymbols();
                String dias[] = dfs.getWeekdays();
                System.out.println("La Navidad de 2025 caerá en " + dias[futuro.get(Calendar.DAY_OF_WEEK)]);
                Date ahora = new Date();
                DateFormat dfEspañol = DateFormat.getDateTimeInstance(DateFormat.LONG,
                          DateFormat.LONG, Locale.getDefault());
                System.out.println("Fecha actual: " + dfEspañol.format(ahora));

                System.out.println("Días que faltan= " + (futuro.getTime().getTime() - ahora.getTime()) / 1000 / 60 / 60 / 24);
        }
}