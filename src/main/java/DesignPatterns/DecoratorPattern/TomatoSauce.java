package DesignPatterns.DecoratorPattern;

public class TomatoSauce extends ToppingDecorator {
    public TomatoSauce(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Tomato sauce";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.33;
    }
}
