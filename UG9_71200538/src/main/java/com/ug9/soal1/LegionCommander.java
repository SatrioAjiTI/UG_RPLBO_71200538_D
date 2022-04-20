package com.ug9.soal1;

public class LegionCommander extends PhysicalCharacter implements TargetSkill{
    public LegionCommander(){
        super("Legion Commander", 120, 1200, 30);
    }
    private int kill;

    public boolean skill(Character Char) {
        while (Char.isDie() == false) {
            attack(Char);
            if (Char.isDie()== true) {
                break;
            }
            else {
                attacked(Char.damage);
            }

        }
        kill = + 1;
        return false;
    }

    public void attack(Character Char) {
        if (kill > 0) {
            int mul = 10 * kill;
            int hit = 120 + mul;
            Char.attacked(hit);
        }
        else {
            Char.attacked(120);
        }
    }
}

