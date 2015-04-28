/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tema13;

import java.awt.*;

//Este paquete se importa para poder cerrar la ventana
//Se estudiará en el siguiente tema
import java.awt.event.*;

public class EjemploCanvas extends Frame {

        Button b1, b2;
        TextField tf;
        MiCanvas mc;

        EjemploCanvas(String titulo) {

                //Crear la frame invocando al constructor de Frame que interese
                super(titulo);
                setLayout(new FlowLayout());

                setBackground(Color.cyan);

                b1 = new Button("Aceptar");
                b1.setForeground(Color.red);

                b2 = new Button("Cancelar");
                b2.setForeground(Color.green);

                tf = new TextField("Esto es un cuadro de texto");
                tf.setForeground(Color.white);
                tf.setBackground(Color.blue);

                //Obtener imagen para icono de la barra de título y para el canvas
                Image imagen = getToolkit().getImage("imagenes/imagen01.gif");
                setIconImage(imagen);

                //Invocar al constructor del canvas pasándole la imagen
                mc = new MiCanvas(imagen);

                //Si el canvas no se agrega a un contenedor BorderLayout en su zona
                //central, debe asignársele anchura y altura. En caso contrario, no
                //se muestra.
                mc.setSize(150, 150);
                mc.setBackground(Color.black);

                add(b1);
                add(b2);
                add(tf);
                add(mc);

                //Finalizar programa al cerrar la ventana
                addWindowListener(new WindowAdapter() {
                        public void windowClosing(WindowEvent e) {
                                System.exit(0);
                        }
                });
        }

        public static void main(String args[]) {
                Frame frame = new EjemploCanvas("Mi primera ventanita");
                frame.pack();
                frame.setVisible(true);
        }
}

class MiCanvas extends Canvas {

        Image imagen;

        public MiCanvas(Image imagen) {
                this.imagen = imagen;
                System.out.println("Constructor Canvas");
        }

        //Se redefine el paint(..)
        public void paint(Graphics g) {
                System.out.println("paint");

                //El segundo y tercer argumento son coordenadas respecto al canvas
                //Se muestra la imagen con sus diemnsiones reales
                g.drawImage(imagen, 0, 0, this);

                //Si se desea mostrar la imagen con las dimensiones del canvas
                //g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
        }
}
