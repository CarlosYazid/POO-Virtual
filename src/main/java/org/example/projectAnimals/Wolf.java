package org.example.projectAnimals;

/**
 * Esta clase concreta denominada Wolf es una subclase de Canid.
 * @version 1.2/2025
 */
public class Wolf extends Canid {
    
    /**
     * Metodo que devuelve un String con el sonido de un lobo
     * @return Un valor String con el sonido de un lobo: “Aullido”
     */
    @Override
    public String getSound () {
        return "Aullido";
    }
    
    /**
     * Metodo que devuelve un String con los alimentos de un lobo
     * @return Un valor String con el tipo de alimentación de un lobo:
     * “Carnívoro”
     */
    @Override
    public String getFood () {
        return "Carnívoro";
    }
    
    /**
     * Metodo que devuelve un String con el hábitat de un lobo
     * @return Un valor String con el hábitat de un lobo: “Bosque”
     */
    @Override
    public String getHabitat () {
        return "Bosque";
    }
    
    /**
     * Metodo que devuelve un String con el nombre científico de un lobo
     * @return Un valor String con el nombre científico de un lobo:
     * “Canis lupus”
     */
    @Override
    public String getScientificName () {
        return "Canis lupus";
    }
}
