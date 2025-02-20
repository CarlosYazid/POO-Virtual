package org.example.projectRealState;

/**
 * Esta clase denominada DetachedHouse modela un tipo específico
 * de casa urbana que no está en conjunto cerrado y es completamente
 * independiente de otras casas. Tiene un atributo estático para
 * especificar un valor del área del inmueble.
 * @version 1.2/2025
 */
public class DetachedHouse extends UrbanHouse {
    
    // Atributo que identifica el valor por área de una casa independiente
    protected static double rateArea = 3000000;
    
    /**
     * Constructor de la clase CasaIndependiente
     * @param realStateId Parámetro que define el identificador inmobiliario de una casa
     *                    independiente
     * @param area Parámetro que define el área de una casa independiente
     * @param address Parámetro que define la dirección donde se encuentra localizada una casa
     *                 independiente
     * @param countRooms Parámetro que define el número de habitaciones que tiene una casa
     *                   independiente
     * @param countBathrooms Parámetro que define el número de baños que tiene una casa
     *                       independiente
     * @param numberFloors Parámetro que define el número de pisos
     * que tiene una casa independiente
     */
    public DetachedHouse(int realStateId, int area, String address, int countRooms,
                         int countBathrooms, int numberFloors) {
        super(realStateId, area, address, countRooms, countBathrooms, numberFloors);
    }
    
    public DetachedHouse() {
        this(0,0,null,0,0,0);
    }
}
