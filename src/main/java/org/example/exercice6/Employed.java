package org.example.exercice6;
import java.util.Objects;
import java.util.Random;

public class Employed {
    
    private static float rateWorkHour; // Valor de horas trabajadas
    private static float taxSalary;
    private static Random rand = new Random();
    
    private int id; // Codigo del empleado
    private String name; // Nombre del empleado
    private float workHours; // Horas trabajadas por el empleado
    private float grossSalary; // Valor total del sueldo bruto
    private float tax;
    private float salary;
    
    public Employed (int id, String name, float workHours) {
        this.id = id;
        this.name = name;
        this.workHours = workHours;
        this.grossSalary = workHours * rateWorkHour;
        this.tax = grossSalary * taxSalary;
        this.salary = grossSalary - tax;
    }
    
    public Employed (){
        this(rand.nextInt(),null,rand.nextFloat());
    }
    
    @Override
    public String toString () {
        return "Employed{" + "id=" + id + ", name='" + name + '\'' + ", grossSalary=" + grossSalary + ", salary=" + salary + '}';
    }
    
    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (!(o instanceof Employed employed)) return false;
        return getId() == employed.getId();
    }
    
    @Override
    public int hashCode () {
        return Objects.hashCode(getId());
    }
    
    public float getGrossSalary () {
        return grossSalary;
    }
    
    
    public int getId () {
        return id;
    }
    
    public void setId (int id) {
        this.id = id;
    }
    
    public String getName () {
        return name;
    }
    
    public void setName (String name) {
        this.name = name;
    }
    
    public static float getRateWorkHour () {
        return rateWorkHour;
    }
    
    public static void setRateWorkHour (float rateWorkHour) {
        Employed.rateWorkHour = rateWorkHour;
    }
    
    public float getSalary () {
        return salary;
    }
    
    
    public float getTax () {
        return tax;
    }
    
    public static float getTaxSalary () {
        return taxSalary;
    }
    
    public static void setTaxSalary (float taxSalary) {
        Employed.taxSalary = taxSalary;
    }
    
    public float getWorkHours () {
        return workHours;
    }
    
    public void setWorkHours (float workHours) {
        this.workHours = workHours;
        this.grossSalary = workHours * rateWorkHour;
        this.tax = grossSalary * taxSalary;
        this.salary = grossSalary - tax;
    }
}
