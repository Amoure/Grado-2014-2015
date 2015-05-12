/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tema5;
import java.io.*;
import java.util.*;
/**
 *
 * @author Vespertino
 */
public class Factorial {
    public static void main(String args[]) throws IOException{
        int numero;
        int fact=1;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce un numero: ");
        numero=Integer.parseInt(br.readLine());
        int[] v=new int[numero];
        
        for(int i=1; i<=numero; i++){
            v[i-1]=i;
            fact*=i;
        }
        
        System.out.println(Arrays.toString(v));
        System.out.println(fact);
    }
}
