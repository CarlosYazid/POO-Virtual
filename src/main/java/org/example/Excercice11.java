package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Excercice11 {
    
    public static Scanner keyboard = new Scanner(System.in);
    
    public static void run() {
        
        List<Integer> numbers = new ArrayList<>();
        
        System.out.print("Escriba el primer numero: ");
        numbers.add(keyboard.nextInt());
        
        System.out.print("Escriba el segundo numero: ");
        numbers.add(keyboard.nextInt());
        
        System.out.print("Escriba el tercer numero: ");
        numbers.add(keyboard.nextInt());
        
        List<Integer> listOrdered = numbers.stream().sorted().toList();
        
        System.out.println("El numero mayor que todos es: " + numbers.getLast() + ", el segundo " +
                "es: " + listOrdered.get(1) + ", el tercer es: " + listOrdered.getFirst());
        
        System.out.println("Ejercicio Resuelto: 11");
    }
}
