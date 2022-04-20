package com.ug9.soal1;

public class DragonKnight extends PhysicalCharacter implements NoTargetSkill{
    private int dragonFormAttack;
    public DragonKnight(){
        super("Dragon Knight",95, 1800,50);

    }

    public void skill() {
        dragonFormAttack = 2;
    }

    public void attack(Character Char) {
        if (dragonFormAttack > 0) {
            dragonFormAttack = dragonFormAttack - 1;
            Char.attacked(95+90);
        }
        else {
            Char.attacked(95);
        }
    }
}
