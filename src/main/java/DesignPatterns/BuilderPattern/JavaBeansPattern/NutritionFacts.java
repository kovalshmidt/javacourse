package DesignPatterns.BuilderPattern.JavaBeansPattern;

public class NutritionFacts {

    private int servingSize = 0;
    private int servings = 0;
    private double calories = 0.0;
    private double fat = 0.0;
    private double sodium = 0.0;
    private double carbohydrate = 0.0;

    public NutritionFacts() {
    }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public void setSodium(double sodium) {
        this.sodium = sodium;
    }

    public void setCarbohydrate(double carbohydrate) {
        this.carbohydrate = carbohydrate;
    }
}
