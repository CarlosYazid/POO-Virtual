package org.example;

import java.util.Scanner;

public class Exercice4 {
    
    protected static Scanner keyboard = new Scanner(System.in);
    
    protected static void run() {
        
        System.out.print("Ingresa un numero para calcular su cuadrado y su cubo: ");
        double number = Double.parseDouble(keyboard.next().replaceFirst(",","."));
        
        String message = String.format("El cuadrado de %.2f es %.2f\nEl cubo del mismo es %.2f",
                number, Math.pow(number, 2), Math.pow(number, 3));
        
        System.out.println(message);
        
        System.out.println("Ejercicio Resuelto: 4");
    }
}
