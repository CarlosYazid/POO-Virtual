package org.example.exercice7and8;

import javax.swing.*;
import java.awt.*;

public class Excercice7 {
    
    public static void run() {
        // Crear la ventana principal
        JFrame window = new JFrame("Ejercicio 19 - Triángulo Equilátero");
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize(500, 400);
        window.setLayout(new BorderLayout());
        window.setLocationRelativeTo(null);
        
        // Panel principal con un fondo de color suave
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(new Color(245, 245, 245)); // Color gris claro
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        // Agregar un título
        JLabel title = new JLabel("Calculadora de Triángulo Equilátero");
        title.setFont(new Font("Arial", Font.BOLD, 18));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        title.setForeground(new Color(60, 63, 65)); // Color oscuro
        mainPanel.add(title);
        
        // Espaciado
        mainPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        
        // Panel de entrada
        JPanel inputPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        inputPanel.setOpaque(false);
        
        JLabel sideLabel = new JLabel("Tamaño del lado:");
        JTextField sideInput = new JTextField(10);
        inputPanel.add(sideLabel);
        inputPanel.add(sideInput);
        mainPanel.add(inputPanel);
        
        // Botón para calcular
        JButton computeButton = new JButton("Calcular");
        computeButton.setFont(new Font("Arial", Font.BOLD, 14));
        computeButton.setBackground(new Color(76, 175, 80)); // Color verde
        computeButton.setForeground(Color.WHITE);
        computeButton.setFocusPainted(false);
        computeButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(computeButton);
        
        // Espaciado
        mainPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        
        // Panel de resultados
        JPanel resultPanel = new JPanel();
        resultPanel.setLayout(new GridLayout(3, 1, 10, 10));
        resultPanel.setOpaque(false);
        resultPanel.setBorder(BorderFactory.createTitledBorder("Resultados"));
        
        JLabel areaLabel = new JLabel("Área del triángulo: ");
        JLabel perimeterLabel = new JLabel("Perímetro del triángulo: ");
        JLabel heightLabel = new JLabel("Altura del triángulo: ");
        
        resultPanel.add(areaLabel);
        resultPanel.add(perimeterLabel);
        resultPanel.add(heightLabel);
        
        mainPanel.add(resultPanel);
        
        // Agregar mensaje al pie
        JLabel footer = new JLabel("Ingrese un número válido para calcular los resultados.");
        footer.setAlignmentX(Component.CENTER_ALIGNMENT);
        footer.setFont(new Font("Arial", Font.ITALIC, 12));
        footer.setForeground(Color.GRAY);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        mainPanel.add(footer);
        
        // Escuchador para el botón
        computeButton.addActionListener(e -> {
            try {
                
                double side = Double.parseDouble(sideInput.getText());
                
                if (side <= 0) {
                    throw new IllegalArgumentException("El lado debe ser mayor que cero.");
                }
                
                Triangle equilTriangle = new EquilTriangle(side);
                areaLabel.setText("Área del triángulo: " + equilTriangle.getArea());
                perimeterLabel.setText("Perímetro del triángulo: " + equilTriangle.getPerimeter());
                heightLabel.setText("Altura del triángulo: " + equilTriangle.getHeight());
                
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese un número válido.",
                        "Error de entrada", JOptionPane.ERROR_MESSAGE);
            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error de entrada",
                        JOptionPane.ERROR_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(),
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
        
        // Agregar el panel principal a la ventana
        window.add(mainPanel, BorderLayout.CENTER);
        window.setVisible(true);
    }
}