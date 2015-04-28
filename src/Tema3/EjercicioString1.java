/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tema3;

/**
 *
 * @author Vespertino
 */
public class EjercicioString1 {
    public static void main(String args[]){
        String s= "En mi proxima vida, creere en la reencarnacion";
        System.out.println(s.length());
        System.out.println(s.charAt(7));
        System.out.println(s.substring(20, 26));
        System.out.println(s.indexOf('x'));
        System.out.println(s.toUpperCase());
        System.out.println(s.startsWith("E"));
    }
}
