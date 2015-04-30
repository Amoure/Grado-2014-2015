/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tema14.Bernardo;

import java.awt.*;
import java.awt.event.*;

public class EjemploEventosTeclado extends Frame {

        TextField tf1, tf2, tf3, informacion;
        boolean control;

        EjemploEventosTeclado(String titulo) {
                super(titulo);
                setLayout(new FlowLayout());

                informacion = new TextField(25);

                tf1 = new TextField(10);
                tf1.setBackground(Color.cyan);

                //Agregar escuchador de KeyEvents
                //Se emplea el método keyTyped(..) para crear código respuesta
                //a la pulsación de una tecla con carácter Unicode asociado
                tf1.addKeyListener(new KeyAdapter() {
                        public void keyTyped(KeyEvent e) {

                                //Comprobar si en tf1 se ha teclado la letra 'q'
                                if (e.getKeyChar() == 'q') {
                                        control = true;
                                        informacion.setText("Se ha tecleado q");
                                        getToolkit().beep();
                                        setBackground(Color.pink);
                                        tf2.setText(tf1.getText());
                                }
                        }

                        //Se evita que aparezca 'q' en el ct de la izda

                        public void keyReleased(KeyEvent e) {
                                if (control) {
                                        tf1.setText("");
                                        tf2.requestFocus();
                                        control = false;
                                }
                        }
                });

                //Agregar escuchador de ActionEvents
                tf1.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                if (tf1.getText().equals("FIN")) {
                                        System.exit(0);
                                } else {
                                        System.out.println("Has escrito " + tf1.getText());
                                        tf1.setText("");
                                }
                        }
                });
                tf2 = new TextField(10);

                //Agregar escuchador de KeyEvents
                //Se usa keyPressed(..) para crear código respuesta a la pulsación
                //de la tecla F6, porque no tiene carácter Unicode asociado
                //También podra utilizarse keyReleased(..), pero no keyTyped(..)
                tf2.addKeyListener(new KeyAdapter() {
                        public void keyPressed(KeyEvent e) {

                                //Comprobar con el VKC que se ha pulsado en la tecla F6
                                if (e.getKeyCode() == KeyEvent.VK_F6) {
                                        control = true;
                                        informacion.setText("Se ha pulsado la tecla F6");
                                        setBackground(Color.cyan);
                                        String textotf2Mayus = tf2.getText().toUpperCase();
                                        tf3.setText(textotf2Mayus);
                                        tf3.setBackground(Color.black);
                                        tf3.setForeground(Color.white);
                                }
                        }

                        //Se evita que se mantenga lo escrito en el ct central

                        public void keyReleased(KeyEvent e) {
                                if (control) {
                                        tf2.setText("");
                                        control = false;
                                }
                        }
                });
                tf3 = new TextField(10);

                //Agregar escuchador de KeyEvents
                //Se emplea keyPressed(..) por la misma razón que antes:
                //se desea crear código respuesta a la pulsación de la tecla Ctrl,
                //que no tiene caracter Unicode asociado
                tf3.addKeyListener(new KeyAdapter() {
                        public void keyPressed(KeyEvent e) {
                                if (e.getKeyCode() == KeyEvent.VK_CONTROL) {
                                        informacion.setText("Se ha pulsado la tecla Control");
                                        setBackground(Color.black);
                                        tf3.setText("");
                                        tf3.setBackground(Color.white);
                                        tf3.setForeground(Color.black);
                                }
                        }
                });

                //Agregar escuchador de WindowEvents
                addWindowListener(new WindowAdapter() {
                        public void windowClosing(WindowEvent e) {
                                System.exit(0);
                        }
                });
                add(tf1);
                add(tf2);
                add(tf3);
                add(informacion);
        }

        public static void main(String args[]) {
                EjemploEventosTeclado frame = new EjemploEventosTeclado("Eventos de teclado");
                frame.setSize(350, 150);
                frame.setVisible(true);

                //Después de hacer visible a la ventana,se asigna el foco inicial
                //al cuadro tf3
                frame.tf3.requestFocus();
        }
}