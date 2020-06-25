package com.company;

public class Boss extends GameEntity {
    Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public void printBossStats(){
        System.out.println("Boss damage" + " " + "=" +" " +getDamage());
        System.out.println("Boss health" + " " + "=" +" " +getHealth());
        System.out.println("Boss weapon's name" + " " + "is" +" " +weapon.getWeaponName());
        System.out.println("Boss weapon's type" + " " + "is" +" " +weapon.getWeaponType());
    }
}
