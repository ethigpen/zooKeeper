package com.thigpen.zooKeeper;

public class Gorilla extends Mammal{
//constructor
	public Gorilla(int energyLevelInput) {
		super(energyLevelInput);
	}
//	methods for gorilla
	public void throwSomething() {
		System.out.println("plop....you see something hit the ground");
		this.energyLevel -= 5;	
	}
	
	public void eatBananas() {
		System.out.println("you see the gorilla doing it's happy dance while eating bananas");
		this.energyLevel += 10;
	}
	
	public void climb() {
		System.out.println("you look away and look back the gorilla has left you to climb the rest tree");
		this.energyLevel -= 10;
	}
}
