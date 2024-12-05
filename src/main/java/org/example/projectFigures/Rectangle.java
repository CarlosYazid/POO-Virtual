package org.example.projectFigures;

import java.util.Random;

/**
 * Esta clase define objetos de tipo Rectangle con una base y una
 * altura como atributos.
 * @version 1.2/2024
 */
public class Rectangle extends Quadrangle{
    
    private static final Random RAND = new Random();
    
    /**
     * Constructor de la clase Rectangulo
     * @param base Parámetro que define la base de un rectángulo
     * @param height Parámetro que define la altura de un rectángulo
     */
    public Rectangle(double base, double height) {
        super(base, height, base, height);
        area = base * height;
    }
    
    /**
     * Genera una base y una altura aleatorias
     */
    public Rectangle() {this(RAND.nextDouble(), RAND.nextDouble());}
    
    @Override
    public String toString () {
        return "Rectangle{" + "base=" + sideA + ", height=" + sideB + "} ";
    }
    
    public double getBase() {return sideA;} // Atributo que define la base de un rectángulo
    
    public void setBase(double base) {
        setSideA(base);
        setSideC(base);
        area = base * getHeight();
    }
    
    public double getHeight() {return sideB;} // Atributo que define la altura de un rectángulo
    
    public void setHeight(double height) {
        setSideB(height);
        setSideD(height);
        area = height * getBase();
    }
    
    /**
     * Metodo que calcula y devuelve el área de un rectángulo como la
     * multiplicación de la base por la altura
     * @return Área de un rectángulo
     */
    @Override
    public double getArea () {
        return area;
    }
    
    /**
     * Metodo que calcula y devuelve el perímetro de un rectángulo
     * como 2 * (base + altura)
     * @return Perímetro de un rectángulo
     */
    @Override
    public double getPerimeter () {
        return super.getPerimeter();
    }
}
