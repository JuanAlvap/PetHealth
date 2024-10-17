/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.util.ArrayList;

/**
 *
 * @author cande
 */
public abstract class Pet {
    protected String name;
    protected int age;
    protected double height;
    protected double weight;
    protected Owner owner;
    protected ArrayList<Treatment> treatments;   

    public Pet(String name, int age, double height, double weight, Owner owner) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.owner = owner;
        
        this.owner.addPet(this);
    }
    
    public boolean addTreatment(Treatment treatment){
        if(!this.treatments.contains(treatment)){
            this.treatments.add(treatment);
            return true;
        }
        return false;
    }

    public ArrayList<Treatment> getTreatments() {
        return treatments;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public Owner getOwner() {
        return owner;
    }
    
    
    
}
