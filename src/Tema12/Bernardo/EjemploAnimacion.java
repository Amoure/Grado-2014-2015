package Tema12.Bernardo;

import java.applet.*;
import java.awt.*;

public class EjemploAnimacion extends Applet implements Runnable {

        //Coordenadas x,y del centro de un círculo de radio 25
        int xCentro = 50;
        int yCentro = 75;

        //Radio círculo
        int radio = 25;

        Thread miHilo;

        public void init() {
                setBackground(Color.blue);
        }

        public void start() {
                if (miHilo == null) {
                        miHilo = new Thread(this);
                        miHilo.start();
                }
        }

        public void stop() {
                if (miHilo != null) {
                        miHilo = null;
                }
        }

        public void run() {
                Thread hiloActual = Thread.currentThread();
                while (miHilo == hiloActual) {
                        try {
                                Thread.sleep(25);
                        } catch (InterruptedException e) {
                        }
                        xCentro++;
                        repaint();
                }
        }

        public void paint(Graphics g) {
                g.setColor(Color.green);

                //Se pinta un círculo que va desplazándose hacia la derecha
                //debido a la variación de la coordenada x de su centro
                g.fillOval(xCentro - radio, yCentro - radio, 2 * radio, 2 * radio);
        }
}