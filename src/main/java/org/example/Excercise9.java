package org.example;

import java.util.Scanner;

public class Excercise9 {
    
    private static Scanner keyboard = new Scanner(System.in);
    
    public static void run() {
        System.out.print("Escriba uno de los dos números para saber cual es mayor que el otro:");
        int n = keyboard.nextInt();
        System.out.print("Escriba el ultimo numero:");
        int n2 = keyboard.nextInt();
        
        if (n > n2) {
            System.out.println("El primer numero es mayor que el otro");
        } else if (n < n2) {
            System.out.println("El segundo numero es mayor que el otro");
        } else {
            System.out.println("Los numeros son iguales");
        }
        
        System.out.println("Ejercio Resuelto: 9");
    }
}
