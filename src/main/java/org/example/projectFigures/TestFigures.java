package org.example.projectFigures;

/**
 * Esta clase prueba diferentes acciones realizadas en diversas figuras
 * geométricas.
 * @version 1.2/2024
 */
public class TestFigures {
    
    /**
     * Metodo main que crea un círculo, un rectángulo, un cuadrado y
     * un triángulo rectángulo. Para cada uno de estas figuras geométricas,
     * se calcula su área y perímetro.
     */
    public static void main(String args[]) {
        
        Figure figura1 = new Circle(2);
        Figure figura2 = new Rectangle(1,2);
        Figure figura3 = new Square(3);
        Triangle figura4 = new TriangleRectangle(3,5);
        
        System.out.println("El área del círculo es = " + figura1.
                getArea());
        System.out.println("El perímetro del círculo es = " + figura1.
                getPerimeter() + "\n");
        
        System.out.println("El área del rectángulo es = " + figura2.
                getArea());
        System.out.println("El perímetro del rectángulo es = " + figura2.
                getPerimeter() + "\n");
        
        System.out.println("El área del cuadrado es = " + figura3.
                getArea());
        System.out.println("El perímetro del cuadrado es = " + figura3.
                getPerimeter() + "\n");
        
        System.out.println("El área del triángulo es = " + figura4.
                getArea());
        System.out.println("El perímetro del triángulo es = " + figura4.
                getPerimeter() + "\n");
        
        System.out.println("El triangulo es " + figura4.type());
    }
}
