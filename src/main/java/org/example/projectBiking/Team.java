package org.example.projectBiking;

import java.util.Scanner;
import java.util.Vector;

/**
 * Esta clase denominada Team modela un equipo de ciclismo
 * conformado por un vector de ciclistas. La clase tiene atributos como
 * el nombre del equipo, el país del equipo y el tiempo total acumulado
 * del equipo
 * @version 1.2/2025
 */
public class Team {
    
    // Atributo que define el nombre del equipo de ciclismo
    private String name;
    
    // Atributo que define el tiempo total obtenido por el equipo
    private static double totalTime = 0.0; // Se inicializa el tiempo del equipo en cero
    
    // Atributo que define el país al que pertenece el equipo
    private String country;
    
    // Atributo que define un vector de objetos ciclista
    private Vector<Biker> listBikers;
    
    /**
     * Constructor de la clase Team
     * @param name Parámetro que define el nombre del equipo
     * @param country Parámetro que define el país del equipo
     */
    public Team(String name, String country) {
        this.name = name;
        this.country = country;
        listBikers = new Vector<>(); // Se crea el vector de ciclistas que conforma el equipo
    }
    
    /**
     * Metodo que devuelve el nombre del equipo
     * @return El nombre del equipo
     */
    public String getName() {
        return name;
    }
    
    /**
     * Metodo que establece el nombre de un equipo
     * @param name Parametro que especifica el nombre de un equipo
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Metodo que devuelve el país del equipo
     * @return El país del equipo
     */
    private String getCountry() {
        return country;
    }
    
    /**
     * Metodo que establece el país de un equipo
     * @param country Parámetro que especifica el país de un equipo
     */
    private void setCountry(String country) {
        this.country = country;
    }
    
    /**
     * Metodo que añade un ciclista al vector de ciclistas de un equipo
     */
    void addBiker(Biker biker) {
        listBikers.add(biker); // Se agrega el ciclista al vector de ciclistas
    }
    
    /**
     * Metodo que muestra en pantalla los nombres de los ciclistas que
     * conforman un equipo
     */
    void listBikers() {
        //Se recorre el vector de ciclistas y para cada elemento se imprime el nombre del
        //ciclista
        for (int i = 0; i < listBikers.size(); i++) {
            Biker b = listBikers.elementAt(i); //Se aplica casting para extraer el elemento
            System.out.println(b.getName());
        }
    }
    
    /**
     * Metodo que busca un ciclista ingresado por teclado
     */
    void searchBikers() {
        
        Scanner sc = new Scanner(System.in); // Se solicita texto ingresado por teclado
        
        String name = sc.next();
        
        for (int i = 0; i < listBikers.size(); i++) {
            
            // Se recorre el vector de ciclistas
            Biker b = listBikers.elementAt(i); // Se obtiene un elemento del vector
            
            if (b.getName().equals(name)) { // Si el nombre ingresado se encuentra
                System.out.println(b.getName());
            }
        }
    }
    
    
    /**
     * Metodo que calcula el tiempo total de un equipo acumulando el
     * tiempo obtenido por cada uno de sus ciclistas
     */
    void computeTotalTime() {
        
        for (int i = 0; i < listBikers.size(); i++) { // Se recorre el vector
            
            Biker b = listBikers.elementAt(i); // Se obtiene un elemento del vector
            
            // Se acumula el tiempo del ciclista en el tiempo del equipo
            totalTime = totalTime + b.getTimeAccumulated();
        }
    }
    
    /**
     * Metodo que muestra en pantalla los datos de un equipo
     */
    void info() {
        System.out.println("Nombre del equipo = " + name +
                "\nPaís del equipo = " + country +
                "\nTiempo total del equipo = " + totalTime);
    }
}
