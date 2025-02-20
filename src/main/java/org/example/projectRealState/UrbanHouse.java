package org.example.projectRealState;

/**
 * Esta clase denominada UrbanHouse modela un tipo específico de casa
 * destinada para la vivienda localizada en el sector urbano.
 * @version 1.2/2025
 */
public class UrbanHouse extends House {
    
    /**
     * Constructor de la clase UrbanHouse
     * @param realStateId Parámetro que define el identificador inmobiliario de una casa urbana
     * @param area Parámetro que define el área de una casa urbana
     * @param address Parámetro que define la dirección donde se encuentra localizada una casa
     *                urbana
     * @param countRooms Parámetro que define el número de habitaciones que tiene una casa urbana
     * @param countBathrooms Parámetro que define el número de baños que tiene una casa urbana
     * @param numberFloors Parámetro que define el número de pisos que tiene una casa urbana
     */
    
    public UrbanHouse(int realStateId,
                      int area,
                      String address,
                      int countRooms,
                      int countBathrooms,
                      int numberFloors) {
        // Invoca al constructor de la clase padre
        super(realStateId, area, address,
                countRooms, countBathrooms, numberFloors);
    }
    
    public UrbanHouse() {
        this(0,0,null,0,0,0);
    }
    
    /**
     * Metodo que muestra en pantalla los datos de una casa urbana
     */
    @Override
    void info() {
        super.info(); // Invoca al metodo imprimir de la clase padre
    }
    
    
}
