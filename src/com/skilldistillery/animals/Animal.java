package com.skilldistillery.animals;

public abstract class Animal {
    public static final String KINGDOM = "Animalia";    
    private String name;
    private int howHungry;
    
    public abstract void makeNoise();
    public int eatFood(int howMuch) {
        howHungry = howHungry - howMuch;
        return howHungry;
    }
    
    public Animal() {}
    public Animal(String name, int howHungry) {
        super();
        this.name = name;
        this.howHungry = howHungry;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHowHungry() {
        return howHungry;
    }
    public void setHowHungry(int howHungry) {
        this.howHungry = howHungry;
    }
    
    @Override
    public String toString() {
      return this.getName() + " the " + this.getClass().getSimpleName();
    }

}
