package DesignPatterns.VisitorPattern.Equipment;

import java.text.ParseException;

public class Gauntlets implements Equipment {

    private double armorValue;


    public Gauntlets(double armorValue) {
        this.armorValue = armorValue;
    }

    public double getArmorValue() {
        return armorValue;
    }

    @Override
    public double wears(RPGClass rpgClass)  {
        try{
            return rpgClass.equip(this);
        }catch (ParseException e){
            e.printStackTrace();
            return 0.0;
        }
    }

    @Override
    public String toString() {
        return "Gauntlets{" +
                "armorValue=" + armorValue +
                '}';
    }
}
