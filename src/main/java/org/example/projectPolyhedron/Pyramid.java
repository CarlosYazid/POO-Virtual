package org.example.projectPolyhedron;

/**
 * Esta clase denominada Pyramid es una subclase de Polyhedron
 * que cuenta con una base, una height y un apothem.
 * @version 1.2/2025
 */
public class Pyramid extends Polyhedron {
    
    private final double base; // Atributo que identifica la base de una pirámide
    private final double height; // Atributo que identifica la altura de una pirámide
    private final double apothem; // Atributo que identifica el apotema de una pirámide
    
    /**
     * Constructor de la clase Pirámide
     * @param base Parámetro de define la base de una pirámide
     * @param height Parámetro de define la altura de una pirámide
     * @param apothem Parámetro de define el apotema de una pirámide
     */
    public Pyramid(double base, double height, double apothem) {
        this.base = base;
        this.height = height;
        this.apothem = apothem;
        this.setVolume(computeVolume()); // Calcula el volumen y establece su atributo
        this.setArea(computeArea()); // Calcula la superficie y establece su
        // atributo
    }
    
    /**
     * Metodo para calcular el volumen de una pirámide
     * @return El volumen de una pirámide
     */
    public double computeVolume() {
        return (Math.pow(base, 2.0) * height) / 3.0;
    }
    
    /**
     * Metodo para calcular la superficie de una pirámide
     * @return La superficie de una pirámide
     */
    public double computeArea() {
        return Math.pow(base, 2.0) + 2.0 * base * apothem;
    }
    
}
