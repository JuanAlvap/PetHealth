/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author cande
 */
public class PetHealth {

    private ArrayList<Doctor> doctors;
    private ArrayList<Owner> owners;
    private ArrayList<Pet> pets;
    private ArrayList<Treatment> treatments;

    public PetHealth() {
        this.doctors = new ArrayList<>();
        this.owners = new ArrayList<>();
        this.pets = new ArrayList<>();
        this.treatments = new ArrayList<>();
    }

    public boolean addOwner(Owner owner) {
        if (!this.owners.contains(owner)) {
            this.owners.add(owner);
            return true;
        }
        return false;
    }

    public boolean addDoctor(Doctor doctor) {
        if (!this.doctors.contains(doctor)) {
            this.doctors.add(doctor);
            return true;
        }
        return false;
    }

    public Owner getOwner(int index) {
        return this.owners.get(index);
    }

    public boolean addPet(Pet pet) {
        if(!this.pets.contains(pet)){
            this.pets.add(pet);
            return true;
        }
        return false;
    }
    
    public Doctor getDoctor(int index){
        return this.doctors.get(index);
    }
    
    public Pet getPet(int index){
        return this.pets.get(index);
    }
    
    public boolean createTreatment(Pet pet, ArrayList<Doctor> doctors, TreatmentType type, LocalDate date, double cost){
        this.treatments.add(new Treatment(pet, doctors, type, date, cost));
        return true;
    }

}
