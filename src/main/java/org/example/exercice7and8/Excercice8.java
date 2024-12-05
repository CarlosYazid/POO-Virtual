package org.example.exercice7and8;
import java.util.Scanner;

public class Excercice8 {
    
    public static Scanner keyboard = new Scanner(System.in);
    
    public static void run() {
        
        System.out.print("Escriba el tamaño del lado a del triangulo: ");
        double a = keyboard.nextDouble();
        
        System.out.print("Escriba el tamaño del lado b del triangulo: ");
        double b = keyboard.nextDouble();
        
        System.out.print("Escriba el tamaño del lado c del triangulo: ");
        double c = keyboard.nextDouble();
        
        NTriangle triangle = new NTriangle(a,b,c);
        
        System.out.println("El triangulo es: " + triangle);
        System.out.println("El area del triangulo es: " + triangle.getArea());
        System.out.println("El perimetro del triangulo es: " + triangle.getPerimeter());
        System.out.println("El semiperimetro del triangulo es: " + triangle.getSemiperimeter());
        
        System.out.println("Ejercicio Propuesto Resuelto: 21");
    }
}
