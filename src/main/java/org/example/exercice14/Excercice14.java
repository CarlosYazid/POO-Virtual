package org.example.exercice14;

import java.util.Scanner;

public class Excercice14 {
    
    public static Scanner sc = new Scanner(System.in);
    
    public static void run() {
        
        Company.setExtraRate(0.2f);
        Company.setRateBySales((float) 1/3);
        
        
        System.out.println("Ingresa las ventas del primer departamento: ");
        float ventasDept1 = sc.nextFloat();
        
        System.out.println("Ingresa las ventas del segundo departamento: ");
        float ventasDept2 = sc.nextFloat();
        
        System.out.println("Ingresa las ventas del tercer departamento: ");
        float ventasDept3 = sc.nextFloat();
        
        System.out.println("Ingresa el salario base de los vendedores: ");
        float salarioBase = sc.nextFloat();
        
        Company.setSalaryBase(salarioBase);
        
        Department department1 = new Department(ventasDept1, 0);
        Department department2 = new Department(ventasDept2, 0);
        Department department3 = new Department(ventasDept3, 0);
        
        Company company = new Company(department1, department2, department3);
        
        company.genSalary();
        
        System.out.println("El salario de los vendedores del departamento 1 es: " + department1.getSalary());
        System.out.println("El salario de los vendedores del departamento 2 es: " + department2.getSalary());
        System.out.println("El salario de los vendedores del departamento 3 es: " + department3.getSalary());
        
        System.out.println("Ejercicio Resuelto: 14");
    }
}
