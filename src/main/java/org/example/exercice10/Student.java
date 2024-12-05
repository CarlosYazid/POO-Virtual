package org.example.exercice10;

import java.util.Objects;
import java.util.Random;

public class Student {
    
    private static Random rand = new Random();
    private static final float BASECOST = 50000.0f;
    private static final int MINPATRYMONY = 2000000;
    private static final int MINSTRATA = 3;
    private static final float RATEBYPATRIMONY = 0.03f;
    
    private int id;
    private String name;
    private float patrimony;
    private int socialStrata;
    private float universityTuition;
    
    public Student(int id, String name, float patrimony, int socialStrata) {
        this.id = id;
        this.name = name;
        this.patrimony = patrimony;
        this.socialStrata = socialStrata;
    }
    
    public Student(String name, float patrimony, int socialStrata) {
        this(rand.nextInt(), name, patrimony, socialStrata);
    }
    
    public float computeUniversityTuition() {
        universityTuition =  BASECOST + ((patrimony > MINPATRYMONY && socialStrata > MINSTRATA)?
                RATEBYPATRIMONY * patrimony : 0);
        return universityTuition;
    }
    
    
    @Override
    public String toString () {
        return "Student{" + "id=" + id + ", name='" + name + '\'' + ", patrimony=" + patrimony + ", socialStrata=" + socialStrata + ", universityTuition=" + universityTuition + '}';
    }
    
    @Override
    public boolean equals (Object o) {
        if (!(o instanceof Student student)) return false;
        return getId() == student.getId();
    }
    
    @Override
    public int hashCode () {
        return Objects.hashCode(getId());
    }
    
    public int getId () {
        return id;
    }
    
    public void setId (int id) {
        this.id = id;
    }
    
    public String getName () {
        return name;
    }
    
    public void setName (String name) {
        this.name = name;
    }
    
    public float getPatrimony () {
        return patrimony;
    }
    
    public void setPatrimony (float patrimony) {
        this.patrimony = patrimony;
    }
    
    public int getSocialStrata () {
        return socialStrata;
    }
    
    public void setSocialStrata (int socialStrata) {
        this.socialStrata = socialStrata;
    }
    
    public float getUniversityTuition () {
        return universityTuition;
    }
    
    public void setUniversityTuition (float universityTuition) {
        this.universityTuition = universityTuition;
    }
}
