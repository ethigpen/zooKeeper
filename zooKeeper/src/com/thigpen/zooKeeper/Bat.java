package com.thigpen.zooKeeper;

public class Bat extends Mammal {
//
	public Bat(int energyLevelInput) {
		super(energyLevelInput);
	}
//	methods for bat
	public void fly() {
		System.out.println("whoooooooshhhhh....you see something big and murky take off into the night");
		this.energyLevel -= 50;	
	}
	
	public void eatHumans() {
		System.out.println("what is that sound, you ponder as you take your nightly stroll with your dog");
		this.energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.println("you hear crackling and see a lot of smoke nearby, what is happening in this neighborhood!? You begin to regret buying your house in this part of the state");
		this.energyLevel -= 100;
	}
}
