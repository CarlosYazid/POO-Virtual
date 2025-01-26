package org.example.projectRealState;

// Paquetes y metodos de acceso

/**
 * Esta clase prueba diferentes inmuebles, se calcula su precio de
 * acuerdo al área y se muestran sus datos en pantalla
 * @version 1.2/2025
 */
public class TestRealState {
    
    /**
     * Metodo main que crea dos inmuebles, calcula su precio de
     * acuerdo al área y se muestran sus datos en pantalla
     */
    public static void main (String[] args) {
        
        Property property = new FamilyApartment(103067,120,
                "Avenida Santander 45-45",3,2,200000);
        System.out.println("Datos apartamento");
        property.computeSalePrice(FamilyApartment.rateArea);
        property.info();
        
        System.out.println("Datos apartamento");
        Property property2 = new StudioApartment(12354,50,"Avenida Caracas 30-15");
        property2.computeSalePrice(StudioApartment.rateArea);
        property2.info();
    }
}
