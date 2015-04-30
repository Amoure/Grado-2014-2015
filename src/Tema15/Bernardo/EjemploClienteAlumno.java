/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tema15.Bernardo;
import java.net.*;
import java.io.*;

public class EjemploClienteAlumno {

        Socket socket;
        DataOutputStream dos;

        public EjemploClienteAlumno() {
                try {
                        //Crear un socket de cliente que se conecta con un socket de servidor
                        //ejecutándose en la misma máquina y a la escucha en el puerto 2525
                        socket = new Socket("10.2.7.33", 2525);

                        //Flujo de escritura para enviar datos al servidor
                        dos = new DataOutputStream(socket.getOutputStream());

                        //Enviar datos mediante los métodos adecuados
                        dos.writeUTF("Adrian");
                        dos.writeDouble(5.4);

                        cerrarRecursosCliente();

                } catch (IOException e) {
                        System.out.println("Error en EjemploCliente---" + e.toString());
                        e.printStackTrace();
                }
        }

        //Cerrar recursos empleados por el cliente en su conexión con el servidor
        public void cerrarRecursosCliente() {
                try {
                        dos.close();
                        socket.close();
                        System.out.println("Recursos cerrados en cliente");
                } catch (IOException e) {
                        e.printStackTrace();
                }
        }

        public static void main(String args[]) {
                new EjemploClienteAlumno();
        }
}