package DesignPatterns.DecoratorPattern;

public class Mozzarella extends ToppingDecorator {

    public Mozzarella(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+", Mozzarella";
    }

    @Override
    public double getCost() {
        return super.getCost()+0.50;
    }
}
