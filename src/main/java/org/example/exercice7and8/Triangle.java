package org.example.exercice7;

import java.util.Objects;
import java.util.Random;

public abstract class Triangle {
    
    protected static Random rand = new Random();
    
    protected double sideA;
    protected double sideB;
    protected double sideC;
    protected double angleA;
    protected double angleB;
    protected double angleC;
    protected double height;
    
    protected Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        genAngles();
        genHeight();
    }
    
    protected Triangle(){
        this(rand.nextDouble(), rand.nextDouble(), rand.nextDouble());
    }
    
    @Override
    public String toString () {
        return "Triangle{" + "sideA=" + sideA + ", angleA=" + angleA + ", sideB=" + sideB + ", angleB=" + angleB + ", sideC=" + sideC + ", angleC=" + angleC + '}';
    }
    
    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle triangle)) return false;
        return Double.compare(getSideA(), triangle.getSideA()) == 0 && Double.compare(getSideB(), triangle.getSideB()) == 0 && Double.compare(getSideC(), triangle.getSideC()) == 0;
    }
    
    @Override
    public int hashCode () {
        return Objects.hash(getSideA(), getSideB(), getSideC());
    }
    
    public double getSideA() {
        return sideA;
    }
    public double getSideB() {
        return sideB;
    }
    public double getSideC() {
        return sideC;
    }
    
    public void setSideA (double sideA) {
        this.sideA = sideA;
        genAngles();
    }
    
    public void setSideB (double sideB) {
        this.sideB = sideB;
        genAngles();
    }
    
    public void setSideC (double sideC) {
        this.sideC = sideC;
        genAngles();
    }
    
    public double getAngleA () {
        return angleA;
    }
    
    public double getAngleB () {
        return angleB;
    }
    
    public double getAngleC () {
        return angleC;
    }
    
    public double getHeight() {
        return height;
    }
    
    public abstract double getPerimeter();
    public abstract double getArea();
    protected abstract void genAngles();
    protected abstract void genHeight();
}
