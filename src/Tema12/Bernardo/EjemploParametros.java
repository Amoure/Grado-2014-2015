package Tema12.Bernardo;

import java.awt.*;
import java.applet.*;

public class EjemploParametros extends Applet {

        String nombre, apellidos, edad;

        public void init() {
                setBackground(Color.black);
                setFont(new Font("Serif", Font.PLAIN, 20));
                nombre = getParameter("nombre");
                apellidos = getParameter("apellido");
                edad = getParameter("edad");
        }

        public void paint(Graphics g) {
                g.setColor(Color.yellow);
                g.drawString("Mi nombre es " + nombre + ", mi primer apellido es "
                          + apellidos + " y tengo " + edad + " años", 25, 80);
        }
}