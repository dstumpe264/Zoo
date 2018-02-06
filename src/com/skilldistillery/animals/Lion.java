package com.skilldistillery.animals;

public class Lion extends Mammal { // Concrete class

	//CONSTRUCTORS
	public Lion() {
		super();
	}

	public Lion(String name, int howHungry, int furLength) {
		super(name, howHungry, furLength);
	}

	public Lion(String name, int howHungry) {
		super(name, howHungry);
	}

	//METHODS
	@Override
	public void makeNoise() {
		System.out.println("ROAR!!");
	}

	@Override
	public int eatFood(int howMuch) {
		System.out.println("Grrrr, yummy buffalo chomp, chomp!!!");
		return super.eatFood(howMuch);
	}
	

}
