package org.example.projectPolyhedron;

/**
 * Esta clase denominada Sphere es una subclase de Polyhedron
 * que cuenta con un radio.
 * @version 1.2/2025
 */
public class Sphere extends Polyhedron {
    
    private final double radius; // Atributo que identifica el radio de una esfera

    /**
    * Constructor de la clase Sphere
    * @param radius Parámetro de define el radio de una esfera
    */
    public Sphere(double radius) {
        this.radius = radius;
        this.setVolume(computeVolume()); // Calcula el volumen y establece su atributo
        this.setArea(computeArea()); // Calcula la superficie y establece su atributo
    }
    
    /**
     * Metodo para calcular el volumen de una esfera
     * @return El volumen de una esfera
     */
    public double computeVolume() {
        return (Math.PI * Math.pow(radius, 3.0))/3;
    }
    
    /**
     * Metodo para calcular la superficie de una esfera
     * @return La superficie de una esfera
     */
    public double computeArea() {
        return 4 * Math.PI * Math.pow(radius, 2.0);
    }
}
