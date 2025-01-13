package org.example.projectFigures;

import java.util.Objects;
import java.util.Random;

public abstract class Triangle extends Figure {
    
    protected static Random RAND = new Random();
    
    protected double sideA;
    protected double sideB;
    protected double sideC;
    
    protected Triangle (double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.perimeter = (sideA > 0 && sideB > 0 && sideC > 0) ? sideA + sideB + sideC : 0;
    }
    
    protected Triangle (){
        this(RAND.nextDouble(), RAND.nextDouble(), RAND.nextDouble());
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
    
    double getSideA() {
        return sideA;
    }
    double getSideB() {
        return sideB;
    }
    double getSideC() {
        return sideC;
    }
    
    void setSideA (double sideA) {
        this.sideA = sideA;
        this.perimeter = (sideA > 0 && sideB > 0 && sideC > 0) ? sideA + sideB + sideC : 0;
    }
    
    void setSideB (double sideB) {
        this.sideB = sideB;
        this.perimeter = (sideA > 0 && sideB > 0 && sideC > 0) ? sideA + sideB + sideC : 0;
    }
    
    void setSideC (double sideC) {
        this.sideC = sideC;
        this.perimeter = (sideA > 0 && sideB > 0 && sideC > 0) ? sideA + sideB + sideC : 0;
    }
    
    public double getPerimeter(){
        return perimeter;
    };
    
    public abstract double getArea();
    
    /**
     * Metodo que determina si un triángulo es:<br>
     * - Equilatero: si sus tres lados son iguales<br>
     * - Escaleno: si sus tres lados son todos diferentes<br>
     * - Isosceles: si dos de sus lados son iguales y el otro es diferente de
     * los demás
     */
    public String type() {
        if (getSideA() == getSideB() && getSideB() == getSideC()) {
            return "Equilatero";
        } else if ((getSideA() == getSideB()) || (getSideA() == getSideC()) || (getSideB() == getSideC())) {
            return "Isosceles";
        } else {
            return "Escaleno";
        }
    }
}
