package DesignPatterns.BuilderPattern;

import DesignPatterns.BuilderPattern.Homework.Mod;

public class Main {
    public static void main(String[] args) {

        //Telescopic Constructor
        DesignPatterns.BuilderPattern.TelescopicConstructorPattern.NutritionFacts cocaCola = new DesignPatterns.BuilderPattern.TelescopicConstructorPattern.NutritionFacts(200,1,100.0,0.0,0.0,100.0);

        //BeansPattern
        DesignPatterns.BuilderPattern.JavaBeansPattern.NutritionFacts pepsiCola = new DesignPatterns.BuilderPattern.JavaBeansPattern.NutritionFacts();
        pepsiCola.setServingSize(200);
        pepsiCola.setServings(1);
        pepsiCola.setCalories(100);
        pepsiCola.setCarbohydrate(100);

        //Builder Pattern
        NutritionFacts fritzCola = new NutritionFacts.Builder(200,1).calories(100.0).carbohydrate(100.0).build();

        //Custom Builder Pattern

        Mod customMod = new Mod.Builder("New Mod",223,1591).requiresSKSE(true).BSA_packed(false).containsEsp(true)
                .texturesAmount(120).meshesAmount(60).ScriptAmount(1).build();
        System.out.println(customMod);
    }
}
