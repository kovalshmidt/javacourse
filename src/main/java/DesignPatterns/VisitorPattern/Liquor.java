package DesignPatterns.VisitorPattern;

import java.text.ParseException;

public class Liquor implements Visitable{
    private double price;

    public Liquor(double price) {
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
        return "Liquor{" +
                "price=" + price +
                '}';
    }
}
