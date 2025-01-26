package org.example.projectRealState;

/**
 * Esta clase denominada HouseClosedSet modela un tipo
 * específico de casa urbana que se encuentra en un conjunto cerrado
 * con atributos como el valor por área, valor de la administración y
 * valores booleanos para especificar si tiene piscina y campos deportivos.
 * @version 1.2/2025
 */
public class HouseClosedSet extends UrbanHouse {
    
    // Atributo que define el valor por área de una casa en conjunto cerrado
    protected static double rateArea = 2500000;
    
    // Atributo que define el valor de administración de una casa en conjunto cerrado
    protected int rateAdmin;
    
    // Atributo que define si una casa en conjunto cerrado tiene piscina
    protected boolean havePool;
    
    // Atributo que define si una casa en conjunto cerrado tiene campos deportivos
    protected boolean hasSportsFields;
    
    /**
     * Constructor de la clase HouseClosedSet
     * @param realStateId Parámetro que define el identificador inmobiliario de una casa en
     *                    conjunto cerrado
     * @param area Parámetro que define el área de una casa en conjunto cerrado
     * @param address Parámetro que define la dirección donde se encuentra localizada una casa en
     *               conjunto cerrado
     * @param countRooms Parámetro que define el número de habitaciones que tiene una casa en
     *                   conjunto cerrado
     * @param countBathrooms Parámetro que define el número de baños que tiene una casa en
     *                       conjunto cerrado
     * @param numberFloors Parámetro que define el número de pisos que tiene una casa en conjunto
     *                    cerrado
     * @param rateAdmin Parámetro que define el valor de administración para una casa en conjunto
     *                 cerrado
     * @param havePool Parámetro que define si una casa en conjunto cerrado tiene o no piscina
     * @param hasSportField Parámetro que define si una casa en conjunto cerrado tiene o no
     *                      campos deportivos
     */
    public HouseClosedSet(int realStateId,
                          int area,
                          String address,
                          int countRooms,
                          int countBathrooms,
                          int numberFloors,
                          int rateAdmin,
                          boolean havePool,
                          boolean hasSportsField) {
        // Invoca al constructor de la clase padre
        super(realStateId, area, address, countRooms, countBathrooms, numberFloors);
        this.rateAdmin = rateAdmin;
        this.havePool = havePool;
        this.hasSportsFields = hasSportsField;
    }
    
    public HouseClosedSet() {
        this(0,0,null,0,0,0,0,false,false);
    }
    
    
    /**
     * Metodo que muestra en pantalla los datos de una casa en conjunto
     * cerrado
     */
    @Override
    void info() {
        super.info(); // Invoca al metodo imprimir de la clase padre
        System.out.println("Valor de la administración = " + rateAdmin +
                "\nTiene piscina? = " + havePool +
                "\nTiene sports? = " + hasSportsFields
                );
    }
}
