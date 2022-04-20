package com.ug9.soal1;

public abstract class PhysicalCharacter extends Character{
    private int armor;

    public PhysicalCharacter(String nama, int dmg, int hp, int armor) {
        super(nama, dmg, hp);
        this.armor = armor;
    }

    public void showCharacterInfo() {
        super.showCharacterInfo();
        System.out.println("Armor     : " + armor);
    }

    public void attacked(int atk) {
        int damg = atk - armor;
        super.attacked(damg);
    }
}
