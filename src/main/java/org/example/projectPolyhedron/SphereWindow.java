package org.example.projectPolyhedron;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Esta clase denominada VentanaEsfera define una ventana para
 * ingresar los datos de una esfera y calcular su volumen y superficie.
 * @version 1.2/2020
 */
public class SphereWindow extends JFrame implements ActionListener {
    
    // Un contenedor de elementos gráficos
    private Container contentPane;
    
    // Etiquetas estáticas para identificar los campos de texto a ingresar y calcular
    private JLabel radius, volume, area;
    private JTextField radiusField; // Campo de texto a ingresar
    private JButton compute; // Botón para realizar los cálculos numéricos
    
    /**
     * Constructor de la clase SphereWindow
     */
    public SphereWindow() {
        start();
        setTitle("Esfera"); // Establece el título de la ventana
        setSize(280,200); // Establece el tamaño de la ventana
        setLocationRelativeTo(null); // La ventana se posiciona en el centro de la pantalla
        setResizable(false); // Establece que el botón de cerrar permitirá salir de la aplicación
    }
    
    /**
     * Metodo que crea la ventana con sus diferentes componentes
     * gráficos
     */
    private void start() {
        contentPane = getContentPane(); // Obtiene el panel de contenidos de la ventana
        contentPane.setLayout(null); // Establece que el contenedor no tiene un layout
        
        // Establece la etiqueta y campo de texto para el radio de la esfera
        radius = new JLabel();
        radius.setText("Radio (cms):");
        // Establece la posición de la etiqueta de radio de la esfera
        radius.setBounds(20, 20, 135, 23);
        
        radiusField = new JTextField();
        // Establece la posición del campo de texto de radio de la esfera
        radiusField.setBounds(100, 20, 135, 23);
        
        // Establece el botón para calcular el volumen y superficie de la esfera
        compute = new JButton();
        compute.setText("Calcular");
        // Establece la posición del botón calcular
        compute.setBounds(100, 50, 135, 23);
        // Agrega al botón un ActionListener para que gestione eventos del botón
        compute.addActionListener(this);
        
        // Establece la etiqueta y el valor del volumen de la esfera
        volume = new JLabel();
        volume.setText("Volumen (cm3):");
        // Establece la posición de la etiqueta de volumen de la esfera
        volume.setBounds(20, 90, 135, 23);
        
        // Establece la etiqueta y el valor de la superficie de la esfera
        area = new JLabel();
        area.setText("Superficie (cm2):");
        // Establece la posición de la etiqueta de superficie de la esfera
        area.setBounds(20, 120, 135, 23);
        
        // Se añade cada componente gráfico al contenedor de la ventana
        contentPane.add(radius);
        contentPane.add(radiusField);
        
        contentPane.add(compute);
        contentPane.add(volume);
        contentPane.add(area);
    }
    
    /**
     * Metodo que gestiona los eventos generados en la ventana de la
     * esfera throws Exception Excepción al ingresar un campo nulo o
     * error en formato de número
     */
    @Override
    public void actionPerformed (ActionEvent event) {
        if (event.getSource() == compute) { // Si se pulsa el botón Calcular
            try {
                
                // Se obtiene y convierte el valor numérico del radio
                double radio = Double.parseDouble(radiusField.getText());
                
                Sphere sphere = new Sphere(radio); // Se crea un objeto Esfera
                
                // Se muestra el volumen
                volume.setText("Volumen (cm3): " + String.format("%.2f", sphere.computeVolume()));
                
                // Se muestra la superficie
                area.setText("Superficie (cm2): " + String.format("%.2f",
                        sphere.computeArea()));
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Campo nulo o error en formato de número",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
