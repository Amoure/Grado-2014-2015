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
public class ResolverEcuacionSegundoGrado {
    double a=1.5;
    double b=3.5;
    double c=1.5;
    double discriminante= Math.pow(b,2)-4*a*c;
    double sol1, sol2;
    public static void main(String args[]){
        
    }
    void resolucion(){
        
    }
    void calculitos(double num1, double num2){
        double solMayor=Math.max(num1, num2);
        double solMenor=Math.min(num1, num2);
        
        System.out.println("Solucion mayor: "+solMayor);
        System.out.print("La exponencial elevada vale "+Math.exp(solMayor));
        System.out.println("El coseno de la menor es "+Math.cos(solMenor));
        System.out.println("Las soluciones redondeadas son: "+(Math.rint(solMayor*10000)/10000)+" y "+(Math.rint(solMenor*10000)/10000));
        System.out.println("El arcoseno de mayor: "+Math.toRadians(Math.asin(solMayor)));
        System.out.println("El arcoseno de mayor grados: "+Math.toDegrees(Math.asin(solMayor)));
    }
}
