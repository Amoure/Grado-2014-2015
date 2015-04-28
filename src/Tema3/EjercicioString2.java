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
public class EjercicioString2 {
    public static void main(String args[]){
        int ind=0;
        int cont=0;
        String s="Mañana es sabado sabadete y voy a irme a tomar unas copillas por los barrios bajos de Logroño";
        while(ind!=-1){  
            ind=s.indexOf("a", ind+1); 
            if(ind!=-1)
                cont++;
            
       }           
        System.out.println(cont);
        
    }
}
