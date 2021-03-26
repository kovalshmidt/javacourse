package DesignPatterns.DecoratorPattern;

public class Wasabi extends ToppingDecorator {

    public Wasabi(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Wasabi(Spicy!)";
    }

    @Override
    public double getCost() {
        return super.getCost() + 4.00;
    }
}
