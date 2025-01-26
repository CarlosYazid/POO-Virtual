package org.example.projectRealState;

/**
 * Esta clase denominada BusinessPremises modela un tipo específico de
 * Local destinado para un uso comercial con atributos como el valor
 * por área y el centro comercial al cual pertenece.
 * @version 1.2/2025
 */
public class BusinessPremises extends Premises {
    
    // Atributo que identifica el valor por área de un local comercial
    protected static double rateArea = 3000000;
    
    // Atributo que identifica el centro comercial donde está ubicado el local comercial
    protected String shoppingMall;
    
    /**
     * Constructor de la clase LocalComercial
     * @param realStateId Parámetro que define el identificador inmobiliario de un local comercial
     * @param area Parámetro que define el área de un local comercial
     * @param address Parámetro que define la dirección donde se encuentra localizado un local
     *                comercial
     * @param type Parámetro que define el tipo de local comercial (interno o que da a la calle)
     * @param shoppingMall Parámetro que define el nombre del centro comercial donde está ubicado
     *                    el local comercial
     */
    public BusinessPremises(int realStateId, int area, String address, Type type,
                            String shoppingMall) {
        // Invoca al constructor de la clase padre
        super(realStateId, area, address, type);
        this.shoppingMall = shoppingMall;
    }
    
    public BusinessPremises() {
        this(0,0,null,null,null);
    }
    
    /**
     * Metodo que muestra en pantalla los datos de un local comercial
     */
    @Override
    void info() {
        super.info(); // Invoca al metodo imprimir de la clase padre
        System.out.println("Centro comercial = " + shoppingMall);
    }
    
}
