package com.ug9.soal1;

/**
 * 71200538
 *  Satrio Aji Utomo
 */
public class App 
{
    public static void main( String[] args )
    {
        Lina lina = new Lina();
        DragonKnight drac = new  DragonKnight();
        LegionCommander leg = new LegionCommander();

        lina.skill(drac);
        drac.skill();
        drac.attack(lina);
        drac.attack(lina);
        leg.skill(lina);
        lina.skill(leg);
        lina.showCharacterInfo();
        drac.showCharacterInfo();
        leg.showCharacterInfo();
    }
}
