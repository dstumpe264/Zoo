package com.skilldistillery.animals;

public class Attendant {
	private String name;

	public Attendant(String name) {
		super();
		this.name = name;
	}
	
	public void makeRounds(Animal[] animals) {
		System.out.println("Attendant: " +name+ " here, makin muh rounds.");
		for (Animal animal : animals) {
			if(animal != null) {
				System.out.println("Attending to "+animal.getName());
				animal.makeNoise();
				animal.eatFood(50);
				
			}
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
