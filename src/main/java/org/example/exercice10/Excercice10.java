package org.example.exercice10;

import javax.swing.*;
import java.awt.*;

public class Excercice10 {
    
    public static void run() {
        // Crear el marco principal
        JFrame frame = new JFrame("Ejercicio 10 - Cálculo de Matrícula");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout(10, 10)); // Espaciado entre elementos
        frame.getRootPane().setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15)); // Márgenes exteriores
        
        // ** Panel de campos de entrada **
        JPanel inputPanel = new JPanel(new GridLayout(3, 2, 10, 10)); // 3 filas, 2 columnas
        inputPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createTitledBorder("Datos del estudiante"), // Borde con título
                BorderFactory.createEmptyBorder(10, 10, 10, 10) // Márgenes internos del panel
        ));
        inputPanel.setPreferredSize(new Dimension(400, 200));
        
        // Campos de entrada
        JLabel nameLabel = new JLabel("Nombre del estudiante:");
        JTextField nameField = new JTextField();
        JLabel patrimonyLabel = new JLabel("Patrimonio:");
        JTextField patrimonyField = new JTextField();
        JLabel strataLabel = new JLabel("Estrato social (1 - 5):");
        JTextField strataField = new JTextField();
        
        // Personalizar etiquetas
        customizeLabel(nameLabel);
        customizeLabel(patrimonyLabel);
        customizeLabel(strataLabel);
        
        // Agregar campos y etiquetas al panel de entrada
        inputPanel.add(nameLabel);
        inputPanel.add(nameField);
        inputPanel.add(patrimonyLabel);
        inputPanel.add(patrimonyField);
        inputPanel.add(strataLabel);
        inputPanel.add(strataField);
        
        // ** Panel de resultado **
        JPanel resultPanel = new JPanel(new BorderLayout());
        resultPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createTitledBorder("Resultado"), // Borde con título
                BorderFactory.createEmptyBorder(10, 10, 10, 10) // Márgenes internos del panel
        ));
        resultPanel.setPreferredSize(new Dimension(400, 100));
        
        JLabel resultLabel = new JLabel("Esperando datos...", SwingConstants.CENTER);
        resultLabel.setFont(new Font("Arial", Font.BOLD, 14));
        resultLabel.setForeground(new Color(0, 128, 0)); // Verde oscuro
        resultPanel.add(resultLabel, BorderLayout.CENTER);
        
        // ** Botón de cálculo **
        JButton computeButton = new JButton("Calcular Matrícula");
        computeButton.setBackground(new Color(51, 153, 255)); // Azul claro
        computeButton.setForeground(Color.WHITE); // Texto blanco
        computeButton.setFocusPainted(false);
        computeButton.setFont(new Font("Arial", Font.BOLD, 14));
        computeButton.setPreferredSize(new Dimension(200, 40));
        
        // Evento del botón
        computeButton.addActionListener(e -> {
            try {
                String name = nameField.getText();
                float patrimony = Float.parseFloat(patrimonyField.getText());
                int strata = Integer.parseInt(strataField.getText());
                
                // Validaciones
                if (strata < 1 || strata > 5) {
                    JOptionPane.showMessageDialog(frame, "El estrato debe estar entre 1 y 5.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (name.isBlank()) {
                    JOptionPane.showMessageDialog(frame, "El nombre del estudiante no puede quedar vacío.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (patrimony <= 0) {
                    JOptionPane.showMessageDialog(frame, "El patrimonio debe ser mayor a 0.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                // Calculo de matrícula
                Student student = new Student(name, patrimony, strata);
                float tuition = student.computeUniversityTuition();
                resultLabel.setText("<html><div style='text-align: center;'>El estudiante con ID <b>" +
                        student.getId() + "</b><br>Debe pagar: <b>$" + tuition + "</b></div></html>");
                
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Por favor, ingresa valores válidos en todos los campos.",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
        
        // ** Panel principal para botón **
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(computeButton);
        
        // Agregar componentes al marco principal
        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(resultPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        
        frame.setVisible(true);
    }
    
    // Método utilitario para personalizar etiquetas
    private static void customizeLabel(JLabel label) {
        label.setFont(new Font("Arial", Font.PLAIN, 14));
        label.setForeground(new Color(51, 51, 51)); // Gris oscuro
    }
}