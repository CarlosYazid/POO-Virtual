package org.example.projectPolyhedron;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Esta clase denominada CylinderWindow define una ventana para
 * ingresar los datos de un cilindro y calcular su volumen y superficie.
 * @version 1.2/2025
 */
public class CylinderWindow extends JFrame implements ActionListener {
    
    // Un contenedor de elementos gráficos
    private Container contentPane;
    
    // Etiquetas estáticas para identificar los campos de texto a ingresar y calcular
    private JLabel radius, height, volume, area;
    
    // Campos de texto a ingresar
    private JTextField radiusField, heightField;
    
    // Botón para realizar los cálculos numéricos
    private JButton compute;
    
    /**
     * Constructor de la clase CylinderWindow
     */
    public CylinderWindow () {
        start();
        setTitle("Cilindro"); // Establece el título de la ventana
        setSize(280, 210); // Establece el tamaño de la ventana
        setLocationRelativeTo(null); // La ventana se posiciona en el centro de la pantalla
        setResizable(false); // Establece que el botón de cerrar permitirá salir de la aplicación
    }
    
    /**
     * Metodo que crea la ventana con sus diferentes componentes
     * gráficos
     */
    private void start () {
        contentPane = getContentPane(); // Obtiene el panel de contenidos de la ventana
        contentPane.setLayout(null); // Establece que el contenedor no tiene un layout
        
        // Establece la etiqueta y campo de texto para el radio del cilindro
        radius = new JLabel();
        radius.setText("Radio (cms):");
        // Establece la posición de la etiqueta de radio del cilindro
        radius.setBounds(20, 20, 135, 23);
        
        radiusField = new JTextField();
        // Establece la posición del campo de texto de radio del cilindro
        radiusField.setBounds(100, 20, 135, 23);
        
        // Establece la etiqueta y campo de texto para la altura del cilindro
        height = new JLabel();
        height.setText("Altura (cms):");
        // Establece la posición de la etiqueta de altura del cilindro
        height.setBounds(20, 50, 135, 23);
        
        heightField = new JTextField();
        // Establece la posición del campo de texto de altura del cilindro
        heightField.setBounds(100, 50, 135, 23);
        
        // Establece el botón para calcular el volumen y superficie del cilindro
        compute = new JButton();
        compute.setText("Calcular");
        // Establece la posición del botón calcular
        compute.setBounds(100, 80, 135, 23);
        
        // Agrega al botón un ActionListener para que gestione eventos del botón
        compute.addActionListener(this);
        
        // Establece la etiqueta y el valor del volumen del cilindro
        volume = new JLabel();
        volume.setText("Volumen (cm3):");
        // Establece la posición de la etiqueta de volumen del cilindro
        volume.setBounds(20, 110, 135, 23);
        
        // Establece la etiqueta y el valor de la superficie del cilindro
        area = new JLabel();
        area.setText("Superficie (cm2):");
        
        // Establece la posición de la etiqueta de superficie del cilindro
        area.setBounds(20, 140, 135, 23);
        
        // Se añade cada componente gráfico al contenedor de la ventana
        contentPane.add(radius);
        contentPane.add(radiusField);
        
        contentPane.add(height);
        contentPane.add(heightField);
        
        contentPane.add(compute);
        
        contentPane.add(volume);
        contentPane.add(area);
    }
    
    /**
     * Metodo que gestiona los eventos generados en la ventana del
     * cilindro throws Exception Excepción al ingresar un campo nulo o
     * error en formato de número
     */
    @Override
    public void actionPerformed (ActionEvent e) {
        
        // Se inicializan el radio y la altura del cilindro
        double radius;
        double height;
        
        try {
            // Se obtiene el radio del cilindro ingresado
            radius = Double.parseDouble(radiusField.getText());
            
            // Se obtiene la altura del cilindro ingresada
            height = Double.parseDouble(heightField.getText());
            
            // Se crea un objeto Cilindro
            Cylinder cylinder = new Cylinder(radius, height);
            
            // Se calcula y muestra el volumen
            volume.setText("Volumen (cm3): " + String.format("%.2f", cylinder.computeVolume()));
            
            // Se calcula y muestra la superficie
            area.setText("Superficie (cm2): " + String.format("%.2f", cylinder.computeArea()));
            
        } catch  (Exception ex) {
            JOptionPane.showMessageDialog(null, "Campo nulo o error en formato de numero", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}