package org.example.projectUI;

import java.util.Vector;
/**
 * Esta clase denominada PeopleList define un vector de Personas.
 * @version 1.2/2025
 */
public class PeopleList {
    
    Vector<People> peopleVector; // Atributo que identifica un vector de personas
    
    /**
     * Constructor de la clase PeopleList
     */
    public PeopleList() {
        peopleVector = new Vector<>(); // Crea el vector de personas
    }
    
    /**
     * Metodo que permite agregar una persona al vector de personas
     * @param people Parámetro que define la persona a agregar al vector de
     * personas
     */
    public void addPeople(People people) {
        peopleVector.add(people);
    }
    
    /**
     * Metodo que permite eliminar una persona del vector de personas
     * @param index Parámetro que define la posición a eliminar en el vector
     * de personas
     */
    public void deletePeople(int index) {
        peopleVector.removeElementAt(index);
    }
    
    /**
     * Metodo que permite eliminar todos los elementos del vector de
     * personas
     */
    public void cleanList() {
        peopleVector.removeAllElements();
    }
}
