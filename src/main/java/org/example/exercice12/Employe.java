package org.example.exercice12;

import java.util.Objects;
import java.util.Random;

public class Employe {
    
    private static float rateByWorkHours;
    private static Random rand = new Random();
    private static int normalWorkingDay;
    private static int extraWorkingDay;
    
    private String name;
    private int workHours;
    private int extraHours;
    private float salary;
    
    public Employe(String name, int workHours) {
        this.name = name;
        this.workHours = workHours;
        this.extraHours = workHours - normalWorkingDay;
        genSalary();
    }
    
    public Employe() {
        this(null, rand.nextInt());
    }
    
    protected void genSalary() {
        float salaryBase = normalWorkingDay * rateByWorkHours;
        float salaryExtra = 0;
        if (extraHours > 0) {
            if (extraHours > extraWorkingDay) {
                salaryExtra =
                        2 * extraWorkingDay * rateByWorkHours + (3 * (extraHours - extraWorkingDay) * rateByWorkHours) ;
            }
            else {
                salaryExtra = extraHours * 2 * rateByWorkHours;
            }
        }
        salary = salaryBase + salaryExtra;
    }
    
    
    @Override
    public String toString () {
        return "Employe{" + "name='" + name + '\'' + ", workHours=" + workHours + '}';
    }
    
    @Override
    public boolean equals (Object o) {
        if (!(o instanceof Employe employe)) return false;
        return workHours == employe.workHours && Objects.equals(name, employe.name);
    }
    
    @Override
    public int hashCode () {
        return Objects.hashCode(name);
    }
    
    public String getName () {
        return name;
    }
    
    public void setName (String name) {
        this.name = name;
    }
    
    public int getWorkHours () {
        return workHours;
    }
    
    public void setWorkHours (int workHours) {
        this.workHours = workHours;
    }
    
    public static float getRateByWorkHours () {
        return rateByWorkHours;
    }
    
    public static void setRateByWorkHours (float rateByWorkHours) {
        Employe.rateByWorkHours = rateByWorkHours;
    }
    
    public static int getNormalWorkingDay () {
        return normalWorkingDay;
    }
    
    public static void setNormalWorkingDay (int normalWorkingDay) {
        Employe.normalWorkingDay = normalWorkingDay;
    }
    
    public int getExtraHours () {
        return extraHours;
    }
    
    public void setExtraHours (int extraHours) {
        this.extraHours = extraHours;
    }
    
    public float getSalary () {
        return salary;
    }
    
    public void setSalary (float salary) {
        this.salary = salary;
    }
    
    public static int getExtraWorkingDay () {
        return extraWorkingDay;
    }
    
    public static void setExtraWorkingDay (int extraWorkingDay) {
        Employe.extraWorkingDay = extraWorkingDay;
    }
}
