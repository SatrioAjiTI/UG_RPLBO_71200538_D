package com.ug9.soal1;

public class Lina extends MagicCharacter implements TargetSkill{
    public Lina(){
        super("Lina", 70 , 800,120);
    }

    public boolean skill(Character Char) {
        if (isDie() == false){
            Char.attacked(600);
            mana = mana -60;
        }
        return true;
    }

    public void attack(Character Char) {
        if (isDie() == false) {
            Char.attacked(70);
            if (Char.isDie() == true) {
                mana = mana + 45;
            }
        }
    }
}
