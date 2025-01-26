package org.example.projectRealState;

/**
 * Esta clase denominada PropertyHousing modela un inmueble
 * destinado para la vivienda con atributos como el número de
 * habitaciones y el número de baños que posee
 * @version 1.2/2025
 */
public class PropertyHousing extends Property {
    
    // Atributo que identifica el número de habitación de un inmueble para vivienda
    protected int countRooms;
    
    // Atributo que identifica el número de baños de un inmueble para vivienda
    protected int countBathrooms;
    
    /**
     * Constructor de la clase InmuebleVivienda
     * @param realStateId Parámetro que define el identificador inmobiliario de un inmueble
     *                   para la vivienda
     * @param area Parámetro que define el área de un inmueble para la vivienda
     * @param address Parámetro que define la dirección donde se encuentra localizado
     *               un inmueble para la vivienda
     * @param countRooms Parámetro que define el número de habitaciones que tiene
     *                  un inmueble para la vivienda
     * @param countBathrooms Parámetro que define el número de baños que tiene un inmueble para
     *                       la vivienda
     */
    public PropertyHousing(int realStateId,
                           int area,
                           String address,
                           int countRooms,
                           int countBathrooms) {
        super(realStateId, area, address); // Invoca al constructor de la clase padre
        this.countRooms = countRooms;
        this.countBathrooms = countBathrooms;
    }
    
    public PropertyHousing() {
        this(0,0,null,0,0);
    }
    
    
    /**
     * Metodo que muestra en pantalla los datos de un inmueble para la
     * vivienda
     */
    @Override
    void info() {
        super.info(); // Invoca al metodo imprimir de la clase padre
        System.out.println("Número de habitaciones = " + countRooms +
                "\nNúmero de baños = " + countBathrooms
        );
    }
}
