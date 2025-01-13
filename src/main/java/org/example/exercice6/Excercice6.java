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
        
        // Configurar el diseño del formulario con GridBagLayout
        formPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Margen entre componentes
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Nombre del empleado
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0.3; // El peso define cuánto espacio horizontal ocupa la etiqueta
        formPanel.add(new JLabel("Nombre:"), gbc);
        
        JTextField nameField = new JTextField();
        nameField.setPreferredSize(new Dimension(150, 25)); // Tamaño preferido explícito
        gbc.gridx = 1;
        gbc.weightx = 0.7; // Espacio extra horizontal para el campo de texto
        formPanel.add(nameField, gbc);

        // Horas laborales
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 0.3;
        formPanel.add(new JLabel("Horas laborales:"), gbc);
        
        JTextField workHoursField = new JTextField();
        workHoursField.setPreferredSize(new Dimension(150, 25));
        gbc.gridx = 1;
        gbc.weightx = 0.7;
        formPanel.add(workHoursField, gbc);

        // Valor por hora
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 0.3;
        formPanel.add(new JLabel("Valor por hora ($):"), gbc);
        
        JTextField rateWorkHourField = new JTextField();
        rateWorkHourField.setPreferredSize(new Dimension(150, 25));
        gbc.gridx = 1;
        gbc.weightx = 0.7;
        formPanel.add(rateWorkHourField, gbc);

        // Retención salarial
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weightx = 0.3;
        formPanel.add(new JLabel("Retención (%):"), gbc);
        
        JTextField taxSalaryField = new JTextField();
        taxSalaryField.setPreferredSize(new Dimension(150, 25));
        gbc.gridx = 1;
        gbc.weightx = 0.7;
        formPanel.add(taxSalaryField, gbc);

        // Botón de calcular
        JButton computeButton = new JButton("Calcular");
        computeButton.setBackground(new Color(60, 179, 113)); // Verde claro
        computeButton.setForeground(Color.WHITE);
        computeButton.setFocusPainted(false);
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2; // Ocupa dos columnas
        gbc.weightx = 1.0;
        computeButton.setPreferredSize(new Dimension(150, 30));
        formPanel.add(computeButton, gbc);
        
        // Panel para mostrar resultados
        JPanel resultPanel = new JPanel(new BorderLayout());
        resultPanel.setBackground(Color.WHITE);
        resultPanel.setBorder(BorderFactory.createTitledBorder("Resultados"));
        
        // Sección para actualizar el panel de resultados
        JLabel nameResult = new JLabel(" ");
        JLabel grossSalaryResult = new JLabel(" ");
        JLabel netSalaryResult = new JLabel(" ");

        // Actualizar el resultPanel
        resultPanel.setLayout(new GridBagLayout());
        GridBagConstraints resultGbc = new GridBagConstraints();
        resultGbc.insets = new Insets(5, 10, 5, 10);
        resultGbc.fill = GridBagConstraints.HORIZONTAL;

        // Nombre del empleado
        resultGbc.gridx = 0;
        resultGbc.gridy = 0;
        resultPanel.add(new JLabel("Nombre del empleado:"), resultGbc);
        resultGbc.gridx = 1;
        resultPanel.add(nameResult, resultGbc);

        // Salario bruto
        resultGbc.gridx = 0;
        resultGbc.gridy = 1;
        resultPanel.add(new JLabel("Salario bruto ($):"), resultGbc);
        resultGbc.gridx = 1;
        resultPanel.add(grossSalaryResult, resultGbc);

        // Salario neto
        resultGbc.gridx = 0;
        resultGbc.gridy = 2;
        resultPanel.add(new JLabel("Salario neto ($):"), resultGbc);
        resultGbc.gridx = 1;
        resultPanel.add(netSalaryResult, resultGbc);
        
        // Agregar componentes a la ventana principal
        mainPanel.add(formPanel, BorderLayout.CENTER);
        mainPanel.add(resultPanel, BorderLayout.SOUTH);
        window.add(mainPanel);
        
        // Actualización al calcular el salario
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
                
                // Actualizar etiquetas con los resultados
                nameResult.setText(employed.getName());
                grossSalaryResult.setText(String.format("%.2f", employed.getGrossSalary()));
                netSalaryResult.setText(String.format("%.2f", employed.getSalary()));
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