package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Excercice16 {
    
    public static void run() {
        // Crear el marco principal
        JFrame frame = new JFrame("Ejercicio 22 - Calculadora de Salario - Empleado");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLayout(new BorderLayout(10, 10)); // Espaciado entre zonas principales
        
        // ** PANEL 1: Panel de Entrada **
        JPanel inputPanel = new JPanel(new GridLayout(3, 2, 10, 10)); // Grid con separación entre filas/columnas
        inputPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createEmptyBorder(10, 10, 10, 10),
                BorderFactory.createTitledBorder("Datos del Empleado")
        ));
        
        // Campos y etiquetas de entrada
        JLabel nameLabel = new JLabel("Nombre del empleado:");
        JTextField nameField = new JTextField();
        
        JLabel hoursLabel = new JLabel("Horas trabajadas:");
        JTextField hoursField = new JTextField();
        
        JLabel rateHoursLabel = new JLabel("Valor por hora:");
        JTextField rateHoursField = new JTextField();
        
        // Añadir al panel de entrada
        inputPanel.add(nameLabel);
        inputPanel.add(nameField);
        inputPanel.add(hoursLabel);
        inputPanel.add(hoursField);
        inputPanel.add(rateHoursLabel);
        inputPanel.add(rateHoursField);
        
        // ** PANEL 2: Panel del Resultado **
        JPanel resultPanel = new JPanel(new BorderLayout());
        resultPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createEmptyBorder(10, 10, 10, 10),
                BorderFactory.createTitledBorder("Resultado")
        ));
        
        JLabel resultLabel = new JLabel(" ");
        resultLabel.setFont(new Font("Arial", Font.ITALIC, 14));
        resultLabel.setForeground(Color.DARK_GRAY);
        resultLabel.setHorizontalAlignment(SwingConstants.CENTER);
        
        resultPanel.add(resultLabel, BorderLayout.CENTER);
        
        // ** PANEL 3: Panel del Botón (Acciones) **
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JButton computeButton = new JButton("Calcular Salario");
        computeButton.setFont(new Font("Arial", Font.PLAIN, 16));
        computeButton.setBackground(new Color(72, 167, 200));
        computeButton.setForeground(Color.WHITE);
        computeButton.setFocusPainted(false);
        computeButton.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15));
        
        // Añadir el botón al panel de botones
        buttonPanel.add(computeButton);
        
        // Acción del botón
        computeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String name = nameField.getText().trim();
                    int hours = Integer.parseInt(hoursField.getText().trim());
                    float rateWorkHours = Float.parseFloat(rateHoursField.getText().trim());
                    
                    // Validaciones
                    if (name.isEmpty()) {
                        JOptionPane.showMessageDialog(frame, "El campo Nombre no puede estar vacío.",
                                "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    
                    if (hours <= 0) {
                        JOptionPane.showMessageDialog(frame, "El campo Horas no puede ser menor o igual a cero.",
                                "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    
                    if (rateWorkHours <= 0) {
                        JOptionPane.showMessageDialog(frame, "El campo Valor por hora no puede ser menor o igual a cero.",
                                "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    
                    // Cálculo del salario
                    float salary = hours * rateWorkHours;
                    if (salary > 450000) {
                        resultLabel.setText("<html><span style='color:green;'>Empleado " + name + " tiene un salario de: $" + salary + "</span></html>");
                    } else {
                        resultLabel.setText("<html><span style='color:orange;'>Empleado " + name + " tiene un salario básico.</span></html>");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Por favor, ingrese valores correctos.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        // ** CREAR PANEL CONTENEDOR PARA LOS MÁRGENES **
        JPanel mainContainer = new JPanel(new BorderLayout(10, 10));
        mainContainer.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Márgenes alrededor del contenido
        
        // Añadir paneles al contenedor principal
        mainContainer.add(inputPanel, BorderLayout.CENTER); // Panel de entradas en el centro
        mainContainer.add(resultPanel, BorderLayout.NORTH); // Panel del resultado en la parte superior
        mainContainer.add(buttonPanel, BorderLayout.SOUTH); // Panel del botón en la parte inferior
        
        // Establecer este contenedor como el contenido principal del frame
        frame.setContentPane(mainContainer);
        
        // Hacer visible el marco
        frame.setVisible(true);
    }
}