package org.example.exercice7and8;

import java.util.Scanner;

public class Excercice7 {
    
    public static Scanner keyboard = new Scanner(System.in);
    
    public static void run() {
        
        System.out.print("Escribe el tamaño de los lados del triangulo equilatero: ");
        double side = keyboard.nextDouble();
        
        Triangle equilTriangle = new EquilTriangle(side);
        System.out.println("El triangulo es: " + equilTriangle);
        System.out.println("El area del triangulo es: " +equilTriangle.getArea());
        System.out.println("El perimetro del triangulo es: " + equilTriangle.getPerimeter());
        System.out.println("La altura del triangulo es: " + equilTriangle.getHeight());
        
        System.out.println("Ejercio Propuesto Resuelto: 19");
    }
}
