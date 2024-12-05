package org.example;
import java.util.Scanner;


public class Exercice1 {
    
    protected static Scanner keyboard = new Scanner(System.in);
    
    protected static void run(){
        System.out.print("Ingresa la edad de Juan: ");
        int ageOfJuan = keyboard.nextInt();
        
        int ageOfAlberto = Math.round((float) (ageOfJuan * 2) /3);
        int ageOfAna = Math.round((float) (ageOfJuan * 4) /3);
        int ageOfMother = ageOfJuan + ageOfAlberto + ageOfAna;
        
        System.out.println("El edad de Juan es: " + ageOfJuan +
                "\nEl edad de Alberto es: " + ageOfAlberto +
                "\nEl edad de Ana es: " + ageOfAna +
                "\nEl edad de la Madre es: " + ageOfMother
        );
        
        System.out.println("Ejercicio Resuelto: 1");
    }
}
