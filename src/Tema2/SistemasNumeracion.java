/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tema2;

/**
 *
 * @author Vespertino
 */
public class SistemasNumeracion {
    public static void main(String args[]){
        SistemasNumeracion sn= new SistemasNumeracion();
        int num=47;
        System.out.println(sn.hexa(num));
        System.out.println(sn.bin(num));
        System.out.println(sn.oct(num));
    }
    public String hexa(int num){
        return Integer.toHexString(num);
    }
    public String bin(int num){
        return Integer.toBinaryString(num);
    }
    public String oct(int num){
        return Integer.toOctalString(num);
    }
}
