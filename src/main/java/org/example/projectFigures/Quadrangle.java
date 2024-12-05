package org.example.projectFigures;

import java.util.Objects;
import java.util.Random;

public abstract class Quadrangle extends Figure {
    
    private static final Random RAND = new Random();
    
    protected double sideA;
    protected double sideB;
    protected double sideC;
    protected double sideD;
    
    public Quadrangle(double sideA, double sideB, double sideC, double sideD) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
        this.perimeter = sideA + sideB + sideC + sideD;
    }
    
    public Quadrangle() {
        this(RAND.nextDouble(), RAND.nextDouble(), RAND.nextDouble(), RAND.nextDouble());
    }
    
    @Override
    public boolean equals (Object o) {
        if (!(o instanceof Quadrangle that)) return false;
        return Double.compare(getSideA(), that.getSideA()) == 0 && Double.compare(getSideB(), that.getSideB()) == 0 && Double.compare(getSideC(), that.getSideC()) == 0 && Double.compare(getSideD(), that.getSideD()) == 0;
    }
    
    @Override
    public int hashCode () {
        return Objects.hash(getSideA(), getSideB(), getSideC(), getSideD());
    }
    
    double getSideA () {return sideA;}
    
    void setSideA (double sideA) {
        this.sideA = sideA;
        this.perimeter = sideA + sideB + sideC + sideD;
    }
    
    double getSideB () {return sideB;}
    
    void setSideB (double sideB) {
        this.sideB = sideB;
        this.perimeter = sideB + sideC + sideD + sideA;
    }
    
    double getSideC () {return sideC;}
    
    void setSideC (double sideC) {
        this.sideC = sideC;
        this.perimeter = sideC + sideD + sideA + sideB;
    }
    
    double getSideD () {return sideD;}
    
    void setSideD (double sideD) {
        this.sideD = sideD;
        this.perimeter = sideD + sideA + sideB + sideC;
    }
    
    public abstract double getArea();
    public double getPerimeter() {return perimeter;}
}
