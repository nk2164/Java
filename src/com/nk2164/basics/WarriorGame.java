package com.nk2164.basics;

public class WarriorGame {

	public static void main(String[] args) {
	Warrior thor = new Warrior("Thor", 800, 130, 40);
	Warrior loki = new DodgeWarrior("Loki", 800, 85, 40,0.25);
	
	try {
		Battle.startFight(thor, loki);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("Loki " + loki.teleport());
	loki.setTeleportAbility(new CantTeleport());
	System.out.println("Loki " + loki.teleport());
	}

}
