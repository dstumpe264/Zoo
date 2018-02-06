package com.skilldistillery.animals;

import java.util.Scanner;

public class SanctuaryDriver {

    public static void main(String[] args) {
      Scanner kb = new Scanner(System.in);
      
        Sanctuary sanc = new Sanctuary();
        sanc.startTheDay();
        
        Giraffe g = new Giraffe("Gina",30, 1, 12);
        sanc.listAnimals();
        sanc.addAnimal(g);
        sanc.listAnimals();
        
        System.out.println("Add a lion to the sanctuary:");
        System.out.print("What is the lion's name? ");
        String name = kb.next();
        System.out.print("How hungry is it? ");
        int hungry = kb.nextInt();
        System.out.print("How long is its fur? ");
        int fur = kb.nextInt();
        Lion l = new Lion(name,hungry,fur);
        if (sanc.addAnimal(l)) {
          System.out.println(l + " added to sanctuary.");
        }
        else {
          System.out.println("Sorry, sanctuary full.");
        }
        
        sanc.listAnimals();

        kb.close();
    }

}