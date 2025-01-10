package org.example;

//import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import static java.lang.Math.sqrt;

public class Excercice17{

    //private static Scanner sc = new Scanner(System.in);
    
    public static void run() {
        
        /*
        System.out.println("Este programa calcula la soluciones de la equación cuadratica (si " +
                "las tiene en los reales): (a * x^2) + (b * x) + (c)");
        
        System.out.print("Digita el valor del coeficiente del termino cuadratico (-> (a) * x^2)" +
                ": ");
        double a = sc.nextDouble();
        
        System.out.print("Digita el valor del coeficiente del termino de primer grado (-> (b) * " +
                "x): ");
        double b = sc.nextDouble();
        
        System.out.print("Digita el valor del coeficiente de la equación (-> (c)): ");
        double c = sc.nextDouble();
        
        double discriminant = (b*b) - (4*a*c);
        
        if (discriminant < 0) {
            System.out.println("La ecuación no tiene soluciones en los reales");
        } else {
            double denominator = 2 * a;
            double sol1 = (-b + sqrt(discriminant))/denominator;
            double sol2 = (-b - sqrt(discriminant))/denominator;
            
            System.out.println("Las soluciones de la equación cuadratica son: x_1 = " + sol1 + " x_2 = " + sol2);
        }
        
        System.out.println("Ejercicio Propuesto Resuelto: 23");
        */
        
        JFrame frame = new JFrame("Ejercicio 23 - Resolución de Ecuaciones Cuadráticas");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(4, 2, 10, 10));
        
        JLabel aLabel = new JLabel("A:");
        JLabel bLabel = new JLabel("B:");
        JLabel cLabel = new JLabel("C:");
        
        JTextField aField = new JTextField();
        JTextField bField = new JTextField();
        JTextField cField = new JTextField();
        
        JButton computeButton = new JButton("Calcular");
        
        inputPanel.add(aLabel);
        inputPanel.add(aField);
        
        inputPanel.add(bLabel);
        inputPanel.add(bField);
        
        inputPanel.add(cLabel);
        inputPanel.add(cField);
        
        inputPanel.add(new JLabel("")); // Espacio vacío
        inputPanel.add(computeButton);
        
        JTextArea resultArea = new JTextArea(5, 30);
        resultArea.setEditable(false);
        JScrollPane resultScrollPane = new JScrollPane(resultArea);
        
        JPanel resultPanel = new JPanel();
        resultPanel.setLayout(new BorderLayout());
        resultPanel.setBorder(BorderFactory.createTitledBorder("Resultados"));
        resultPanel.add(resultScrollPane, BorderLayout.CENTER);
        
        computeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Leer los coeficientes
                    double a = Double.parseDouble(aField.getText());
                    double b = Double.parseDouble(bField.getText());
                    double c = Double.parseDouble(cField.getText());
                    
                    // Calcular el discriminante
                    double discriminant = (b * b) - (4 * a * c);
                    
                    // Verificar si hay soluciones reales
                    if (discriminant < 0) {
                        resultArea.setText("La ecuación no tiene soluciones reales");
                    } else {
                        double denominator = 2 * a;
                        double sol1 = (-b + Math.sqrt(discriminant)) / denominator;
                        double sol2 = (-b - Math.sqrt(discriminant)) / denominator;
                        
                        resultArea.setText("Las soluciones de la ecuación cuadrática son:\n");
                        resultArea.append("x₁ = " + sol1 + "\n");
                        resultArea.append("x₂ = " + sol2 + "\n");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, introduce valores numéricos " +
                            "válidos.", "Error", JOptionPane.ERROR_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,
                            "Ha ocurrido un error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        // Añadir los paneles a la ventana principal
        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(resultPanel, BorderLayout.CENTER);
        
        // Mostrar la ventana
        frame.setVisible(true);
    }
}

