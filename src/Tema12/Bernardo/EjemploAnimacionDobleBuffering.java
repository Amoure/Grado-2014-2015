package Tema12.Bernardo;

import java.applet.*;
import java.awt.*;

public class EjemploAnimacionDobleBuffering extends Applet implements Runnable {

        //Coordenadas x,y del centro de un círculo de radio 25
        int xCentro = 50;
        int yCentro = 75;

        //Radio círculo
        int radio = 25;

        Thread miHilo;

        //Objetos Image y Graphics de apoyo para el doble buffering
        Image imagenDB;
        Graphics gDB;

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
                        if (xCentro > getWidth() + radio) {
                                miHilo = null;
                                xCentro = -radio;
                        }
                        repaint();
                }
        }

        public void paint(Graphics g) {
                g.setColor(Color.green);
                //Se pinta un círculo que va desplazándose hacia la derecha
                //debido a la variación de la coordenada x de su centro
                g.fillOval(xCentro - radio, yCentro - radio, 2 * radio, 2 * radio);
        }

        //Redefinir el update(..) mediante la técnica del doble buffering
        //Siempre es lo mismo.
        public void update(Graphics g) {

                //Obtención del objeto Graphics gDB de apoyo y no asociado al applet
                //Su contexto gráfico se usa para dibujar en un segundo plano el
                //círculo
                if (imagenDB == null) {
                        //Obtener el Graphics gDB con una anchura y altura iguales a
                        //las del contexto gráfico del applet.
                        //Se hace a través de un Image de apoyo
                        imagenDB = createImage(getWidth(), getHeight());
                        gDB = imagenDB.getGraphics();
                }

                //Actualizar en segundo plano el contexto del objeto Graphics
                //de apoyo
                gDB.setColor(getBackground());
                gDB.fillRect(0, 0, getWidth(), getHeight());

                //Dibujar el círculo en segundo plano, en el contexto del
                //objeto Graphics de apoyo
                gDB.setColor(getForeground());
                paint(gDB);

                //Dibujar el círculo en primer plano, en el contexto del
                //objeto Graphics del applet
                g.drawImage(imagenDB, 0, 0, this);
        }
}