package com.skilldistillery.animals;

public abstract class Mammal extends Animal { // abstract because it extends Animal but does not implement abstract method from animal.
	
	//FIELDS
	public static final String CLASS = "Mammalia";
	private int furLength;
	
	//CONSTRUCTORS
	
	public Mammal() { //this constructor is not necessary it 
					 //automatically uses it's superclass' no-arg constructor
					 // but only if the super has a no-arg constructor or it won't compile
		super();
	}

	public Mammal(String name, int howHungry) {
		super(name, howHungry); //Delegates up to the animal constructor.
								// To be a mammal i am everything an animal is plus mammal
		this.furLength = 1;
	}
	
	public Mammal(String name, int howHungry, int furLength) {
		super(name, howHungry);
		this.furLength = furLength;
	}

	//GETTERS AND SETTERS
	
	public int getFurLength() {
		return furLength;
	}

	public void setFurLength(int furLength) {
		this.furLength = furLength;
	}

}
