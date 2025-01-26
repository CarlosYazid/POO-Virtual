package org.example.projectAnimals;

/**
 * Esta clase concreta denominada Dog es una subclase de Canid.
 * @version 1.2/2025
 */
public class Dog extends Canid {
    
    /**
     * Metodo que devuelve un String con el sonido de un perro
     * @return Un valor String con el sonido de un perro: “Ladrido”
     */
    @Override
    public String getSound () {
        return "Ladrido";
    }
    
    /**
     * Metodo que devuelve un String con los alimentos de un perro
     * @return Un valor String con la alimentación de un perro: “Carnívoro”
     */
    @Override
    public String getFood () {
        return "Carnívoro";
    }
    
    /**
     * Metodo que devuelve un String con el hábitat de un perro
     * @return Un valor String con el hábitat de un perro: “Doméstico”
     */
    @Override
    public String getHabitat () {
        return "Doméstico";
    }
    
    /**
     * Metodo que devuelve un String con el nombre científico de un perro
     * @return Un valor String con el nombre científico de un perro:
     * “Canis lupus familiaris”
     */
    @Override
    public String getScientificName () {
        return "Canis lupus familiaris";
    }
    
}
