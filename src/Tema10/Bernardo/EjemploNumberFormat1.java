/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tema10.Bernardo;
import java.text.*;
import java.util.*;

public class EjemploNumberFormat1 {

        public static void main(String args[]) {
                long entero = 2500L;
                double decimal = 36.1236;
                NumberFormat nfGeneral, nfMoneda, nfPorcentaje;
                Locale loc[] = {Locale.getDefault(), Locale.US, Locale.JAPAN};
                for (int i = 0; i < loc.length; i++) {
                        nfGeneral = NumberFormat.getNumberInstance(loc[i]);
                        System.out.println(entero + " dp de formatearlo segun "
                                  + loc[i].getDisplayCountry() + "= " + nfGeneral.format(entero));
                        System.out.println(decimal + " dp de formatearlo segun "
                                  + loc[i].getDisplayCountry() + "= " + nfGeneral.format(decimal));

                        nfMoneda = NumberFormat.getCurrencyInstance(loc[i]);
                        System.out.println(decimal + " en formato moneda de "
                                  + loc[i].getDisplayCountry() + "= " + nfMoneda.format(decimal));

                        nfPorcentaje = NumberFormat.getPercentInstance(loc[i]);
                        System.out.println(decimal + " en formato porcentaje de "
                                  + loc[i].getDisplayCountry() + "=" + nfPorcentaje.format(decimal));
                        System.out.println("*****************************************");
                }

                NumberFormat nfEspañol = NumberFormat.getNumberInstance(
                          Locale.getDefault());
                System.out.println("Numero maximo de cifras decimales aqui: "
                          + nfEspañol.getMaximumFractionDigits());
                System.out.println("Ahora se cambia el valor anterior de 3 a 2");
                nfEspañol.setMaximumFractionDigits(2);
                System.out.println(decimal + " con la nueva configuracion= "
                          + nfEspañol.format(decimal));
        }
}