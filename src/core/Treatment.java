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
public class Treatment {

    private static int ID = 0;

    private int id;
    private TreatmentType type;
    private LocalDate date;
    private double cost;
    private Pet pet;
    private ArrayList<Doctor> doctors;

    public Treatment(Pet pet, ArrayList<Doctor> doctors, TreatmentType type, LocalDate date, double cost) {
        this.id = ID;
        this.type = type;
        this.date = date;
        this.cost = cost;
        this.pet = pet;
        this.doctors = doctors;

        ID++;
        this.pet.addTreatment(this);
    }

    public static int getID() {
        return ID;
    }

    public int getId() {
        return id;
    }

    public TreatmentType getType() {
        return type;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getCost() {
        return cost;
    }

    public Pet getPet() {
        return pet;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public boolean addDoctor(Doctor doctor) {
        if (!this.doctors.contains(doctor)) {
            this.doctors.add(doctor);
            return true;
        }
        return false;
    }

}
