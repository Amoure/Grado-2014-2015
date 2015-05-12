/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tema5;
import java.math.*;
import java.util.*;
/**
 *
 * @author Vespertino
 */
public class OrdenarArrayAleatorio {
    public static void main(String args[]){
        double[] v= new double[10];
        
        for(int i=0;i<v.length;i++){
            v[i]=Math.rint(Math.random()*100000)/100000;
        }
        System.out.println(v[0]+", "+v[1]+", "+v[2]+", "+v[3]+", "+v[4]+","+v[5]+", "+v[6]+", "+v[7]+", "+v[8]+", "+v[9]);
        Arrays.sort(v);
        System.out.println(v[0]+", "+v[1]+", "+v[2]+", "+v[3]+", "+v[4]+","+v[5]+", "+v[6]+", "+v[7]+", "+v[8]+", "+v[9]);
        System.out.println(v[9]+", "+v[8]+", "+v[7]+", "+v[6]+", "+v[5]+","+v[4]+", "+v[3]+", "+v[2]+", "+v[1]+", "+v[0]);
    }

}
