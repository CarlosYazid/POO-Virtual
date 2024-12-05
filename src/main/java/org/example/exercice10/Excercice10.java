package org.example.exercice10;
import java.util.Scanner;

public class Excercice10 {
    private static Scanner keyboard = new Scanner(System.in);
    
    public static void run() {
        
        System.out.print("Escribe el nombre del Estudiante: ");
        String nombre = keyboard.nextLine();
        
        System.out.print("Escribe el patrimonio del Estudiante: ");
        float patrimonio = keyboard.nextFloat();
        
        System.out.print("Escribe el estrato social del Estudiante (1 - 5): ");
        int estrato = keyboard.nextInt();
        
        Student student = new Student(nombre, patrimonio, estrato);
        
        System.out.println("El estudiante con numero de inscripción " + student.getId() + " y  " +
                "nombre " + student.getName() + " debe de pagar " + student.computeUniversityTuition());
        
        System.out.println("Ejercicio Resuelto: 10");
        
    }
}
