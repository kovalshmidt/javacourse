package DesignPatterns.VisitorPattern.Equipment;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Rouge implements RPGClass{
    NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.getDefault());

    public Rouge() {
    }

    @Override
    public double equip(Cuirass cuirass) throws ParseException {
        System.out.println("Armor value of cuirass:");
        return numberFormat.parse(String.format("%.1f",cuirass.getArmorValue()*0.90)).doubleValue();
    }

    @Override
    public double equip(Boots boots) throws ParseException {
        System.out.println("Armor value of boots:");
        return numberFormat.parse(String.format("%.1f",boots.getArmorValue()*1.50)).doubleValue();
    }

    @Override
    public double equip(Gauntlets gauntlets) throws ParseException {
        System.out.println("Armor value of gauntlets:");
        return numberFormat.parse(String.format("%.1f",gauntlets.getArmorValue()*0.50)).doubleValue();
    }
}
