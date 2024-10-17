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
public class Treatment{
    private int id;
    private TreatmentType type;
    private LocalDate date;
    private float cost;
    private Pet pet;
    private ArrayList<Doctor> doctors;
}
