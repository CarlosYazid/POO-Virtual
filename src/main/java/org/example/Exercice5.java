package org.example;

import java.util.Scanner;

public class Exercice5 {
    
    protected static Scanner keyboard = new Scanner(System.in);
    
    protected static void run() {
        
        System.out.print("Escribe el radio de un circulo para hallar su area y su perimetro: ");
        
        double radius = Double.parseDouble(keyboard.next().replaceAll(",","."));
        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;
        
        System.out.println(
                "El area de un circulo es " + area +
                        "\nEl perimetro del circulo: " + perimeter
        );
        
        System.out.println("Ejercicio Resuelto: 5");
    }
}
