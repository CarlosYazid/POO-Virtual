package org.example;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Excercice17{

    private static Scanner sc = new Scanner(System.in);
    
    public static void run() {
        
        System.out.println("Este programa calcula la soluciones de la equación cuadratica (si " +
                "las tiene en los reales): (a * x^2) + (b * x) + (c)");
        
        System.out.print("Digita el valor del coeficiente del termino cuadratico (-> (a) * x^2)" +
                ": ");
        double a = sc.nextDouble();
        
        System.out.print("Digita el valor del coeficiente del termino de primer grado (-> (b) * " +
                "x): ");
        double b = sc.nextDouble();
        
        System.out.print("Digita el valor del coeficiente de la equación (-> (c)): ");
        double c = sc.nextDouble();
        
        double discriminant = (b*b) - (4*a*c);
        
        if (discriminant < 0) {
            System.out.println("La ecuación no tiene soluciones en los reales");
        } else {
            double denominator = 2 * a;
            double sol1 = (-b + sqrt(discriminant))/denominator;
            double sol2 = (-b - sqrt(discriminant))/denominator;
            
            System.out.println("Las soluciones de la equación cuadratica son: x_1 = " + sol1 + " x_2 = " + sol2);
        }
        
        System.out.println("Ejercicio Propuesto Resuelto: 23");
    }
}
