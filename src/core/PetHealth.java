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
            owner.setPetHealth(this);
            return true;
        }
        return false;
    }

    public boolean addDoctor(Doctor doctor) {
        if (!this.doctors.contains(doctor)) {
            this.doctors.add(doctor);
            doctor.setPetHealth(this);
            return true;
        }
        return false;
    }

    public Owner getOwner(int index) {
        return this.owners.get(index);
    }

    public boolean addPet(Pet pet) {
        if (!this.pets.contains(pet)) {
            this.pets.add(pet);
            return true;
        }
        return false;
    }

    public Doctor getDoctor(int index) {
        return this.doctors.get(index);
    }

    public Pet getPet(int index) {
        return this.pets.get(index);
    }

    public boolean createTreatment(Pet pet, ArrayList<Doctor> doctors, TreatmentType type, LocalDate date, double cost) {
        this.treatments.add(new Treatment(pet, doctors, type, date, cost));
        return true;
    }

    public void valueMostSpent() {

    }

    public void ownerPetSummary() {
        System.out.println("---------- Owner and Pet Summary ----------");
        
    }

    public Owner ownerMostSpent() {
        return null;
    }

    public void doctorSummary() {
        System.out.println("---------- Doctor Summary ----------");
        for(Doctor doctor : this.doctors){
            System.out.println("Id: "+ doctor.getId() + ", Name: "+ doctor.getName());
            System.out.println("- Attendance:");
            int dogs = 0, cats = 0, parrots = 0, vaccinations = 0, dewormings = 0, surgeries = 0, generals = 0;
            for(Treatment treatment : doctor.getTreatments()){
               if(treatment.getPet() instanceof Dog){
                   dogs++;
               }
               else if(treatment.getPet() instanceof Cat){
                   cats++;
               }
               else if(treatment.getPet() instanceof Parrot){
                   parrots++;
               }
               
               if(treatment.getType() == TreatmentType.VACCINATION){
                   vaccinations++;
               }
               else if(treatment.getType() == TreatmentType.DEWORMING){
                   dewormings++;
               }
               else if(treatment.getType() == TreatmentType.SURGERY){
                   surgeries++;
               }
               else if(treatment.getType() == TreatmentType.GENERAL_CHECKUP){
                   generals++;
               }
                  
            }
            System.out.println("  - Dogs: " + dogs);
            System.out.println("  - Cats: " + cats);
            System.out.println("  - Parrots: "+ parrots);
            System.out.println("- Treatments: ");
            System.out.println("  - Vaccinations: " + vaccinations);
            System.out.println("  - Dewormings: " + dewormings );
            System.out.println("  - Surgeries: " + surgeries);
            System.out.println("  -General Checkups:  " + generals);
            
        }
    }

}
