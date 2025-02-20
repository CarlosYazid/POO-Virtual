package org.example.projectPolyhedron;

/**
 * Esta clase denominada Polyhedron modela a un poliedro
 * que cuenta con un volumen y una superficie a ser
 * calculados de acuerdo al tipo de poliedro.
 * @version 1.2/2025
 */
public abstract class Polyhedron {
    
    private double volume; // Atributo que identifica el volumen de una figura geométrica
    private double area; // Atributo que identifica la superficie de una figura geométrica
    
    /**
    * Metodo para establecer el volumen de una figura geométrica
    * @param volume Parámetro que define el volumen de una figura
    * geométrica
    */
    public void setVolume(double volume) {
        this.volume = volume;
    }
    
    /**
     * Metodo para establecer la superficie de una figura geométrica
     * @param area Parámetro que define la superficie de una
     * figura geométrica
     */
    public void setArea(double area) {
        this.area = area;
    }
    
    /**
     * Metodo para obtener el volumen de una figura geométrica
     * @return El volumen de una figura geométrica
     */
    public double getVolume() {
        return volume;
    }
    
    /**
     * Metodo para obtener la superficie de una figura geométrica
     * @return La superficie de una figura geométrica
     */
    public double getArea() {
        return area;
    }
}
