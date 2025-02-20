package org.example.projectRealState;

/**
 * Esta clase denominada StudioApartment modela un tipo específico de
 * apartamento que tiene una sola habitación.
 * @version 1.2/2025
 */
public class StudioApartment extends Apartment {
    
    // Atributo que identifica el valor por área de un apartaestudio
    protected static double rateArea = 1500000;
    
    /**
     * Constructor de la clase Apartaestudio
     * @param realStateId Parámetro que define el identificador inmobiliario de un apartaestudio
     * @param area Parámetro que define el área de un apartaestudio
     * @param address Parámetro que define la dirección donde se encuentra localizado un
     *                apartaestudio
     */
    
    public StudioApartment(int realStateId,
                           int area,
                           String address) {
        // Invoca al constructor de la clase padre
        // Los apartaestudios tienen una sola habitación y un solo baño
        super(realStateId, area, address, 1, 1);
    }
   
    public StudioApartment() {
        this(0,0, null);
    }
    
    /**
     * Metodo que muestra en pantalla los datos de un apartaestudio
     */
    void info() {
        super.info(); // Invoca al metodo imprimir de la clase padre
    }
    
}
