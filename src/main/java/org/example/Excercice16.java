package org.example;

import java.util.Scanner;

public class Excercice16 {
    
    public static Scanner sc = new Scanner(System.in);
    
    public static void run() {
        
        System.out.print("Escribe el nombre del empleado: ");
        String nombre = sc.nextLine();
        
        System.out.print("Digita las horas trabajadas por el empleado: ");
        int horasTrabajadas = sc.nextInt();
        
        System.out.print("Digita el valor de las horas trabajadas: ");
        float valorHorasTrabajadas = sc.nextFloat();
        
        float salary = horasTrabajadas * valorHorasTrabajadas;
        
        if (salary > 450000) {
            System.out.println("El empleado " + nombre + " tiene un sueldo de " + salary);
        } else {
            System.out.println("El empleado se llama " + nombre);
        }
        
        System.out.println("Ejercicio Propuesto Resuelto: 22");
    }
}
