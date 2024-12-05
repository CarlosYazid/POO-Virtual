package org.example.exercice14;

import java.util.Random;

public class Company {

    private static float rateBySales;
    private static float extraRate;
    private static float salaryBase;
    private static Random rand = new Random();
    
    Department dep1, dep2, dep3;
    float totalSales;
    
    public Company() {
        this(new Department(rand.nextFloat(), rand.nextFloat()), new Department(rand.nextFloat(),
                rand.nextFloat()), new Department(rand.nextFloat(), rand.nextFloat()));
    }
    
    public Company(Department dep1, Department dep2, Department dep3) {
        this.dep1 = dep1;
        this.dep2 = dep2;
        this.dep3 = dep3;
        totalSales = dep1.getSales() + dep2.getSales() + dep3.getSales();
    }
    
    public void genSalary() {
    
        float limit = rateBySales * totalSales;
        
        dep1.setSalary((dep1.getSales() > limit)? salaryBase * (1 + extraRate) : salaryBase);
        
        dep2.setSalary((dep2.getSales() > limit)? salaryBase * (1 + extraRate) : salaryBase);
        
        dep3.setSalary((dep3.getSales() > limit)? salaryBase * (1 + extraRate) : salaryBase);
    
    }
    
    public static float getExtraRate () {
        return extraRate;
    }
    
    public static void setExtraRate (float extraRate) {
        Company.extraRate = extraRate;
    }
    
    public float getTotalSales () {
        return totalSales;
    }
    
    public void setTotalSales (float totalSales) {
        this.totalSales = totalSales;
    }
    
    public static float getRateBySales () {
        return rateBySales;
    }
    
    public static void setRateBySales (float rateBySales) {
        Company.rateBySales = rateBySales;
    }
    
    public static float getSalaryBase () {
        return salaryBase;
    }
    
    public static void setSalaryBase (float salaryBase) {
        Company.salaryBase = salaryBase;
    }
    
    public Department getDep1 () {
        return dep1;
    }
    
    public void setDep1 (Department dep1) {
        this.dep1 = dep1;
    }
    
    public Department getDep2 () {
        return dep2;
    }
    
    public void setDep2 (Department dep2) {
        this.dep2 = dep2;
    }
    
    public Department getDep3 () {
        return dep3;
    }
    
    public void setDep3 (Department dep3) {
        this.dep3 = dep3;
    }
}
