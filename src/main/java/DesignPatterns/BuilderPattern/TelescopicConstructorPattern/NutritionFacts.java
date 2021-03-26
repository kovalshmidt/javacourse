package DesignPatterns.BuilderPattern.TelescopicConstructorPattern;

public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final double calories;
    private final double fat;
    private final double sodium;
    private final double carbohydrate;

    public NutritionFacts(int size, int number) {
        this(size, number, 0.0);
    }

    public NutritionFacts(int size, int number, double calories) {
        this(size, number, calories, 0.0);
    }

    public NutritionFacts(int size, int number, double calories, double fat) {
        this(size, number, calories, fat, 0.0);
    }

    public NutritionFacts(int size, int number, double calories, double fat, double sodium) {
        this(size, number, calories, fat, sodium,0.0);
    }

    public NutritionFacts(int size, int number, double calories, double fat, double sodium, double carbohydrate) {
        this.servingSize = size;
        this.servings = number;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }
}
