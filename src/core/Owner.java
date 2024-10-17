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
public class Owner extends Person {

    private PetHealth petHealth;
    private ArrayList<Pet> pets;

    public Owner(int id, String name) {
        super(id, name);
        this.pets = new ArrayList<>();
        
        this.petHealth = null;
    }

    public PetHealth getPetHealth() {
        return petHealth;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean addPet(Pet pet) {
        if (this.pets.contains(pet)) {
            this.pets.add(pet);
            return true;
        }
        return false;
    }

    public void setPetHealth(PetHealth petHealth) {
        this.petHealth = petHealth;
        //this.petHealth.addOwner(this);
    }

}
