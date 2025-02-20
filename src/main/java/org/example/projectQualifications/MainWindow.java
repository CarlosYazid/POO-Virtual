package org.example.projectQualifications;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * Esta clase denominada MainWindow define una interfaz gráfica
 * que permitirá crear un array de notas. Luego, se puede calcular el
 * promedio de notas, la desviación, la nota mayor y la nota menor del
 * array.
 * @version 1.2/2025
 */
public class MainWindow extends JFrame implements ActionListener {
    
    // Un contenedor de elementos gráficos
    private Container contentPane;
    
    // Etiquetas estáticas de cada nota
    private JLabel qualification1, qualification2, qualification3, qualification4, qualification5
            , average, deviation, upper, lower;
    
    // Campos de ingreso de cada nota
    private JTextField qualificationField1, qualificationField2, qualificationField3,
            qualificationField4, qualificationField5;
    
    // Botones para realizar cálculos y para borrar las notas
    private JButton compute, clean;
    
    /**
     * Constructor de la clase VentanaPrincipal
     */
    public MainWindow() {
        start();
        setTitle("Notas"); // Establece el título de la ventana
        setSize(280,380); // Establece el tamaño de la ventana
        setLocationRelativeTo(null); // La ventana se posiciona en el centro de la pantalla
        // Establece que el botón de cerrar permitirá salir de la aplicación
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false); // Establece que el tamaño de la ventana no se puede cambiar
    }
    
    
    /**
     * Metodo que crea la ventana con sus diferentes componentes gráficos
     */
    private void start() {
        contentPane = getContentPane(); // Obtiene el panel de contenidos de la ventana
        
        contentPane.setLayout(null); // Establece que el contenedor no tiene un layout
        
        // Establece la etiqueta y el campo de texto de la nota 1
        qualification1 = new JLabel();
        qualification1.setText("Nota 1:");
        // Establece la posición de la etiqueta nota 1
        qualification1.setBounds(20, 20, 135, 23);
        
        qualificationField1 = new JTextField();
        // Establece la posición del campo de texto de la nota 1
        qualificationField1.setBounds(105, 20, 135, 23);
        
        // Establece la etiqueta y el campo de texto de la nota 2
        qualification2 = new JLabel();
        qualification2.setText("Nota 2:");
        // Establece la posición de la etiqueta nota 2
        qualification2.setBounds(20, 50, 135, 23);
        
        qualificationField2 = new JTextField();
        // Establece la posición del campo de texto de la nota 2
        qualificationField2.setBounds(105, 50, 135, 23);
        
        // Establece la etiqueta y el campo de texto de la nota 3
        qualification3 = new JLabel();
        qualification3.setText("Nota 3:");
        qualification3.setBounds(20, 80, 135, 23);
        
        // Establece la posición de la etiqueta nota 3
        qualificationField3 = new JTextField();
        // Establece la posición del campo de texto de la nota 3
        qualificationField3.setBounds(105, 80, 135, 23);
        
        // Establece la etiqueta y el campo de texto de la nota 4
        qualification4 = new JLabel();
        qualification4.setText("Nota 4:");
        // Establece la posición de la etiqueta nota 4
        qualification4.setBounds(20, 110, 135, 23);
        
        qualificationField4 = new JTextField();
        // Establece la posición del campo de texto de la nota 4
        qualificationField4.setBounds(105, 110, 135, 23);
        
        // Establece la etiqueta y el campo de texto de la nota 5
        qualification5 = new JLabel();
        qualification5.setText("Nota 5:");
        qualification5.setBounds(20, 140, 135, 23);
        
        // Establece la posición de la etiqueta nota 5
        qualificationField5 = new JTextField();
        // Establece la posición del campo de texto de la nota 5
        qualificationField5.setBounds(105, 140, 135, 23);
        
        // Establece el botón Calcular
        compute = new JButton();
        compute.setText("Calcular");
        // Establece la posición del botón Calcular
        compute.setBounds(20, 170, 100, 23);
        // Agrega al botón un ActionListener para que gestione eventos del botón
        compute.addActionListener(this);
        
        // Establece el botón Limpiar
        clean = new JButton();
        clean.setText("Limpiar");
        // Establece la posición del botón Limpiar
        clean.setBounds(125, 170, 80, 23);
        
        // Agrega al botón un ActionListener para que gestione eventos del botón
        clean.addActionListener(this);
        
        // Establece la etiqueta del promedio con su valor numérico
        average = new JLabel();
        average.setText("Promedio = ");
        // Establece la posición de la etiqueta promedio
        average.setBounds(20, 210, 135, 23);
        
        // Establece la etiqueta de la desviación con su valor numérico
        deviation = new JLabel();
        deviation.setText("Desviación = ");
        // Establece la posición de la etiqueta desviación
        deviation.setBounds(20, 240, 200, 23);
        
        // Establece la etiqueta de la nota mayor con su valor numérico
        upper = new JLabel();
        upper.setText("Nota mayor = ");
        // Establece la posición de la etiqueta nota mayor
        upper.setBounds(20, 270, 120, 23);
        
        // Establece la etiqueta de la nota menor con su valor numérico
        lower = new JLabel();
        lower.setText("Nota menor = ");
        // Establece la posición de la etiquete nota menor
        lower.setBounds(20, 300, 120, 23);
        
        // Se añade cada componente gráfico al contenedor de la ventana
        contentPane.add(qualification1);
        contentPane.add(qualificationField1);
        
        contentPane.add(qualification2);
        contentPane.add(qualificationField2);
        
        contentPane.add(qualification3);
        contentPane.add(qualificationField3);
        
        contentPane.add(qualification4);
        contentPane.add(qualificationField4);
        
        contentPane.add(qualification5);
        contentPane.add(qualificationField5);
        
        contentPane.add(compute);
        contentPane.add(clean);
        
        contentPane.add(average);
        contentPane.add(deviation);
        
        contentPane.add(upper);
        contentPane.add(lower);
    }
    
    /**
     * Metodo que gestiona los eventos generados en la ventana principal
     */
    @Override
    public void actionPerformed (ActionEvent e) {
        
        if (e.getSource() == compute) { // Si se pulsa el botón Calcular
            try {
                Qualification qualification = new Qualification(); // Se crea un objeto Notas
                
                // Se obtiene y convierte el valor numérico de la nota 1
                qualification.qualifications[0] = Double.parseDouble(qualificationField1.getText());
                
                // Se obtiene y convierte el valor numérico de la nota 2
                qualification.qualifications[1] = Double.parseDouble(qualificationField2.getText());
                
                // Se obtiene y convierte el valor numérico de la nota 3
                qualification.qualifications[2] = Double.parseDouble(qualificationField3.getText());
                
                // Se obtiene y convierte el valor numérico de la nota 4
                qualification.qualifications[3] = Double.parseDouble(qualificationField4.getText());
                
                // Se obtiene y convierte el valor numérico de la nota 5
                qualification.qualifications[4] = Double.parseDouble(qualificationField5.getText());
                
                // Se muestra el promedio formateado
                average.setText("Promedio = " + String.format("%.2f", qualification.computeAverage()));
                
                // Se muestra la desviación formateada
                deviation.setText("Desviación estándar = " + String.format("%.2f", qualification.computeDeviation()));
                
                // Se muestra el valor mayor formateado
                upper.setText("Valor mayor = " + qualification.upper());
                
                // Se muestra el valor menor formateado
                lower.setText("Valor menor = " + qualification.lower());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Campo nulo o error en formato de número", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == clean) {
            qualificationField1.setText("");
            qualificationField2.setText("");
            qualificationField3.setText("");
            qualificationField4.setText("");
            qualificationField5.setText("");
            
            average.setText("Promedio = ");
            deviation.setText("Desviación estándar = ");
            upper.setText("Valor mayor = ");
            lower.setText("Valor menor = ");
        }
    }
}
