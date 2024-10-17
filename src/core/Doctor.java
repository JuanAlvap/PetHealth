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
public class Doctor extends Person {

    private PetHealth petHealth;
    private ArrayList<Treatment> treatments;

    public Doctor(int id, String name) {
        super(id, name);
        this.petHealth = null;
        this.treatments = new ArrayList<>();
        
        this.petHealth.addDoctor(this);
    }

    public PetHealth getPetHealth() {
        return petHealth;
    }

    public ArrayList<Treatment> getTreatments() {
        return treatments;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setPetHealth(PetHealth petHealth) {
        this.petHealth = petHealth;
    }

    public boolean addTreatment(Treatment treatment) {
        if (!this.treatments.contains(treatment)) {
            this.treatments.add(treatment);
            return true;
        }
        return false;
    }

}
