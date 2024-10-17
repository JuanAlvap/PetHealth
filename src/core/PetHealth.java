/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

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
    

    public boolean addOwner(Owner o) {
        o.setPetHealth(this);
        if (!this.owners.contains(o)) {
            this.owners.add(o);
            
            return true;
        }
        return false;
    }

    public boolean addDoctor(Doctor doctor) {
        
        if (!this.doctors.contains(doctor)) {
            doctor.setPetHealth(this);
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
        Treatment t = new Treatment(pet, doctors, type, date, cost);
        for(Doctor d: doctors){
            d.addTreatment(t);
            t.addDoctor(d);
        }
        if(!this.treatments.contains(t)){
            this.treatments.add(t);
            return true;
        }
        
        return false;
    }

    public double valueMostSpent() {
        return valueMost;
    }

    public void ownerPetSummary() {
        System.out.println("---------- Owner and Pet Summary ----------");
        for (Owner owner : this.owners) {
            System.out.println("Id: " + owner.getId() + ", Name: " + owner.getName() + ", Number of Pets: " + owner.getPets().size());
            int petIndex = 1;
            for (Pet pet : owner.getPets()) {
                System.out.println("- Pet " + petIndex + " (" + pet.getClass().getName().split("\\.")[1] + "):");
                if (pet instanceof Dog || pet instanceof Cat) {
                    String breed = "";
                    if (pet instanceof Dog) {
                        Dog petInfo = (Dog) pet;
                        breed = petInfo.getBreed();
                    } else if (pet instanceof Cat) {
                        Cat petInfo = (Cat) pet;
                        breed = petInfo.getBreed();
                    }

                    System.out.println("  - Name" + pet.getName() + ", Age: " + pet.getAge() + ", Breed: " + breed + ", Height: " + pet.getHeight() + ", Weight: " + pet.getWeight());

                } else {
                    System.out.println("  - Name" + pet.getName() + ", Age: " + pet.getAge() + ", Height: " + pet.getHeight() + ", Weight: " + pet.getWeight());
                }
                System.out.println("  - Treatments ID: [");
                int treatmentIndex = 0;
                for (Treatment t : pet.getTreatments()) {
                    if (treatmentIndex == (pet.getTreatments().size() - 1)) {
                        System.out.print(" " + t.getId() + "]");
                    } else {
                        System.out.print(" " + t.getId() + ",");
                    }
                    treatmentIndex++;
                }
                petIndex++;
            }
        }

    }

    private static double valueMost = 0.0;

    public Owner ownerMostSpent() {
        HashMap<Owner, Double> ownerMost = new HashMap<>();
        for (Owner owner : this.owners) {
            ownerMost.put(owner, 0.0);
        }
        for (Owner owner : this.owners) {
            for (Pet pet : owner.getPets()) {
                for (Treatment treatment : pet.getTreatments()) {
                    ownerMost.replace(owner, ownerMost.get(owner)+treatment.getCost());
                }
            }
        }
        Owner ownerReturn = null;
        for (Map.Entry<Owner, Double> entry : ownerMost.entrySet()) {
            if (entry.getValue() > valueMost) {
                valueMost = entry.getValue();
                ownerReturn = entry.getKey();
            }
        }
        return ownerReturn;
    }

    public void doctorSummary() {
        System.out.println("---------- Doctor Summary ----------");
        for (Doctor doctor : this.doctors) {
            System.out.println("Id: " + doctor.getId() + ", Name: " + doctor.getName());
            System.out.println("- Attendance:");
            int dogs = 0, cats = 0, parrots = 0, vaccinations = 0, dewormings = 0, surgeries = 0, generals = 0;
            for (Treatment treatment : doctor.getTreatments()) {
                
                if (treatment.getPet() instanceof Dog) {
                    dogs++;
                } else if (treatment.getPet() instanceof Cat) {
                    cats++;
                } else if (treatment.getPet() instanceof Parrot) {
                    parrots++;
                }

                if (treatment.getType() == TreatmentType.VACCINATION) {
                    vaccinations++;
                } else if (treatment.getType() == TreatmentType.DEWORMING) {
                    dewormings++;
                } else if (treatment.getType() == TreatmentType.SURGERY) {
                    surgeries++;
                } else if (treatment.getType() == TreatmentType.GENERAL_CHECKUP) {
                    generals++;
                }

            }
            System.out.println("  - Dogs: " + dogs);
            System.out.println("  - Cats: " + cats);
            System.out.println("  - Parrots: " + parrots);
            System.out.println("- Treatments: ");
            System.out.println("  - Vaccinations: " + vaccinations);
            System.out.println("  - Dewormings: " + dewormings);
            System.out.println("  - Surgeries: " + surgeries);
            System.out.println("  -General Checkups:  " + generals);

        }
    }

}
