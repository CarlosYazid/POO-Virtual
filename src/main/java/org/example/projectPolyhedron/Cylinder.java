package org.example.projectPolyhedron;

/**
 * Esta clase denominada Cylinder es una subclase de Polyhedron
 * que cuenta con un radius y una height.
 * @version 1.2/2025
 */
public class Cylinder extends Polyhedron {
    
    private final double radius; // Atributo que establece el radio de un cilindro
    private final double height; // Atributo que establece la altura de un cilindro
    
    /**
    * Constructor de la clase Cylinder
    * @param radius Parámetro de define el radio de un cilindro
    * @param height Parámetro de define la altura de un cilindro
    */
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
        this.setVolume(computeVolume()); // Calcula el volumen y establece su atributo
        this.setArea(computeArea()); // Calcula la superficie y establece su atributo
    }
    
    /**
     * Metodo para calcular el volumen de un cilindro
     * @return El volumen de un cilindro
     */
    public double computeVolume() {
        return Math.PI * height * Math.pow(radius, 2.0);
    }
    
    /**
     * Metodo para calcular la superficie de un cilindro
     * @return La superficie de un cilindro
     */
    public double computeArea() {
        return 2 * Math.PI * (radius * height + Math.pow(radius, 2));
    }
    
}
