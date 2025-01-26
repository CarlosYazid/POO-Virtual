package org.example.projectBiking;

// Metodos abstractos

/**
 * Esta clase prueba diferentes acciones realizadas por un equipo ciclístico
 * y sus diferentes corredores
 * @version 1.2/2025
 */
public class TestBiking {
    
    /**
     * Metodo main que crea un equipo. Luego, crea un escalador, un
     * velocista y un contrarrelojista. Estos tipos de ciclistas son añadidos
     * al equipo. Se asignan tiempos a cada ciclista para al final obtener el
     * tiempo total del equipo
     */
    public static void main (String[] args) {
        
        Team team = new Team("Sky","Estados Unidos");
        Biker sprinter = new Sprinter(123979, "Geraint Thomas",
                320, 25);
        Biker climber = new Climber(123980, "Egan Bernal",
                25, 10);
        Biker timeTrailBiker = new TimeTrailBiker(123981,
                "Jonathan Castroviejo", 120);
        team.addBiker(sprinter);
        team.addBiker(climber);
        team.addBiker(timeTrailBiker);
        sprinter.setTimeAccumulated(365);
        climber.setTimeAccumulated(385);
        timeTrailBiker.setTimeAccumulated(370);
        team.computeTotalTime();
        team.info();
        team.listBikers();
    }
}
