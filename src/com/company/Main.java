package com.company;

public class Main {

    public static void main(String[] args) {
	Boss dragonBoss = new Boss();
	Weapon dragonBossWeapon = new Weapon();
	dragonBoss.weapon = dragonBossWeapon;
	dragonBossWeapon.setWeaponName("FIREGUN");
	dragonBossWeapon.setWeaponType("FIRE");
	dragonBoss.setDamage(125);
	dragonBoss.setHealth(1500);
dragonBoss.printBossStats();
    }


}
