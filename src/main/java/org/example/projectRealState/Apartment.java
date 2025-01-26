package org.example.projectRealState;

/**
 * Esta clase denominada Apartment modela un tipo de inmueble específico destinado para la vivienda.
 * @version 1.2/2025
 */
public class Apartment extends PropertyHousing {
    
    /**
     * Constructor de la clase Apartment
     * @param realStateId Parámetro que define el identificador inmobiliario de un apartamento
     * @param area Parámetro que define el área de un apartamento
     * @param address Parámetro que define la dirección donde se encuentra localizado un apartamento
     * @param countRooms Parámetro que define el número de habitaciones que tiene un apartamento
     * @param countBathroom Parámetro que define el número de baños que tiene un apartamento
     */
    public Apartment(int realStateId, int area, String address, int countRooms, int countBathroom) {
        super(realStateId, area, address, countRooms, countBathroom);
    }
    
    public Apartment() {
        this(0,0,null,0,0);
    }
    
    /**
     * Metodo que muestra en pantalla los datos de un apartamento
     */
    void info() {
        super.info(); // Invoca al metodo imprimir de la clase padre
    }
    
}
