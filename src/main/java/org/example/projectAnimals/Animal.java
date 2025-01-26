package org.example.projectAnimals;

/**
 * Esta clase abstracta denominada Animal modela un animal genérico
 * que cuenta con atributos como un sonido, alimentos que consume,
 * un hábitat y un nombre científico.
 * @version 1.2/2025
 */
public abstract class Animal {
    
    // Atributo que identifica el sonido emitido por un animal
    protected String sound;
    // Atributo que identifica los alimentos que consume un animal
    protected String food;
    // Atributo que identifica el hábitat de un animal
    protected String habitat;
    // Atributo que identifica el nombre científico de un animal
    protected String scientificName;

    public Animal(String scientificName, String food, String habitat, String sound) {
        this.scientificName = scientificName;
        this.food = food;
        this.habitat = habitat;
        this.sound = sound;
    }
    
    public Animal() {
        this(null,null,null,null);
    }
    
    /**
     * Metodo abstracto que permite obtener el sonido producido por el
     * animal
     * @return El sonido producido por el animal
     */
    public abstract String getSound () ;
    
    /**
     * Metodo abstracto que permite obtener los alimentos que consume
     * un animal
     * @return Los alimentos que consume el animal
     */
    public abstract String getFood ();
    
    /**
     * Metodo abstracto que permite obtener el hábitat del animal
     * @return El hábitat del animal
     */
    public abstract String getHabitat ();
    
    /**
     * Metodo abstracto que permite obtener el nombre científico del animal
     * @return El nombre científico del animal
     */
    public abstract String getScientificName ();
}
