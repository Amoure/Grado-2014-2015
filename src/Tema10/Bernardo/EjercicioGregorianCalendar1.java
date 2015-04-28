/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tema10.Bernardo;
import java.util.*;

public class EjercicioGregorianCalendar1 {
    public static void main(String args[]){
        String dias[]={"Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado",};
        GregorianCalendar gcf= new GregorianCalendar(2025, Calendar.DECEMBER,25);
        GregorianCalendar gc=new GregorianCalendar();
        System.out.println("La navidad en 2025 caerá en: "+dias[gcf.get(Calendar.DAY_OF_WEEK)-1]);
        System.out.println(gc.get(Calendar.DAY_OF_MONTH));
        
    }
}
