package org.example;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Excercice17 {
    
    public static void run() {
        // Crear la ventana principal
        JFrame frame = new JFrame("Ejercicio 23 - Resolución de Ecuaciones Cuadráticas");
        frame.setSize(500, 350);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout(15, 15)); // Espaciado entre paneles
        frame.setLocationRelativeTo(null);
        
        // **Panel de entrada**
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridBagLayout());
        inputPanel.setBorder(new EmptyBorder(10, 10, 10, 10)); // Márgenes internos del panel
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Espaciado entre componentes
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        JLabel titleLabel = new JLabel("Calculadora de Ecuaciones Cuadráticas");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        
        JLabel aLabel = new JLabel("Coeficiente A:");
        JLabel bLabel = new JLabel("Coeficiente B:");
        JLabel cLabel = new JLabel("Coeficiente C:");
        
        JTextField aField = new JTextField(10);
        JTextField bField = new JTextField(10);
        JTextField cField = new JTextField(10);
        
        JButton computeButton = new JButton("Calcular");
        computeButton.setBackground(new Color(66, 135, 245)); // Fondo azul claro
        computeButton.setForeground(Color.WHITE); // Texto blanco
        computeButton.setFont(new Font("Arial", Font.BOLD, 14));
        computeButton.setFocusPainted(false);
        
        // Agregar componentes al inputPanel
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        inputPanel.add(titleLabel, gbc);
        
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 1;
        inputPanel.add(aLabel, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 1;
        inputPanel.add(aField, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 2;
        inputPanel.add(bLabel, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 2;
        inputPanel.add(bField, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 3;
        inputPanel.add(cLabel, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 3;
        inputPanel.add(cField, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        inputPanel.add(computeButton, gbc);
        
        // **Panel de resultados**
        JPanel resultPanel = new JPanel(new GridLayout(2, 2, 10, 10)); // Grid para 2 etiquetas clave-valor
        resultPanel.setBorder(BorderFactory.createTitledBorder("Resultados"));
        
        JLabel x1Label = new JLabel("x₁:");
        JLabel x2Label = new JLabel("x₂:");
        
        JLabel x1Result = new JLabel("-"); // Mostrar el valor de x₁
        x1Result.setFont(new Font("Arial", Font.BOLD, 14));
        x1Result.setForeground(Color.BLUE);
        
        JLabel x2Result = new JLabel("-"); // Mostrar el valor de x₂
        x2Result.setFont(new Font("Arial", Font.BOLD, 14));
        x2Result.setForeground(Color.BLUE);
        
        resultPanel.add(x1Label);
        resultPanel.add(x1Result);
        resultPanel.add(x2Label);
        resultPanel.add(x2Result);
        
        // **Acción del botón Calcular**
        computeButton.addActionListener(e -> {
            try {
                // Leer los coeficientes
                double a = Double.parseDouble(aField.getText());
                double b = Double.parseDouble(bField.getText());
                double c = Double.parseDouble(cField.getText());
                
                // Calcular el discriminante
                double discriminant = (b * b) - (4 * a * c);
                
                // Calcular y mostrar resultados
                if (discriminant < 0) {
                    x1Result.setText("Indeterminado");
                    x2Result.setText("Indeterminado");
                    x1Result.setForeground(Color.RED);
                    x2Result.setForeground(Color.RED);
                } else {
                    double denominator = 2 * a;
                    double sol1 = (-b + Math.sqrt(discriminant)) / denominator;
                    double sol2 = (-b - Math.sqrt(discriminant)) / denominator;
                    
                    x1Result.setText(String.format("%.2f", sol1)); // Formatear a 2 decimales
                    x2Result.setText(String.format("%.2f", sol2));
                    x1Result.setForeground(Color.BLUE);
                    x2Result.setForeground(Color.BLUE);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Por favor, introduce valores numéricos válidos.", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "Ha ocurrido un error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
        
        // **Panel contenedor con márgenes exteriores**
        JPanel containerPanel = new JPanel(new BorderLayout(10, 10)); // Espaciado entre input y results
        containerPanel.setBorder(new EmptyBorder(10, 10, 10, 10)); // Márgenes exteriores
        containerPanel.add(inputPanel, BorderLayout.CENTER); // Agregar el panel de entrada
        containerPanel.add(resultPanel, BorderLayout.SOUTH); // Agregar el panel de resultados
        
        // **Agregar panel contenedor al marco principal**
        frame.add(containerPanel);
        
        // Hacer visible la ventana
        frame.setVisible(true);
    }
}