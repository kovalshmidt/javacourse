package DesignPatterns.VisitorPattern.Equipment;

import java.text.ParseException;

public class EquipmentTest {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Mage mage = new Mage();
        Rouge rouge = new Rouge();
        Cuirass ironCuirass = new Cuirass(50.0);
        Boots ironBoots = new Boots(20.0);
        Gauntlets ironGauntlets = new Gauntlets(30.0);

        System.out.println(ironBoots);
        System.out.println(ironCuirass);
        System.out.println(ironGauntlets);

        System.out.println();

        System.out.println("Warrior:");
        System.out.println(ironBoots.wears(warrior));
        System.out.println(ironCuirass.wears(warrior));
        System.out.println(ironGauntlets.wears(warrior));

        System.out.println();

        System.out.println("Mage:");
        System.out.println(ironBoots.wears(mage));
        System.out.println(ironCuirass.wears(mage));
        System.out.println(ironGauntlets.wears(mage));

        System.out.println();

        System.out.println("Rouge:");
        System.out.println(ironBoots.wears(rouge));
        System.out.println(ironCuirass.wears(rouge));
        System.out.println(ironGauntlets.wears(rouge));
    }
}
