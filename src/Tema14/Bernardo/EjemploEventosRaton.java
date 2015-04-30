/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tema14.Bernardo;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class EjemploEventosRaton extends Applet {

        Image monigote;
        AudioClip sonidoTocado, sonidoFallo;
        Date fechaPulsacion;
        int anchuraApplet, alturaApplet;
        int anchuraMonigote, alturaMonigote;
        int xMonigote, yMonigote;//Coordenadas esquina sup izda del monigote

        //Objetos Image y Graphics de apoyo para el doble buffering
        Image imagenDB;
        Graphics gDB;

        Random r;//Para calcular coordenadas aleatorias válidas de la esq sup izda del monigote

        int tocados = 0;//Número de tocados sobre el monigote

        public void init() {
                capturarParametros();
                crearComponentes();
        }

        private void capturarParametros() {
                anchuraApplet = getWidth();
                alturaApplet = getHeight();
                r = new Random();

                monigote = getImage(getDocumentBase(), getParameter("imagen"));
                sonidoTocado = getAudioClip(getDocumentBase(), getParameter("tocado"));
                sonidoFallo = getAudioClip(getDocumentBase(), getParameter("fallo"));
        }

        private void crearComponentes() {

            //Agregar escuchador de MouseEvents estáticos al applet
                //Cuando se pulse cualquier botón del ratón se ejecutará el
                //código del mousePressed(..)
                addMouseListener(new MouseAdapter() {
                        public void mousePressed(MouseEvent e) {

                            //El método de java.awt.event.InputEvent "long getWhen()"
                                //devuelve un entero que almacena información temporal que
                                //suele utilizarse como argumento de un constructor de Date.
                                //Se emplea para saber cuando se produce un InputEvent
                                //o evento de entrada. Los más habituales son MouseEvent
                                //y KeyEvent
                                fechaPulsacion = new Date(e.getWhen());
                                System.out.println(fechaPulsacion);

                                //Obtener coordenadas del punto donde se pulsa con el ratón
                                int x = e.getX();
                                int y = e.getY();

                                //Comprobar si se pulsa sobre el monigote
                                if (xMonigote < x && x < xMonigote + anchuraMonigote
                                          && yMonigote < y && y < yMonigote + alturaMonigote) {
                                        tocados++;
                                        getAppletContext().showStatus("TOCADO capullin. "
                                                  + "Total tocados= " + tocados);
                                        System.out.println("TOCADO capullin. Total tocados= "
                                                  + tocados);
                                        sonidoTocado.play();
                                } else {
                                        getAppletContext().showStatus("FALLO DE PUNTERIA");
                                        System.out.println("FALLO DE PUNTERIA");
                                        sonidoFallo.play();
                                }

                                //Las llamadas al paint(..) provocan movimiento al monigote
                                repaint();
                        }
                });

            //Agregar escuchador de MouseEvents din�micos al applet
                //Cuando el rat�n se mueva se ejecutar� el c�digo del mouseMoved()
                addMouseMotionListener(new MouseMotionAdapter() {

                        //Provoca que el monigote se mueva cuando el rat�n se mueve
                        public void mouseMoved(MouseEvent e) {
                                System.out.println("movido raton");
                                repaint();
                        }
                });
        }

        public void paint(Graphics g) {

                //Para que el monigote no se mueva demasiado rápido
                try {
                        Thread.sleep(500);
                } catch (InterruptedException ie) {
                }

                //Calcular anchura y altura del monigote
                anchuraMonigote = monigote.getWidth(this);
                alturaMonigote = monigote.getHeight(this);

                //Dibujar unos límites. El monigote debe estar entre ellos
                g.drawRect(5, 20, anchuraApplet - 25, alturaApplet - 25);

                //Dibujar el número de tocados
                g.drawString("Numero de tocados= " + tocados, 5, 15);

            //Generar aleatoriamente coordenadas válidas para la esquina sup
                //izda del monigote
                xMonigote = r.nextInt(anchuraApplet - 25 - anchuraMonigote) + 5;
                yMonigote = r.nextInt(alturaApplet - 25 - alturaMonigote) + 20;
                System.out.println(xMonigote + "," + yMonigote);

                g.drawImage(monigote, xMonigote, yMonigote, this);
        }

        //Redefinir el update(..) mediante la técnica del doble buffering
        public void update(Graphics g) {
                if (imagenDB == null) {
                        imagenDB = createImage(getWidth(), getHeight());
                        gDB = imagenDB.getGraphics();
                }
                gDB.setColor(getBackground());
                gDB.fillRect(0, 0, getWidth(), getHeight());
                gDB.setColor(getForeground());
                paint(gDB);
                g.drawImage(imagenDB, 0, 0, this);
        }
}