package org.example.projectRealState;

/**
 * Esta clase denominada RuralHouse modela un tipo específico de casa ubicada en el sector rural
 * @version 1.2/2025
 */
public class RuralHouse extends House {
    
    // Atributo que identifica el valor por area para una casa rural
    protected static double rateArea = 1500000;
    
    // Atributo que identifica la distancia a la que se encuentra la casa rural de la cabecera
    // municipal
    protected int distanceNearestTown;
    
    // Atributo que identifica la altitud a la que se encuentra una casa rural
    protected int altitude;
    
    /**
     * Constructor de la clase RuralHouse
     * @param realStateId Parámetro que define el identificador inmobiliario de una casa rural
     * @param area Parámetro que define el área de una casa rural
     * @param address Parámetro que define la dirección donde se encuentra localizada una casa rural
     * @param countRooms Parámetro que define el número de habitaciones que tiene una casa rural
     * @param countBathrooms Parámetro que define el número de baños que tiene una casa rural
     * @param numberFloor Parámetro que define el número de pisos que tiene una casa rural
     * @param distanceNearestTown Parámetro que define la distancia de la casa rural
     *                            a la cabecera municipal
     * @param altitude Parámetro que define la altitud sobre el nivel del mar en que se
     *                 encuentra una casa rural
     */
    public RuralHouse(int realStateId,
                      int area,
                      String address,
                      int countRooms,
                      int countBathrooms,
                      int numberFloor,
                      int distanceNearestTown,
                      int altitude) {
        
        // Invoca al constructor de la clase padre
        super(realStateId,
                area,
                address,
                countRooms,
                countBathrooms,
                numberFloor);
        this.distanceNearestTown = distanceNearestTown;
        this.altitude = altitude;
    }
    
    public RuralHouse() {
        this(0, 0, null, 0, 0, 0, 0 ,0);
    }
    
    /**
     * Metodo que muestra en pantalla los datos de una casa rural
     */
    @Override
    void info() {
        super.info(); // Invoca al metodo imprimir de la clase padre
        System.out.println("Distancia la cabecera municipal = " + distanceNearestTown +
                        " km.\nAltitud sobre el nivel del mar = " + altitude + " metros.");
    }
    
}
