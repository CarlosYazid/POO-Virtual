package org.example;

public class Exercice2 {

    protected static void run() {
        
        float sum = 0;
        int x = 20;
        
        sum += x;
        
        int y = 40;
        
        x += (int) Math.pow(y, 2);
        sum += (float) x / y;
        
        System.out.println("El valor de la suma es: " + sum);
        
        System.out.println("Ejercicio Resuelto: 2");
    }
}
