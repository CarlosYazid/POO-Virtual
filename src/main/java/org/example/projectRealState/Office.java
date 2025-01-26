package org.example.projectRealState;

/**
 * Esta clase denominada Office modela un tipo específico de local
 * con atributos como el valor por área y un valor booleano para
 * determinar si pertenece o no al gobierno.
 * @version 1.2/2025
 */
public class Office extends Premises{
    
    // Atributo que identifica el valor por área de una oficina
    protected static double rateArea = 3500000;
    
    // Atributo que identifica si una oficina pertenece o no al gobierno
    protected boolean isGovernment;
    
    /**
     * Constructor de la clase Office
     * @param realStateId Parámetro que define el identificador inmobiliario de una oficina
     * @param area Parámetro que define el área de una oficina
     * @param address Parámetro que define la dirección donde se encuentra localizada una oficina
     * @param type Parámetro que define el tipo de una oficina (interna o que da a la calle)
     * @param isGovernment Parámetro que define un valor booleano para
     * determinar si la oficina es del gobierno o no
     */
    public Office(int realStateId, int area, String address, Type type, boolean isGovernment) {
        super(realStateId, area, address, type);
        this.isGovernment = isGovernment;
    }
    
    public Office() {
        this(0, 0, null, null, false);
    }
    
    /**
     * Metodo que muestra en pantalla los datos de una oficina
     */
    @Override
    void info() {
        super.info(); // Invoca al metodo imprimir de la clase padre
        System.out.println("Es oficina gubernamental = " + isGovernment);
    }
}
