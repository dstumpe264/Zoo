package com.skilldistillery.animals;

public class Giraffe extends Mammal { // Concrete Class. Can instantiate. Can be real. Implements any abstract method it inherits
	
	//FIELDS
	public static final String GENUS = "Giraffa";
	public static final String SPECIES = "camelopardalis";
	
	private int neckLength;
	
	

	//CONSTRUCTORS
	public Giraffe() {
		super();
	}
	public Giraffe(int neckLength) {
		super();
		this.neckLength = neckLength;
	}
	public Giraffe(String name, int howHungry) {
		this(name, howHungry, 1);
		
	}
	public Giraffe(String name, int howHungry, int furLength) {
		super(name, howHungry, furLength);
		this.neckLength = 10;
	}
	public Giraffe(String name, int howHungry, int furLength, int neckLength) {
		super(name, howHungry, furLength);
		this.neckLength = neckLength;
	}

	//GETTERS AND SETTERS
	public int getNeckLength() {
		return neckLength;
	}

	public void setNeckLength(int neckLength) {
		this.neckLength = neckLength;
	}
	
	//METHODS
	
	
	@Override
	public void makeNoise() {
		System.out.println("I'm tall! druuu");
	}
	@Override
	public int eatFood(int howMuch) { // Command option s / override/implement methods to add methods from superclass
		System.out.println("These leaves are yummy!");
		return super.eatFood(howMuch);
	}

}
