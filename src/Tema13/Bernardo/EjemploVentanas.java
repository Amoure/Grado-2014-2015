package Tema13.Bernardo;

import java.awt.*;

//Este paquete se importa para poder cerrar la ventana
//Se estudiará en el siguiente tema
import java.awt.event.*;

public class EjemploVentanas {

        public static void main(String args[]) {
                Frame frame = new Frame();

                //Asignar a la ventana administrador de de siseño
                frame.setLayout(new FlowLayout());

                //Hacer que la ventana no sea dimensionable
                //frame.setResizable(false);
                //Asignar titulo, dimensiones y punto a partir del que se
                //desarrolla, y color de relleno
                frame.setTitle("Mi primera ventanita");
                frame.setBounds(100, 40, 250, 250);
                frame.setBackground(Color.cyan);

                //Crear botón y asignar color para su etiqueta
                Button b1 = new Button("Aceptar");
                b1.setForeground(Color.red);

                Button b2 = new Button("Cancelar");
                b2.setForeground(Color.green);

                //Crear cuadro de texto y asignar color de relleno y color del texto
                TextField tf = new TextField("Esto es un cuadro de texto");
                tf.setForeground(Color.white);
                tf.setBackground(Color.blue);

                //Asignar un icono a la barra de título de la ventana
                frame.setIconImage(frame.getToolkit().getImage("imagenes/imagen01.gif"));

                //Agregar componentes a la ventana
                frame.add(b1);
                frame.add(b2);
                frame.add(tf);

                //Dimensionar la ventana con el fin de que ocupe el �rea justa para
                //que quepan todos sus componentes
                //frame.pack();
                //Finalizar programa al cerrar la ventana mediante
                //una clase interna anónima. Se verá en el siguiente tema
                frame.addWindowListener(new WindowAdapter() {
                        public void windowClosing(WindowEvent e) {
                                System.exit(0);
                        }
                });

                //Hacer visible la ventana
                frame.setVisible(true);
        }
}