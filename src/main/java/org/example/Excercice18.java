package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Excercice18 {
    
    public static Scanner sc = new Scanner(System.in);
    
    public static void run() {
        
        double[] weights = new double[3];
        
        System.out.print("Digita el peso de la primera pelota (A): ");
        weights[0] = sc.nextDouble();
        
        System.out.print("Digita el peso de la segunda pelota (B): ");
        weights[1] = sc.nextDouble();
        
        System.out.print("Digita el peso de la tercera (C): ");
        weights[2] = sc.nextDouble();
        
        double max = Arrays.stream(weights).max().orElse(0);
        
        
        String ball;
        
        if (Double.compare(max, weights[0]) == 0) {
            ball = "A";
        } else if (Double.compare(max, weights[1]) == 0) {
            ball = "B";
        } else {
            ball = "C";
        }
        System.out.println("La esfera de mayor peso es la " + ball);
        
        System.out.println("Ejercicio Propuesto Resuelto: 24");
    }
    
}
