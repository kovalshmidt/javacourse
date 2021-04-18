package DesignPatterns.VisitorPattern.Equipment;

import java.text.ParseException;

public interface RPGClass {
    double equip(Cuirass cuirass) throws ParseException;
    double equip(Boots boots) throws ParseException;
    double equip(Gauntlets gauntlets) throws ParseException;
}
