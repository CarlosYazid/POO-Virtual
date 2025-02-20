package org.example.projectRealState;

/**
 * Esta clase denominada House modela un tipo específico de inmueble
 * destinado para la vivienda con atributos como el número de pisos
 * que tiene una casa.
 * @version 1.2/2025
 */
public class House extends PropertyHousing {
    
    // Atributo que identica el número de pisos que tiene una casa
    protected int numberFloors;
    
    /**
     * Constructor de la clase House
     * @param realStateId Parámetro que define el identificador inmobiliario de una casa
     * @param area Parámetro que define el área de una casa
     * @param address Parámetro que define la dirección donde se encuentra localizada una casa
     * @param countRoom Parámetro que define el número de habitaciones que tiene una casa
     * @param countBathroom Parámetro que define el número de baños que tiene una casa
     * @param numberFloors Parámetro que define el número de pisos que tiene una casa
     */
    public House(int realStateId,
                 int area,
                 String address,
                 int countRoom,
                 int countBathroom,
                 int numberFloors) {
        super(realStateId, area, address, countRoom, countBathroom);
        this.numberFloors = numberFloors;
    }
    
    public House() {
        this(0,0,null,0,0,0);
    }
    
    /**
     * Metodo que muestra en pantalla los datos de una casa
     */
    @Override
    void info() {
        super.info(); // Invoca al metodo imprimir de la clase padre
        System.out.println("Número de pisos = " + numberFloors);
    }
}
