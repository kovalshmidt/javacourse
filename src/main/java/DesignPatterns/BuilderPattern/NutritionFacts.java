package DesignPatterns.BuilderPattern;

public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final double calories;
    private final double fat;
    private final double sodium;
    private final double carbohydrate;

    public NutritionFacts(Builder built) {
        this.servingSize = built.servingSize;
        this.servings = built.servings;
        this.calories = built.calories;
        this.fat = built.fat;
        this.sodium = built.sodium;
        this.carbohydrate = built.carbohydrate;
    }

    public static class Builder {

        //Required Parameters
        private final int servingSize;
        private final int servings;

        //Optionals
        private double calories = 0.0;
        private double fat = 0.0;
        private double sodium = 0.0;
        private double carbohydrate = 0.0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(double calories){
            this.calories = calories;
            return this;
        }

        public Builder fat(double fat){
            this.fat = fat;
            return this;
        }

        public Builder sodium(double sodium){
            this.sodium = sodium;
            return this;
        }

        public Builder carbohydrate(double carbohydrate){
            this.carbohydrate = carbohydrate;
            return this;
        }

        public NutritionFacts build(){

            return new NutritionFacts(this);
        }
    }
}
