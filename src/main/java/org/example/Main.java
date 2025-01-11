package org.example;

import org.example.exercice10.Excercice10;
import org.example.exercice6.Excercice6;
import org.example.exercice7and8.Excercice7;

import javax.swing.*;
//import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Crear el frame principal
        JFrame frame = new JFrame("Seleccionar Ejercicio");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        
        // Crear panel principal y establecerle un diseño de GridLayout
        JPanel mainPanel = new JPanel(new GridLayout(3, 1, 10, 10)); // 3 filas, espacio de 10px entre elementos
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Márgenes: 10px en cada lado
        
        // Crear mapa de ejercicios activos (mapearemos nombres de ejercicios a sus clases)
        Map<String, Runnable> exercises = new HashMap<>();
        exercises.put("Ejercicio 18 (Cap 3)", Excercice6::run);
        exercises.put("Ejercicio 19 (Cap 3)", Excercice7::run);
        // exercises.put("Ejercicio 8", Excercice8::run);
        exercises.put("Ejercicio 7 (Cap 4) ", Excercice9::run);
        exercises.put("Ejercicio 10 (Cap 4)", Excercice10::run);
        /* exercises.put("Ejercicio 11", Excercice11::run);
        exercises.put("Ejercicio 12", Excercice12::run);
        exercises.put("Ejercicio 13", Excercice13::run);
        exercises.put("Ejercicio 14", Excercice14::run);
        exercises.put("Ejercicio 15", Excercice15::run); */
        exercises.put("Ejercicio 22 (Cap 4)", Excercice16::run);
        exercises.put("Ejercicio 23 (Cap 4)", Excercice17::run);
        // exercises.put("Ejercicio 18", Excercice18::run);
        
        // Crear un JComboBox con los nombres de los ejercicios
        JComboBox<String> exerciseComboBox = new JComboBox<>(exercises.keySet().toArray(new String[0]));
        JLabel label = new JLabel("Seleccione un ejercicio para ejecutar:", JLabel.CENTER);
        
        // Crear el botón de "Ejecutar"
        JButton runButton = new JButton("Ejecutar");
        runButton.addActionListener((ActionEvent e) -> {
            String selectedExercise = (String) exerciseComboBox.getSelectedItem();
            if (selectedExercise != null) {
                exercises.get(selectedExercise).run(); // Ejecuta el método `run()` del ejercicio seleccionado
            }
        });
        
        // Agregar componentes al panel principal
        mainPanel.add(label);
        mainPanel.add(exerciseComboBox);
        mainPanel.add(runButton);
        
        // Agregar el panel principal al frame
        frame.add(mainPanel);
        
        // Hacer visible la ventana
        frame.setVisible(true);
    }
}