package com.ug9.soal1;

public abstract class MagicCharacter extends Character{
    protected int mana;

    public MagicCharacter(String nama, int dmg, int hp, int mana) {
        super(nama, dmg, hp);
        this.mana = mana;
    }

    public void showCharacterInfo() {
        super.showCharacterInfo();
        System.out.println("Mana      : " + mana);
    }

    public void attacked(int atk) {
        super.attacked(atk);
    }
}
