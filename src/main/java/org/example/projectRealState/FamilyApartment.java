package org.example.projectRealState;

/**
 * Esta clase denominada FamilyApartment modela un tipo específico de apartamento
 * con atributos como el valor por área y el valor de la administración.
 * @version 1.2/2025
 */
public class FamilyApartment extends Apartment {
    
    // Atributo que identifica el valor por área de un apartamento familiar
    protected static double rateArea = 2000000;
    
    // Atributo que identifica el valor de la administración de un apartamento familiar
    protected int rateAdmin;
    
    /**
     * Constructor de la clase FamilyApartment
     * @param realStateId Parámetro que define el identificador inmobiliario de un
     *                    apartamento familiar
     * @param area Parámetro que define el área de un apartamento familiar
     * @param address Parámetro que define la dirección donde se encuentra localizado un
     *                apartamento familiar
     * @param countRooms Parámetro que define el número de habitaciones que tiene un apartamento
     *                   familiar
     * @param countBathrooms Parámetro que define el número de baños que tiene un apartamento
     *                       familiar
     * @param rateAdmin Parámetro que define el valor de la administración de un apartamento
     *                  familiar
     */
    
    public FamilyApartment(int realStateId,
                           int area,
                           String address,
                           int countRooms,
                           int countBathrooms,
                           int rateAdmin) {
        // Invoca al constructor de la clase padre
        super(realStateId,
                area,
                address,
                countRooms,
                countBathrooms);
        this.rateAdmin = rateAdmin;
    }
    
    public FamilyApartment() {
        this(0,0,null,0,0,0);
    }
    
    
    /**
     * Metodo que muestra en pantalla los datos de un apartamento familiar
     */
    @Override
    void info() {
        super.info(); // Invoca al metodo imprimir de la clase padre
        System.out.println("Valor de la administración = $" + rateAdmin);
    }
    
    
}
