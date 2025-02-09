package org.example.projectPolyhedron;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Esta clase denominada PyramidWindow define una ventana para
 * ingresar los datos de una pirámide y calcular su volumen y superficie.
 * @version 1.2/2025
 */
public class PyramidWindow extends JFrame implements ActionListener {
    
    // Un contenedor de elementos gráficos
    private Container contentPane;
    
    // Etiquetas estáticas para identificar los campos de texto a ingresar y calcular
    private JLabel base, height, apothem, volume, area;
    
    // Campos de texto a ingresar
    private JTextField baseField, heightField, apothemField;
    
    // Botón para realizar los cálculos numéricos
    private JButton compute;
    
    /**
     * Constructor de la clase PyramidWindow
     */
    public PyramidWindow() {
        start();
        setTitle("Pirámide"); // Establece el título de la ventana
        setSize(280,240); // Establece el tamaño de la ventana
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
        
        // Establece la etiqueta y campo de texto para la base de la pirámide
        base = new JLabel();
        base.setText("Base (cms):");
        // Establece la posición de la etiqueta de la base de la pirámide
        base.setBounds(20, 20, 135, 23);
        
        baseField = new JTextField();
        // Establece la posición del campo de texto de la base de la pirámide
        baseField.setBounds(120, 20, 135, 23);
        
        // Establece la etiqueta y campo de texto para la altura de la pirámide
        height = new JLabel();
        height.setText("Altura (cms):");
        // Establece la posición de la etiqueta de la altura de la pirámide
        height.setBounds(20, 50, 135, 23);
        
        heightField = new JTextField();
        // Establece la posición del campo de texto de la altura de la pirámide
        heightField.setBounds(120, 50, 135, 23);
        
        // Establece la etiqueta y campo de texto para el apotema de la pirámide
        apothem = new JLabel();
        apothem.setText("Apotema (cms):");
        // Establece la posición de la etiqueta del apotema de la pirámide
        apothem.setBounds(20, 80, 135, 23);
        
        apothemField = new JTextField();
        // Establece la posición del campo de texto del apotema de la pirámide
        apothemField.setBounds(120, 80, 135, 23);
        
        /* Establece el botón para calcular volumen y superficie de la pirámide */
        compute = new JButton();
        compute.setText("Calcular");
        // Establece la posición del botón calcular
        compute.setBounds(120, 110, 135, 23);
        // Agrega al botón un ActionListener para que gestione eventos del botón
        compute.addActionListener(this);
        
        // Establece la etiqueta y el valor del volumen de la pirámide
        volume = new JLabel();
        volume.setText("Volumen (cm3):");
        // Establece la posición de la etiqueta de volumen de la pirámide
        volume.setBounds(20, 140, 135, 23);
        
        // Establece la etiqueta y el valor de la superficie de la pirámide
        area = new JLabel();
        area.setText("Superficie (cm2):");
        // Establece la posición de la etiqueta de superficie de la pirámide
        area.setBounds(20, 170, 135, 23);
        
        // Se añade cada componente gráfico al contenedor de la ventana
        contentPane.add(base);
        contentPane.add(baseField);
        
        contentPane.add(height);
        contentPane.add(heightField);
        
        contentPane.add(apothem);
        contentPane.add(apothemField);
        
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
        
        Pyramid pyramid;
        double base;
        double height;
        double apothem;
        
        try {
            
            // Se obtiene y convierte el valor numérico de la base
            base = Double.parseDouble(baseField.getText());
            
            // Se obtiene y convierte el valor numérico de la altura
            height = Double.parseDouble(heightField.getText());
            
            // Se obtiene y convierte el valor numérico del apotema
            apothem = Double.parseDouble(apothemField.getText());
            
            // Se crea un objeto Pirámide
            pyramid = new Pyramid(base, height, apothem);
            
            // Se muestra el volumen
            volume.setText("Volumen (cm3): " + String.format("%.2f", pyramid.computeVolume()));
            
            // Se muestra la superficie
            area.setText("Superficie (cm2): " + String.format("%.2f",
                    pyramid.computeArea()));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Campo nulo o error en formato de número", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
