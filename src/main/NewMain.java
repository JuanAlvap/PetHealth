/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author cande
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // Create PetHealth
        PetHealth petHealth = new PetHealth();
        
        // Create Owners
        petHealth.addOwner(new Owner(200100000, "Hildefons Abioye"));
        petHealth.addOwner(new Owner(200100001, "Jamila Merino"));
        petHealth.addOwner(new Owner(200100002, "Chi Sniegowski"));
        petHealth.addOwner(new Owner(200100003, "Fabius Boros"));
        petHealth.addOwner(new Owner(200100004, "Nyree Van der Venne"));
        petHealth.addOwner(new Owner(200100005, "Sveinn Klymenko"));
        petHealth.addOwner(new Owner(200100006, "Kasimir Hayden"));
        petHealth.addOwner(new Owner(200100007, "Herakleides Aoyama"));
        
        // Create Doctors
        petHealth.addDoctor(new Doctor(200200000, "Magda Vincent"));
        petHealth.addDoctor(new Doctor(200200001, "Max Vida"));
        petHealth.addDoctor(new Doctor(200200002, "Gwenddoleu Thacker"));
        petHealth.addDoctor(new Doctor(200200003, "Devaki Hawk"));
        petHealth.addDoctor(new Doctor(200200004, "Helena Browne"));
        
        // Create Pets
        petHealth.addPet(new Dog("Ikram", 3, 3.4, 40.9, petHealth.getOwner(0), "Bulldog"));
        petHealth.addPet(new Dog("Tashi", 9, 1.5, 10.5, petHealth.getOwner(0), "Beagle"));
        petHealth.addPet(new Dog("Malone", 1, 2.2, 20.6, petHealth.getOwner(1), "Rottweiler"));
        petHealth.addPet(new Dog("Francis", 2, 4.0, 47.3, petHealth.getOwner(2), "Chihuahua"));
        petHealth.addPet(new Dog("Ismat", 5, 0.6, 7.1, petHealth.getOwner(4), "Husky"));
        petHealth.addPet(new Dog("Chidiebele", 7, 4.7, 62.7, petHealth.getOwner(6), "Poodle"));
        
        petHealth.addPet(new Cat("Firdos", 2, 0.3, 5.4, petHealth.getOwner(0), "British Shorthair"));
        petHealth.addPet(new Cat("Lyric", 5, 0.9, 11.2, petHealth.getOwner(3), "Maine Coon"));
        petHealth.addPet(new Cat("Madhur", 7, 1.2, 14.7, petHealth.getOwner(4), "Bombay"));
        petHealth.addPet(new Cat("Tracy", 6, 0.7, 8.1, petHealth.getOwner(5), "Scottish Fold"));
        petHealth.addPet(new Cat("Sung-Hyun", 3, 1.5, 17.3, petHealth.getOwner(7), "Chartreux"));
        
        petHealth.addPet(new Parrot("Rini", 1, 0.1, 3.1, petHealth.getOwner(0)));
        petHealth.addPet(new Parrot("Murphy", 9, 0.5, 5.3, petHealth.getOwner(2)));
        petHealth.addPet(new Parrot("Vinh", 7, 0.2, 0.9, petHealth.getOwner(5)));
        petHealth.addPet(new Parrot("Tionge", 4, 0.3, 2.5, petHealth.getOwner(7)));
        petHealth.addPet(new Parrot("Adebowale", 2, 0.4, 3.7, petHealth.getOwner(7)));
        
        // Create Treatments
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(petHealth.getDoctor(0));
        petHealth.createTreatment(petHealth.getPet(0), doctors, TreatmentType.GENERAL_CHECKUP, LocalDate.of(2023, 6, 21), 10.50);
        
        doctors = new ArrayList<>();
        doctors.add(petHealth.getDoctor(1));
        petHealth.createTreatment(petHealth.getPet(0), doctors, TreatmentType.DEWORMING, LocalDate.of(2023, 6, 21), 22.90);
        
        doctors = new ArrayList<>();
        doctors.add(petHealth.getDoctor(2));
        petHealth.createTreatment(petHealth.getPet(0), doctors, TreatmentType.VACCINATION, LocalDate.of(2023, 8, 1), 5.25);
        
        doctors = new ArrayList<>();
        doctors.add(petHealth.getDoctor(2));
        petHealth.createTreatment(petHealth.getPet(0), doctors, TreatmentType.VACCINATION, LocalDate.of(2023, 8, 1), 5.25);
        
        doctors = new ArrayList<>();
        doctors.add(petHealth.getDoctor(0));
        doctors.add(petHealth.getDoctor(3));
        doctors.add(petHealth.getDoctor(4));
        petHealth.createTreatment(petHealth.getPet(0), doctors, TreatmentType.SURGERY, LocalDate.of(2024, 3, 17), 59.80);
        
        doctors = new ArrayList<>();
        doctors.add(petHealth.getDoctor(1));
        petHealth.createTreatment(petHealth.getPet(2), doctors, TreatmentType.GENERAL_CHECKUP, LocalDate.of(2023, 6, 21), 10.50);
        
        doctors = new ArrayList<>();
        doctors.add(petHealth.getDoctor(2));
        petHealth.createTreatment(petHealth.getPet(1), doctors, TreatmentType.DEWORMING, LocalDate.of(2023, 6, 21), 22.90);
        
        doctors = new ArrayList<>();
        doctors.add(petHealth.getDoctor(2));
        petHealth.createTreatment(petHealth.getPet(3), doctors, TreatmentType.VACCINATION, LocalDate.of(2023, 8, 1), 5.25);
        
        doctors = new ArrayList<>();
        doctors.add(petHealth.getDoctor(3));
        petHealth.createTreatment(petHealth.getPet(5), doctors, TreatmentType.VACCINATION, LocalDate.of(2023, 8, 1), 5.25);
        
        doctors = new ArrayList<>();
        doctors.add(petHealth.getDoctor(1));
        doctors.add(petHealth.getDoctor(2));
        doctors.add(petHealth.getDoctor(4));
        petHealth.createTreatment(petHealth.getPet(8), doctors, TreatmentType.SURGERY, LocalDate.of(2024, 3, 17), 59.80);
        
        doctors = new ArrayList<>();
        doctors.add(petHealth.getDoctor(4));
        petHealth.createTreatment(petHealth.getPet(14), doctors, TreatmentType.GENERAL_CHECKUP, LocalDate.of(2023, 6, 21), 10.50);
        
        doctors = new ArrayList<>();
        doctors.add(petHealth.getDoctor(1));
        petHealth.createTreatment(petHealth.getPet(12), doctors, TreatmentType.DEWORMING, LocalDate.of(2023, 6, 21), 22.90);
        
        doctors = new ArrayList<>();
        doctors.add(petHealth.getDoctor(0));
        petHealth.createTreatment(petHealth.getPet(5), doctors, TreatmentType.VACCINATION, LocalDate.of(2023, 8, 1), 5.25);
        
        doctors = new ArrayList<>();
        doctors.add(petHealth.getDoctor(1));
        petHealth.createTreatment(petHealth.getPet(11), doctors, TreatmentType.VACCINATION, LocalDate.of(2023, 8, 1), 5.25);
        
        doctors = new ArrayList<>();
        doctors.add(petHealth.getDoctor(1));
        doctors.add(petHealth.getDoctor(2));
        doctors.add(petHealth.getDoctor(3));
        petHealth.createTreatment(petHealth.getPet(8), doctors, TreatmentType.SURGERY, LocalDate.of(2024, 3, 17), 59.80);
        
        doctors = new ArrayList<>();
        doctors.add(petHealth.getDoctor(0));
        petHealth.createTreatment(petHealth.getPet(7), doctors, TreatmentType.GENERAL_CHECKUP, LocalDate.of(2023, 6, 21), 10.50);
        
        doctors = new ArrayList<>();
        doctors.add(petHealth.getDoctor(2));
        petHealth.createTreatment(petHealth.getPet(8), doctors, TreatmentType.DEWORMING, LocalDate.of(2023, 6, 21), 22.90);
        
        doctors = new ArrayList<>();
        doctors.add(petHealth.getDoctor(4));
        petHealth.createTreatment(petHealth.getPet(13), doctors, TreatmentType.VACCINATION, LocalDate.of(2023, 8, 1), 5.25);
        
        doctors = new ArrayList<>();
        doctors.add(petHealth.getDoctor(4));
        petHealth.createTreatment(petHealth.getPet(15), doctors, TreatmentType.VACCINATION, LocalDate.of(2023, 8, 1), 5.25);
        
        doctors = new ArrayList<>();
        doctors.add(petHealth.getDoctor(0));
        doctors.add(petHealth.getDoctor(4));
        doctors.add(petHealth.getDoctor(1));
        petHealth.createTreatment(petHealth.getPet(0), doctors, TreatmentType.SURGERY, LocalDate.of(2024, 3, 17), 59.80);
        
        doctors = new ArrayList<>();
        doctors.add(petHealth.getDoctor(1));
        petHealth.createTreatment(petHealth.getPet(4), doctors, TreatmentType.GENERAL_CHECKUP, LocalDate.of(2023, 6, 21), 10.50);
        
        doctors = new ArrayList<>();
        doctors.add(petHealth.getDoctor(3));
        petHealth.createTreatment(petHealth.getPet(6), doctors, TreatmentType.DEWORMING, LocalDate.of(2023, 6, 21), 22.90);
        
        doctors = new ArrayList<>();
        doctors.add(petHealth.getDoctor(2));
        petHealth.createTreatment(petHealth.getPet(9), doctors, TreatmentType.VACCINATION, LocalDate.of(2023, 8, 1), 5.25);
        
        doctors = new ArrayList<>();
        doctors.add(petHealth.getDoctor(3));
        petHealth.createTreatment(petHealth.getPet(10), doctors, TreatmentType.VACCINATION, LocalDate.of(2023, 8, 1), 5.25);
        
        doctors = new ArrayList<>();
        doctors.add(petHealth.getDoctor(0));
        doctors.add(petHealth.getDoctor(1));
        doctors.add(petHealth.getDoctor(2));
        petHealth.createTreatment(petHealth.getPet(0), doctors, TreatmentType.SURGERY, LocalDate.of(2024, 3, 17), 59.80);
        
        doctors = new ArrayList<>();
        doctors.add(petHealth.getDoctor(1));
        petHealth.createTreatment(petHealth.getPet(5), doctors, TreatmentType.GENERAL_CHECKUP, LocalDate.of(2023, 6, 21), 10.50);
        
        doctors = new ArrayList<>();
        doctors.add(petHealth.getDoctor(4));
        petHealth.createTreatment(petHealth.getPet(10), doctors, TreatmentType.DEWORMING, LocalDate.of(2023, 6, 21), 22.90);
        
        doctors = new ArrayList<>();
        doctors.add(petHealth.getDoctor(3));
        petHealth.createTreatment(petHealth.getPet(8), doctors, TreatmentType.VACCINATION, LocalDate.of(2023, 8, 1), 5.25);
        
        doctors = new ArrayList<>();
        doctors.add(petHealth.getDoctor(1));
        petHealth.createTreatment(petHealth.getPet(1), doctors, TreatmentType.VACCINATION, LocalDate.of(2023, 8, 1), 5.25);
        
        doctors = new ArrayList<>();
        doctors.add(petHealth.getDoctor(0));
        doctors.add(petHealth.getDoctor(2));
        doctors.add(petHealth.getDoctor(4));
        petHealth.createTreatment(petHealth.getPet(14), doctors, TreatmentType.SURGERY, LocalDate.of(2024, 3, 17), 59.80);
        
        // Execute Methods
        petHealth.doctorSummary();
        petHealth.ownerPetSummary();
        System.out.println("The owner who has spent the most is " + petHealth.ownerMostSpent().getName() + " with $" + petHealth.valueMostSpent());
    }
    
}

/**
------------- Resultados -------------

---------- Doctor Summary ----------
Id: 200200000, Name: Magda Vincent
- Attendance:
  - Dogs: 5
  - Cats: 1
  - Parrots: 1
- Treatments:
  - Vaccinations: 1
  - Dewormings: 0
  - Surgeries: 4
  - General Checkups: 2

Id: 200200001, Name: Max Vida
- Attendance:
  - Dogs: 7
  - Cats: 2
  - Parrots: 2
- Treatments:
  - Vaccinations: 2
  - Dewormings: 2
  - Surgeries: 4
  - General Checkups: 3

Id: 200200002, Name: Gwenddoleu Thacker
- Attendance:
  - Dogs: 5
  - Cats: 4
  - Parrots: 1
- Treatments:
  - Vaccinations: 4
  - Dewormings: 2
  - Surgeries: 4
  - General Checkups: 0

Id: 200200003, Name: Devaki Hawk
- Attendance:
  - Dogs: 2
  - Cats: 4
  - Parrots: 0
- Treatments:
  - Vaccinations: 3
  - Dewormings: 1
  - Surgeries: 2
  - General Checkups: 0

Id: 200200004, Name: Helena Browne
- Attendance:
  - Dogs: 2
  - Cats: 2
  - Parrots: 4
- Treatments:
  - Vaccinations: 2
  - Dewormings: 1
  - Surgeries: 4
  - General Checkups: 1

---------- Owner and Pet Summary ----------
Id: 200100000, Name: Hildefons Abioye, Number of Pets: 4
- Pet 1 (Dog):
  - Name: Ikram, Age: 3, Breed: Bulldog, Height: 3.40, Weight: 40.90
  - Treatments ID: [0, 1, 2, 3, 4, 19, 24]
- Pet 2 (Dog):
  - Name: Tashi, Age: 9, Breed: Beagle, Height: 1.50, Weight: 10.50
  - Treatments ID: [6, 28]
- Pet 3 (Cat):
  - Name: Firdos, Age: 2, Breed: British Shorthair, Height: 0.30, Weight: 5.40
  - Treatments ID: [21]
- Pet 4 (Parrot):
  - Name: Rini, Age: 1, Height: 0.10, Weight: 3.10
  - Treatments ID: [13]

Id: 200100001, Name: Jamila Merino, Number of Pets: 1
- Pet 1 (Dog):
  - Name: Malone, Age: 1, Breed: Rottweiler, Height: 2.20, Weight: 20.60
  - Treatments ID: [5]

Id: 200100002, Name: Chi Sniegowski, Number of Pets: 2
- Pet 1 (Dog):
  - Name: Francis, Age: 2, Breed: Chihuahua, Height: 4.00, Weight: 47.30
  - Treatments ID: [7]
- Pet 2 (Parrot):
  - Name: Murphy, Age: 9, Height: 0.50, Weight: 5.30
  - Treatments ID: [11]

Id: 200100003, Name: Fabius Boros, Number of Pets: 1
- Pet 1 (Cat):
  - Name: Lyric, Age: 5, Breed: Maine Coon, Height: 0.90, Weight: 11.20
  - Treatments ID: [15]

Id: 200100004, Name: Nyree Van der Venne, Number of Pets: 2
- Pet 1 (Dog):
  - Name: Ismat, Age: 5, Breed: Husky, Height: 0.60, Weight: 7.10
  - Treatments ID: [20]
- Pet 2 (Cat):
  - Name: Madhur, Age: 7, Breed: Bombay, Height: 1.20, Weight: 14.70
  - Treatments ID: [9, 14, 16, 27]

Id: 200100005, Name: Sveinn Klymenko, Number of Pets: 2
- Pet 1 (Cat):
  - Name: Tracy, Age: 6, Breed: Scottish Fold, Height: 0.70, Weight: 8.10
  - Treatments ID: [22]
- Pet 2 (Parrot):
  - Name: Vinh, Age: 7, Height: 0.20, Weight: 0.90
  - Treatments ID: [17]

Id: 200100006, Name: Kasimir Hayden, Number of Pets: 1
- Pet 1 (Dog):
  - Name: Chidiebele, Age: 7, Breed: Poodle, Height: 4.70, Weight: 62.70
  - Treatments ID: [8, 12, 25]

Id: 200100007, Name: Herakleides Aoyama, Number of Pets: 3
- Pet 1 (Cat):
  - Name: Sung-Hyun, Age: 3, Breed: Chartreux, Height: 1.50, Weight: 17.30
  - Treatments ID: [23, 26]
- Pet 2 (Parrot):
  - Name: Tionge, Age: 4, Height: 0.30, Weight: 2.50
  - Treatments ID: [10, 29]
- Pet 3 (Parrot):
  - Name: Adebowale, Age: 2, Height: 0.40, Weight: 3.70
  - Treatments ID: [18]

The owner who has spent the most is Hildefons Abioye with $279.60
*/