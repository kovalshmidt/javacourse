package DesignPatterns.VisitorPattern;

import java.text.ParseException;

public class Tobacco implements Visitable{
    private double price;

    public Tobacco(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double accept(Visitor visitor) {
        try {
            return visitor.visit(this);
        } catch (ParseException e) {
            e.printStackTrace();
            return 0.0;
        }
    }

    @Override
    public String toString() {
        return "Tobacco{" +
                "price=" + price +
                '}';
    }
}
