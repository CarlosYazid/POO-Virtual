package org.example.projectFigures;

import java.util.Objects;
import java.util.Random;

/**
 * Esta clase define objetos de tipo Circle con su radio como atributo.
 * @version 1.2/2024
 */
public class Circle extends Figure {
    
    
    public static final Random RAND = new Random();
    public static final double PI = 3.14159265358979323846264338327950288419716939937510;
    
    private double radius; // Atributo que define el radio de un círculo
    
    /**
     * Constructor de la clase Círculo
     * @param radius Parámetro que define el radio de un círculo
     */
    public Circle(double radius) {
        this.radius = radius;
        perimeter = PI * radius * 2;
        area = PI * radius * radius;
    }
    
    /**
     * Genera un radio aleatorio para el Circulo
     */
    public Circle() {
        this(RAND.nextDouble());
    }
    
    @Override
    public String toString () {
        return "Circle{" + "radius=" + radius + "} ";
    }
    
    @Override
    public boolean equals (Object o) {
        if (!(o instanceof Circle circle)) return false;
        return Double.compare(getRadius(), circle.getRadius()) == 0;
    }
    
    @Override
    public int hashCode () {
        return Objects.hashCode(getRadius());
    }
    
    public double getRadius () {return radius;}
    
    public void setRadius (double radius) {
        this.radius = radius;
        this.perimeter = PI * radius * 2;
        this.area = PI * radius * radius;
    }
    
    /**
     * Metodo que calcula y devuelve el área de un círculo como pi
     * multiplicado por el radio al cuadrado
     * @return Área de un círculo
     */
    @Override
    public double getArea () {return area;}
    
    /**
     * Metodo que calcula y devuelve el perímetro de un círculo como la
     * multiplicación de pi por el radio por 2
     * @return Perímetro de un círculo
     */
    @Override
    public double getPerimeter () {return perimeter;}
}
