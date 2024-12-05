package org.example.exercice7and8;

public class NTriangle extends Triangle {
    
    private double semiperimeter = getPerimeter() / 2;
    
    public NTriangle(double a, double b, double c) {
        super(a, b, c);
    }
    
    
    @Override
    public double getArea () {
        area =
                Math.sqrt(semiperimeter * (semiperimeter - getSideA()) * (semiperimeter - getSideB()) * (semiperimeter - getSideC()));
        return area;
    }
    
    @Override
    protected void genAngles () {
        angleA = Math.acos(
                (
                        (Math.pow(getSideB(),2) + Math.pow(getSideC(),2)) -  Math.pow(getAngleA(),2)
                ) / 2 * getAngleC() * getAngleB()
        );
        angleB = Math.acos(
                (
                        (Math.pow(getSideA(),2) + Math.pow(getSideC(),2)) -  Math.pow(getAngleB(),2)
                ) / 2 * getAngleA() * getAngleC()
        );
        angleC = Math.acos(
                (
                        (Math.pow(getSideA(),2) + Math.pow(getSideB(),2)) -  Math.pow(getAngleC(),2)
                ) / 2 * getAngleA() * getAngleB()
        );
    }
    
    public double getSemiperimeter () {
        return semiperimeter;
    }
    
    @Override
    protected void genHeight () {}
}
