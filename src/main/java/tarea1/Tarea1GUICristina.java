/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tarea1;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author cristina
 */
public class Tarea1GUICristina extends JPanel {

    public static void main(String[] args) {
        //Ejercicio1
//        // Construimos la ventana
//        JFrame ventanaPrincipal = new JFrame("Cristina Jiménez");
//
//        // Establecemos tamaño y posición
//        ventanaPrincipal.setSize(800, 600);
//        ventanaPrincipal.setLocationRelativeTo(null);
//
//        // Añadimos un objeto MiPanel al JFrame
//        ventanaPrincipal.add(new MiPanel(Color.ORANGE));
//
//        // Hacemos visible la ventana
//        ventanaPrincipal.setVisible(true);
//
//        // Acción por defecto al pulsar el botón de cierre de la ventana
//        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//Ejercicio2
// Construimos la ventana
        JFrame ventanaPrincipal = new JFrame("Cristina Jiménez");

        // Establecemos tamaño y posición
        ventanaPrincipal.setSize(800, 600);
        ventanaPrincipal.setLocationRelativeTo(null);

        // Hacemos visible la ventana
        ventanaPrincipal.setVisible(true);

        // Acción por defecto al pulsar el botón de cierre de la ventana
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Establecemos el layout del JFrame
        ventanaPrincipal.setLayout(new BorderLayout());

        //La ventana no se puede redimensionar
        ventanaPrincipal.setResizable(false);

        //Creamos los 5 paneles y los añadimos a la ventana
        MiPanel verde = new MiPanel(Color.GREEN);
        verde.getEtiqueta().setText("panel verde");
        ventanaPrincipal.add(verde, BorderLayout.SOUTH);

        MiPanel amarillo = new MiPanel(Color.YELLOW);
        amarillo.getEtiqueta().setText("panel amarillo");
        ventanaPrincipal.add(amarillo, BorderLayout.EAST);

        MiPanel magenta = new MiPanel(Color.MAGENTA);
        magenta.getEtiqueta().setText("panel magenta");
        ventanaPrincipal.add(magenta, BorderLayout.WEST);

        MiPanel naranja = new MiPanel(Color.ORANGE);
        naranja.getEtiqueta().setText("panel naranja");
        ventanaPrincipal.add(naranja, BorderLayout.NORTH);

        MiPanel azul = new MiPanel(Color.BLUE);
        azul.getEtiqueta().setText("panel azul");
        ventanaPrincipal.add(azul, BorderLayout.CENTER);
        

    }
}
