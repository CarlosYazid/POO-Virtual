package org.example.projectAnimals;

/**
 * Esta clase concreta denominada Lion es una subclase de Felid.
 * @version 1.2/2025
 */
public class Lion extends Felid {
    
    /**
     * Metodo que devuelve un String con el sonido de un león
     * @return Un valor String con el sonido de un león: “Rugido”
     */
    @Override
    public String getSound () {
        return "Rugido";
    }
    
    /**
     * Metodo que devuelve un String con los alimentos de un león
     * @return Un valor String con la alimentación de un león: “Carnívoro”
     */
    @Override
    public String getFood () {
        return "Carnívoro";
    }
    
    /**
     * Metodo que devuelve un String con el hábitat de un león
     * @return Un valor String con el hábitat de un león: “Praderas”
     */
    @Override
    public String getHabitat () {
        return "Praderas";
    }
    
    /**
     * Metodo que devuelve un String con el nombre científico de un león
     * @return Un valor String con el nombre científico de un león:
     * “Panthera leo”
     */
    @Override
    public String getScientificName () {
        return "Panthera leo";
    }
}
