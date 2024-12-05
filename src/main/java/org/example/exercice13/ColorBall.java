package org.example.exercice13;

public enum ColorBall {
    
    WHITE(0),
    GREEN(0.10f),
    YELLOW(0.25f),
    BLUE(0.50f),
    DEFAULT(1);
    
    private float desc;
    
     ColorBall(float desc) {
        this.desc = desc;
    }
    
    public float getDesc () {
        return desc;
    }
}
