package org.example.projectFigures;

import java.util.Random;

/**
 * Esta clase define objetos de tipo TriangleRectángle con una
 * base y una altura como atributos.
 * @version 1.2/2024
 */
public class TriangleRectangle extends Triangle{
    
    private static final Random RAND = new Random();
    public static double computeHypotenuse(double base, double height) {
        return Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
    }
    
    
    /**
     * Constructor de la clase TriangleRectángle
     * @param base Parámetro que define la base de un triángulo
     * rectángulo
     * @param height Parámetro que define la altura de un triángulo
     * rectángulo
     */
    public TriangleRectangle(double base, double height) {
        super(base, height, 0);
        setSideC(computeHypotenuse(base, height));
        area = (base * height) / 2;
    }
    
    /**
     * Genera una base y una altura para el triangulo
     */
    public TriangleRectangle(){
        this(RAND.nextDouble(), RAND.nextDouble());
    }
    
    public double getBase() {return getSideA();} // Atributo que define la base de un triángulo rectángulo
    public double getHeight() {return getSideB();} // Atributo que define la altura de un triángulo rectángulo
    public double getHypotenuse() {return getSideC();}
    
    public void setBase(double base) {
        setSideA(base);
        setSideC(computeHypotenuse(base, getHeight()));
        area = (base * getHeight()) / 2;
    }
    
    public void setHeight(double height) {
        setSideB(height);
        setSideC(computeHypotenuse(getBase(), height));
        area = (getBase() * height) / 2;
    }
    /**
     * Metodo que calcula y devuelve el área de un triángulo rectángulo
     * como la base multiplicada por la altura sobre 2
     * @return Área de un triángulo rectángulo
     */
    @Override
    public double getArea () {
        return area;
    }
    
    /**
     * Metodo que calcula y devuelve el perímetro de un triángulo
     * rectángulo como la suma de la base, la altura y la hipotenusa
     * @return Perímetro de un triángulo rectángulo
     */
    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }
}
