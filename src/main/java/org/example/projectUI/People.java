package org.example.projectUI;

/**
 * Esta clase denominada People modela una persona que cuenta con
 * los atributos: name, lastName, phone y address.
 * @version 1.2/2025
 */
public class People {
    
    String name; // Atributo que identifica el nombre de una persona
    String lastName; // Atributo que identifica los apellidos de una persona
    String phone; // Atributo que identifica el teléfono de una persona
    String address; // Atributo que identifica la dirección de una persona

    /**
     * Constructor de la clase Persona
     * @param name Parámetro que define el nombre de una persona
     * @param lastName Parámetro que define los apellidos de una persona
     * @param phone Parámetro que define el teléfono de una persona
     * @param address Parámetro que define la dirección de una
     * persona
     */
    public People(String name, String lastName, String phone,
               String address) {
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }
    
    
}
