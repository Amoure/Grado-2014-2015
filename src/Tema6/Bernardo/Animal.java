/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tema6.Bernardo;

class Animal{
        void comer(){
                System.out.println("Comiendo comida generica un animal generico");
        }
}

class Vaca extends Animal{

        //Redefinición del método comer() en la subclase Vaca
        void comer(){
                System.out.println("Metodo comer() redefinido en la clase Vaca.");
                System.out.println("Comiendo hierba una vaca generica");
        }
        void vaquear(){
                System.out.println("Vaqueando");
        }
}

class Toro extends Animal{

        //Redefinición del método comer() en la subclase Toro
        void comer(){
                System.out.println("Metodo comer() redefinido en la clase Toro.");
                System.out.println("Comiendo hierba un toro generico");
        }
        void torear(){
                System.out.println("Toreando");
        }
}

class EjemploAnimales{
        public static void main(String args[]){
                Animal ani=new Animal();
                ani.comer();

                Vaca vac=new Vaca();
                vac.comer();
                vac.vaquear();

                Toro tor=new Toro();
                tor.comer();
                tor.torear();

                //Polimorfismo:posibilidad de inicializar una variable referenciada
                //de la superclase mediante un objeto de una subclase
                //Mediante dicha variable "polimórfica",se puede acceder a todos los
                //métodos redefinidos en la subclEjemploAnimalesase.
                //NO A LOS PROPIOS DE LA CLASE.

                Animal aniVaca=new Vaca();
                aniVaca.comer();
                Animal aniToro=new Toro();
                aniToro.comer();

                //Error al compilar si se descomentan
                //aniVaca.vaquear();
                //aniToro.torear();

                System.out.println("FIN DE PROGRAMA");
        }
}