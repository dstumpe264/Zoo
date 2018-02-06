package com.skilldistillery.animals;

//import com.skilldistillery.people.*;

public class Sanctuary /* extends java.lang.Object */ {
    private Animal[] animals;
    
    public Sanctuary() {
        animals = new Animal[20];
        animals[0] = new Giraffe("Gerry", 100, 1, 11);
        animals[1] = new Giraffe("Ginny", 100, 2, 12);
        animals[2] = new Lion("Leonard", 200, 4);
    }
    
    public Animal hungriestAnimal() {
      Animal hungriest = null;
      // iterate over animals array,
      // find hungriest animal to return
      return hungriest;
    }
    
    public void startTheDay() {
        System.out.println("Sanctuary open for business.");
        Attendant at = new Attendant("Jake");
        at.makeRounds(animals);
    }
    
    public boolean addAnimal(Animal a) {
      boolean added = false;
      for (int i = 0; i < animals.length; i++) {
      if (animals[i] == null) {
        animals[i] = a;
        added = true;
        break;
      }
    }
      return added;
    }
    
    public void listAnimals() {
      System.out.println("== Animals in this sanctuary ==");
      for (Animal animal : animals) {
      if (animal != null ) {
        System.out.println(animal);
      }
    }
    }
    
    
    

}
