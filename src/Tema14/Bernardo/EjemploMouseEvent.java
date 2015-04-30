/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tema14.Bernardo;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.*;

public class EjemploMouseEvent extends Applet {

        Button b;
        int n = 0;

        public void init() {
                setLayout(new FlowLayout());
                setBackground(Color.yellow);

                b = new Button("Aceptar");

                //Agregar escuchador de MouseEvents al boton
                b.addMouseListener(new MouseAdapter() {
                        public void mouseEntered(MouseEvent e) {
                                System.out.println("Dentro del boton a las " + new Date(e.getWhen()));
                                System.out.println("-----------------------------");
                        }
                });

            //Agregar escuchador de MouseEvents al applet
                //Gestionar la pulsación de un botón
                addMouseListener(new MouseAdapter() {
                        public void mousePressed(MouseEvent e) {
                                System.out.print("Pulsado un boton del raton.");
                                System.out.println("Coordenadas: " + e.getX() + ", " + e.getY());
                                System.out.println("-----------------------------");
                        }
                });

            //Agregar escuchador de MouseEvents al applet
                //Gestionar el clic de un botón (pulsar-despulsar en un mismo punto)
                addMouseListener(new MouseAdapter() {
                        public void mouseClicked(MouseEvent e) {
                                System.out.print("Pulsado-Despulsado un boton del raton en el mismo punto.");
                                System.out.println("Coordenadas: " + e.getX() + ", " + e.getY());
                                System.out.println("-----------------------------");
                        }
                });

            //Agregar escuchador de MouseEvents al applet
                //Gestionar la despulsación de un botón
                addMouseListener(new MouseAdapter() {
                        public void mouseReleased(MouseEvent e) {
                                System.out.print("Despulsado un boton del raton.");
                                System.out.println("Coordenadas: " + e.getX() + ", " + e.getY());
                                System.out.println("-----------------------------");
                        }
                });

                add(b);
        }
}