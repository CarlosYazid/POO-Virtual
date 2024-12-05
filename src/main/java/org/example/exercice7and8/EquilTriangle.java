package org.example.exercice7;
import java.util.Random;

public class EquilTriangle extends Triangle {
    
    
    private static final double DEFAULTRANDOMSIDE = new Random().nextDouble();
    public static final double ANGLE = Math.PI / 3;
    
    public EquilTriangle(double side) {
        super(side,side,side);
    }
    
    public EquilTriangle(){
        super(DEFAULTRANDOMSIDE,DEFAULTRANDOMSIDE,DEFAULTRANDOMSIDE);
    }
    
    @Override
    public void setSideA (double sideA) {
        this.sideA = sideA;
        sideB = sideA;
        sideC = sideA;
    }
    
    @Override
    public void setSideB (double sideB) {
        sideA = sideB;
        this.sideB = sideB;
        sideC = sideB;
    }
    
    @Override
    public void setSideC (double sideC) {
        sideA = sideC;
        sideB = sideC;
        this.sideC = sideC;
    }
    
    @Override
    public String toString () {
        return "EquilTriangle{" + "side=" + sideA + "} ";
    }
    
    @Override
    public double getPerimeter () {
        return sideA*3;
    }
    
    @Override
    public double getArea () {
        return (height * sideA)/2;
    }
    
    @Override
    protected void genAngles () {
        angleA = ANGLE;
        angleB = ANGLE;
        angleC = ANGLE;
    }
    
    @Override
    protected void genHeight () {
        height = sideA * Math.sqrt(3)/2;
    }
}
