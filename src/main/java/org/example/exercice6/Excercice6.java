package org.example.exercice6;

import javax.swing.*;
import java.awt.*;

public class Excercice6 {
    
    public static void run() {
        JFrame window = new JFrame("Ejercicio 18 - Cálculo de Empleado");
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize(500, 400);
        window.setLayout(new BorderLayout());
        window.setLocationRelativeTo(null); // Centra la ventana en la pantalla
        
        // Panel principal
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(245, 245, 245));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        
        // Panel del formulario
        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBackground(Color.WHITE);
        formPanel.setBorder(BorderFactory.createTitledBorder("Información del Empleado"));
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Margen entre componentes
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        // Nombre
        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel.add(new JLabel("Nombre:"), gbc);
        JTextField nameField = new JTextField(15);
        gbc.gridx = 1;
        formPanel.add(nameField, gbc);
        nameField.setToolTipText("Ingresa el nombre del empleado.");
        
        // Horas laborales
        gbc.gridx = 0;
        gbc.gridy = 1;
        formPanel.add(new JLabel("Horas laborales:"), gbc);
        JTextField workHoursField = new JTextField(15);
        gbc.gridx = 1;
        formPanel.add(workHoursField, gbc);
        workHoursField.setToolTipText("Ingresa la cantidad de horas trabajadas.");
        
        // Valor de hora de trabajo
        gbc.gridx = 0;
        gbc.gridy = 2;
        formPanel.add(new JLabel("Valor por hora ($):"), gbc);
        JTextField rateWorkHourField = new JTextField(15);
        gbc.gridx = 1;
        formPanel.add(rateWorkHourField, gbc);
        rateWorkHourField.setToolTipText("Ingresa el valor por cada hora laboral.");
        
        // Retención salarial
        gbc.gridx = 0;
        gbc.gridy = 3;
        formPanel.add(new JLabel("Retención (%):"), gbc);
        JTextField taxSalaryField = new JTextField(15);
        gbc.gridx = 1;
        formPanel.add(taxSalaryField, gbc);
        taxSalaryField.setToolTipText("Ingresa el porcentaje de retención salarial.");
        
        // Botón de calcular
        JButton computeButton = new JButton("Calcular");
        computeButton.setBackground(new Color(60, 179, 113)); // Verde claro
        computeButton.setForeground(Color.WHITE);
        computeButton.setFocusPainted(false);
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        computeButton.setPreferredSize(new Dimension(150, 30));
        formPanel.add(computeButton, gbc);
        
        // Panel para mostrar resultados
        JPanel resultPanel = new JPanel(new BorderLayout());
        resultPanel.setBackground(Color.WHITE);
        resultPanel.setBorder(BorderFactory.createTitledBorder("Resultados"));
        JLabel resultLabel = new JLabel(" ", JLabel.CENTER);
        resultLabel.setFont(new Font("Arial", Font.BOLD, 14));
        resultPanel.add(resultLabel, BorderLayout.CENTER);
        
        // Agregar componentes a la ventana principal
        mainPanel.add(formPanel, BorderLayout.CENTER);
        mainPanel.add(resultPanel, BorderLayout.SOUTH);
        window.add(mainPanel);
        
        // Acción del botón de calcular
        computeButton.addActionListener(evt -> {
            try {
                String name = nameField.getText().trim();
                float workHours = Float.parseFloat(workHoursField.getText().trim());
                float rateWorkHour = Float.parseFloat(rateWorkHourField.getText().trim());
                float taxSalary = Float.parseFloat(taxSalaryField.getText().trim());
                
                if (name.isEmpty()) {
                    showError("El campo 'Nombre' no puede estar vacío.");
                    return;
                }
                if (workHours < 0 || rateWorkHour < 0 || taxSalary < 0 || taxSalary > 100) {
                    showError("Verifica que los valores numéricos sean válidos.");
                    return;
                }
                
                Employed.setRateWorkHour(rateWorkHour);
                Employed.setTaxSalary(taxSalary / 100);
                Employed employed = new Employed(0, name, workHours);
                
                resultLabel.setText("<html><body><strong>Empleado:</strong> " + employed.toString() + "</body></html>");
            } catch (NumberFormatException ex) {
                showError("Por favor ingresa valores numéricos válidos en los campos correspondientes.");
            }
        });
        
        // Mostrar ventana
        window.setVisible(true);
    }
    
    private static void showError(String message) {
        JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
    }
}