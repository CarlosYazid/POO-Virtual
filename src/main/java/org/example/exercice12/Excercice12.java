package org.example.exercice12;

import java.util.Scanner;

public class Excercice12  {
    
    private static Scanner sc = new Scanner(System.in);
    
    public static void run() {
    
        Employe.setNormalWorkingDay(40);
        Employe.setExtraWorkingDay(8);
        
        System.out.print("Ingresa el nombre del empleado: ");
        String name = sc.nextLine();
        
        System.out.print("Ingresa las horas trabajadas por el empleado: ");
        int workingDay = sc.nextInt();
        
        System.out.print("Ingresa el valor por horas trabajadas: ");
        float rate = sc.nextFloat();
        
        Employe.setRateByWorkHours(rate);
        
        Employe employe = new Employe(name, workingDay);
        
        System.out.println("El empleado " + employe.getName() + " devengó " + employe.getSalary());
        
        System.out.println("Ejercicio Resuelto: 12");
    
    }


}
