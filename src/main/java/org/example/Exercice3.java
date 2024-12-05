package org.example;

public class Exercice3 {
    
    protected static void run() {
        
        int workHours = 48;
        int ratePayByHour = 5200;
        float rateTax = 0.125f;
        
        int salary = workHours * ratePayByHour * 4;
        float tax = salary * rateTax;
        
        float netSalary = salary - tax;
        
        System.out.println("El salario bruto del empleado es: " + salary +
                "\nLa retención en la fuente es de: " + tax +
                "\nEl salario debito es: " + netSalary
        );

        System.out.println("Ejercicio Resuelto: 3");
    }
}
