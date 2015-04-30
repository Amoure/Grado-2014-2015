/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tema10.Bernardo;
import java.util.*;
import java.text.*;

public class EjemploGregorianCalendar2{
        public static void main(String args[]){
                //Crear un calendario actual
                GregorianCalendar gc=new GregorianCalendar();
                //Crear un DateFormatSymbols
                DateFormatSymbols dfs=new DateFormatSymbols();
                String meses[]=dfs.getMonths();
                String dias[]=dfs.getWeekdays();
                //Mostrar información
                System.out.println("Era:"+gc.get(Calendar.ERA));
                System.out.println("Año:"+gc.get(Calendar.YEAR));
                System.out.println("Mes:"+meses[gc.get(Calendar.MONTH)]);
                System.out.println("Semana del año:"+
                        gc.get(Calendar.WEEK_OF_YEAR));
                System.out.println("Semana del mes: "+
                        gc.get(Calendar.WEEK_OF_MONTH));
                System.out.println("Dia:"+gc.get(Calendar.DATE));
                System.out.println("Dia del mes:"+gc.get(Calendar.DAY_OF_MONTH));
                System.out.println("Dia del año:"+
                        gc.get(Calendar.DAY_OF_YEAR));
                System.out.println("Dia semana (el 1 Domingo, el 2 Lunes, etc):"+
                        dias[gc.get(Calendar.DAY_OF_WEEK)]);
                System.out.println("Dia semana en el mes (frecuencia del dia de "+
                        "la semana actual en el mes, incluyendolo):"+
                        gc.get(Calendar.DAY_OF_WEEK_IN_MONTH));
                System.out.println("Hora:"+gc.get(Calendar.HOUR));
                System.out.println("Hora en formato de 24 horas:"+
                        gc.get(Calendar.HOUR_OF_DAY));
                System.out.println("Minuto:"+gc.get(Calendar.MINUTE));
                System.out.println("Segundo:"+gc.get(Calendar.SECOND));
                System.out.println("Milisegundo:"+gc.get(Calendar.MILLISECOND));
        }
}