package org.example.exercice14;

import java.util.Random;

public class Department {
    
    private static Random rand = new Random();
    
    private float sales;
    private float salary;
    
    public Department(float sales, float salary) {
        this.sales = sales;
        this.salary = salary;
    }
    
    public Department() {
        this(rand.nextFloat(), rand.nextFloat());
    }
    
    public float getSales () {
        return sales;
    }
    
    public void setSales (float sales) {
        this.sales = sales;
    }
    
    public float getSalary () {
        return salary;
    }
    
    public void setSalary (float salary) {
        this.salary = salary;
    }
}
