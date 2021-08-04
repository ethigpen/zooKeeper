package com.thigpen.zooKeeper;

public class BatTest {
	public static void main(String[] args) {
		Bat fidget = new Bat(300);
		fidget.attackTown();
		fidget.attackTown();
		fidget.attackTown();
		fidget.eatHumans();
		fidget.eatHumans();
		fidget.fly();
		fidget.fly();
		fidget.displayEnergy();
	}
}
