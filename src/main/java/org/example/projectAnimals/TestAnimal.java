package org.example.projectAnimals;

// Clases Abstractas

/**
 * Esta clase prueba diferentes animales y sus métodos.
 * @version 1.2/2025
 */
public class TestAnimal {
    
    /**
     * Metodo main que crea un array de varios animales y para cada uno
     * muestra en pantalla su nombre científico, su sonido, alimentos y
     * hábitat
     */
    public static void main (String[] args) {
        
        // Define un array de cuatro elementos de tipo Animal
        Animal[] animals = new Animal[4];
        
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Wolf();
        animals[3] = new Lion();
        
        // Recorre el array de animales
        for (Animal animal : animals) {
            System.out.println(animal.getScientificName() +
                    "\nSonido:" + animal.getSound() +
                    "\nAlimentos:" + animal.getFood() +
                    "\nHábitat:" + animal.getHabitat());
        }
    }
}
