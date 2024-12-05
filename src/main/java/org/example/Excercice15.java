package org.example;

import java.util.Scanner;

public class Excercice15 {
    
    private static Scanner sc = new Scanner(System.in);
    
    private static boolean biconditional(boolean b1, boolean b2) {
        return (b1 && b2) || (!b1 && !b2);
    }
    
    public static void run() {
        System.out.print("Digite el peso de la pelota A: ");
        int weightA = sc.nextInt();
        
        System.out.print("Digite el peso de la pelota B: ");
        int weightB = sc.nextInt();
        
        System.out.print("Digite el peso de la pelota C: ");
        int weightC = sc.nextInt();
        
        System.out.print("Digite el peso de la pelota D: ");
        int weightD = sc.nextInt();
        
        String ball;
        String value;
        
        if (weightA == weightB) {
            boolean compare = (weightB == weightC);
            ball = compare? "D" : "C";
            value = biconditional(weightC > weightD, compare)? "menor" : "mayor";
        } else if (weightA == weightC) {
            ball = "B";
            value = (weightC > weightB)? "menor" : "mayor";
        } else {
            ball = "A";
            value = (weightD > weightA)? "menor" : "mayor";
        }
        System.out.println("La pelota " + ball + " es diferente y " + value + " a las otras");
        
        System.out.println("Ejercicio Resuelto: 15");
    }
}
