package org.example.projectAnimals;

/**
 * Esta clase concreta denominada Cat es una subclase de Felid.
 * @version 1.2/2020
 */
public class Cat extends Felid {
    
    /**
     * Metodo que devuelve un String con el sonido de un gato
     * @return Un valor String con el sonido de un gato: “Maullido”
     */
    @Override
    public String getSound () {
        return "Maullido";
    }
    
    /**
     * Metodo que devuelve un String con los alimentos de un gato
     * @return Un valor String con la alimentación de un gato: “Ratones”
     */
    @Override
    public String getFood () {
        return "Ratones";
    }
    
    /**
     * Metodo que devuelve un String con el hábitat de un gato
     * @return Un valor String con el hábitat de un gato: “Doméstico”
     */
    @Override
    public String getHabitat () {
        return "Doméstico";
    }
    
    /**
     * Metodo que devuelve un String con el nombre científico de un gato
     * @return Un valor String con el nombre científico de un gato:
     * “Felis silvestris catus”
     */
    @Override
    public String getScientificName () {
        return "Felis silvestris catus";
    }
}
