package org.example.exercice13;

import java.util.Scanner;

public class Excercice13 {
    
    private static Scanner sc = new Scanner(System.in);
    
    public static void run() {
        
        System.out.print("Ingresa el valor de la compra: ");
        float valor = sc.nextFloat();
        
        System.out.print("Ingresa el color de la bola sacada de la bolsa por el cliente: ");
        String color = sc.next().toLowerCase();
        
        float descuento;
        
        descuento = switch (color) {
            case "blanco" -> ColorBall.WHITE.getDesc();
            case "verde" -> ColorBall.GREEN.getDesc();
            case "amarillo" -> ColorBall.YELLOW.getDesc();
            case "azul" -> ColorBall.BLUE.getDesc();
            default -> ColorBall.DEFAULT.getDesc();
        };
        
        float total = valor * (1 - descuento);
        
        System.out.println("El cliente debe pagar: " + total);
        
        System.out.println("Ejercicio Resuelto: 13");
    }
}
