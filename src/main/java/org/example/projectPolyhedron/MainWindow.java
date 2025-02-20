package org.example.projectPolyhedron;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Esta clase denominada MainWindow define una interfaz gráfica
 * que permitirá consultar un menú principal con tres figuras
 * geométricas.
 * @version 1.2/2025
 */
public class MainWindow extends JFrame implements ActionListener {
    
        // Un contenedor de elementos gráficos
        private Container contentPane;
        // Botones para seleccionar una figura geométrica determinada
        private JButton cylinder, sphere, pyramid;
    
        /**
        * Constructor de la clase MainWindow
        */
        public MainWindow() {
            start();
            setTitle("Figuras"); // Establece el título de la ventana
            setSize(350,160); // Establece el tamaño de la ventana
            setLocationRelativeTo(null); // La ventana se posiciona en el centro de la pantalla
            // Establece que el botón de cerrar permitirá salir de la aplicación
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    
        /**
        * Metodo que crea la ventana con sus diferentes componentes graficos
        */
        private void start() {
            contentPane = getContentPane(); // Obtiene el panel de contenidos de la ventana
            contentPane.setLayout(null); // Establece que el contenedor no tiene un layout
            
            // Establece el botón del cilindro
            cylinder = new JButton();
            cylinder.setText("Cilindro");
            // Establece la posición del botón del cilindro
            cylinder.setBounds(20, 50, 80, 23);
            // Agrega al botón un ActionListener para que gestione eventos del botón
            cylinder.addActionListener(this);
            
            // Establece el botón de la esfera
            sphere = new JButton();
            sphere.setText("Esfera");
            // Establece la posición del botón de la esfera
            sphere.setBounds(125, 50, 80, 23);
            // Agrega al botón un ActionListener para que gestione eventos del botón
            sphere.addActionListener(this);
            
            // Establece el botón de la pirámide
            pyramid = new JButton();
            pyramid.setText("Pirámide");
            // Establece la posición del botón de la pirámide
            pyramid.setBounds(225, 50, 100, 23);
            // Agrega al botón un ActionListener para que gestione eventos del botón
            pyramid.addActionListener(this);
            
            // Se añade cada componente gráfico al contenedor de la ventana
            contentPane.add(cylinder);
            contentPane.add(sphere);
            contentPane.add(pyramid);
        }
    
        /**
        * Metodo que gestiona los eventos generados en la ventana principal
        */
        @Override
        public void actionPerformed (ActionEvent event) {
            
            JFrame window;
            
            if (event.getSource() == sphere) { // Si se pulsa el botón esfera
                
                window = new SphereWindow(); // Crea la ventana de la esfera
                window.setVisible(true); // Establece que se visualice la ventana de la esfera
                
            } else if (event.getSource() == cylinder) {// Si se pulsa el botón cilindro
                
                window = new CylinderWindow(); // Crea la ventana del cilindro
                window.setVisible(true); // Establece que se visualice la ventana del cilindro
                
            } else if (event.getSource() == pyramid) { // Si se pulsa el botón pirámide
                
                window = new PyramidWindow(); // Crea la ventana de la pirámide
                window.setVisible(true); // Establece que se visualice la ventana de la pirámide
                
            }
        }

    
        
}
