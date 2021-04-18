package DesignPatterns.VisitorPattern.Equipment;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Warrior implements RPGClass{
    NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.getDefault());

    public Warrior() {
    }

    @Override
    public double equip(Cuirass cuirass) throws ParseException {
        System.out.println("Armor value of cuirass:");
        return numberFormat.parse(String.format("%.1f",cuirass.getArmorValue()*1.25)).doubleValue();
    }

    @Override
    public double equip(Boots boots) throws ParseException {
        System.out.println("Armor value of boots:");
        return numberFormat.parse(String.format("%.1f",boots.getArmorValue()*1.15)).doubleValue();
    }

    @Override
    public double equip(Gauntlets gauntlets) throws ParseException {
        System.out.println("Armor value of gauntlets:");
        return numberFormat.parse(String.format("%.1f",gauntlets.getArmorValue()*1.30)).doubleValue();
    }
}
