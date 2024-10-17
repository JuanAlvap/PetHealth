/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

public class Dog extends Pet {
    private String breed;

    public Dog(String name, int age, double height, double weight, Owner owner, String breed) {
        super(name, age, height, weight, owner);
        this.breed = breed;
    }
    
    
}
