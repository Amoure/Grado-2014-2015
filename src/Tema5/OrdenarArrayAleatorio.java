/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tema5;
import java.math.*;
/**
 *
 * @author Vespertino
 */
public class OrdenarArrayAleatorio {
    public static void main(String args[]){
        double v[]= new double[10];
        
        for(int i=0;i<v.length;i++){
            v[i]=Math.rint(Math.random()*100000)/100000;
        }
        System.out.println(v[1]);
    }
    public void MostrarArray(double v[]){
        for(int i=0;i<v.length;i++){
            System.out.println();
        }
    }
}
