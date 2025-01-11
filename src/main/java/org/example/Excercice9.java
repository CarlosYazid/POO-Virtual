package org.example;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Excercice9 {
    
    public static void run() {
        // Crear ventana principal
        JFrame frame = new JFrame("Ejercicio 7 - Comparar Números");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLayout(new BorderLayout(10, 10)); // Espaciado entre los componentes principales
        
        // --- Panel de inputs ---
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(2, 2, 10, 10)); // Espaciado entre filas y columnas
        inputPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createTitledBorder("Números"),
                new EmptyBorder(10, 10, 10, 10) // Margen interno dentro del panel
        ));
        
        JLabel aLabel = new JLabel("A: ", JLabel.RIGHT);
        JTextField aField = new JTextField();
        JLabel bLabel = new JLabel("B: ", JLabel.RIGHT);
        JTextField bField = new JTextField();
        
        inputPanel.add(aLabel);
        inputPanel.add(aField);
        inputPanel.add(bLabel);
        inputPanel.add(bField);
        
        // --- Botón para comparar ---
        JButton compareButton = new JButton("Comparar");
        compareButton.setBackground(new Color(76, 175, 80)); // Verde
        compareButton.setForeground(Color.WHITE);
        compareButton.setFont(new Font("Arial", Font.BOLD, 16));
        
        // --- Panel de resultado ---
        JPanel resultPanel = new JPanel();
        resultPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        resultPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createTitledBorder(new TitledBorder("Resultado")),
                new EmptyBorder(10, 10, 10, 10) // Margen interno dentro del panel
        ));
        
        JLabel result = new JLabel("");
        result.setFont(new Font("Arial", Font.BOLD, 18));
        result.setForeground(new Color(244, 67, 54)); // Rojo para destacar
        resultPanel.add(result);
        
        // Acción del botón
        compareButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(aField.getText());
                    int b = Integer.parseInt(bField.getText());
                    
                    if (a > b) {
                        result.setText("A es mayor que B");
                    } else if (a < b) {
                        result.setText("B es mayor que A");
                    } else {
                        result.setText("A y B son iguales.");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Por favor, ingrese números válidos.",
                            "Error de entrada", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        // --- Crear un panel principal con margen alrededor de la ventana ---
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(10, 10)); // Espaciado interno
        mainPanel.setBorder(new EmptyBorder(15, 15, 15, 15)); // Bordes externos (vacío) entre el contenido y la ventana
        
        mainPanel.add(inputPanel, BorderLayout.CENTER); // Panel de input en el centro
        mainPanel.add(compareButton, BorderLayout.SOUTH); // Botón en la parte inferior
        mainPanel.add(resultPanel, BorderLayout.NORTH); // Panel de resultado arriba
        
        // Añadir el panel principal al marco
        frame.add(mainPanel);
        
        // Hacer visible la ventana
        frame.setVisible(true);
    }
}