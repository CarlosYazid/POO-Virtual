package org.example.projectFigures;

import java.util.Random;

/**
 * Esta clase define objetos de tipo Square con un lado como atributo.
 * @version 1.2/2024
 */
public class Square extends Quadrangle {
    
    private static final Random RAND = new Random();
    
    /**
     * Constructor de la clase Square
     * @param side Parámetro que define la longitud de la base de un
     * cuadrado
     */
    public Square(double side) {
        super(side,side,side,side);
        area = side * side;
    }
    
    public Square(){this(RAND.nextDouble());}
    
    
    @Override
    public String toString () {return "Square{" + "side=" + sideA + "} ";}
    
    public double getSide() {return sideA;} // Atributo que define el lado de un cuadrado
    
    public void setSide(double side) {
        setSideA(side);
        setSideB(side);
        setSideC(side);
        setSideD(side);
        area = side * side;
    }
    
    /**
     * Metodo que calcula y devuelve el área de un cuadrado como el
     * lado elevado al cuadrado
     * @return Área de un Cuadrado
     */
    @Override
    public double getArea () {
        return area;
    }
    
    /**
     * Metodo que calcula y devuelve el perímetro de un cuadrado como
     * cuatro veces su lado
     * @return Perímetro de un cuadrado
     */
    @Override
    public double getPerimeter () {
        return super.getPerimeter();
    }
}
