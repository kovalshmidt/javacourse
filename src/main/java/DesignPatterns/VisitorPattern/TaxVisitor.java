package DesignPatterns.VisitorPattern;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class TaxVisitor implements Visitor {
    NumberFormat numberFormat = NumberFormat.getInstance(Locale.getDefault());

    public TaxVisitor() {
    }

    @Override
    public double visit(Liquor booze) throws ParseException {
        System.out.println("Liquor Item. Price with tax:");
        //return Double.parseDouble(decimalFormat.format(booze.getPrice() * 0.18 + booze.getPrice()));
        return numberFormat.parse(String.format("%,.2f", booze.getPrice() * 0.18 + booze.getPrice())).doubleValue();
    }

    @Override
    public double visit(Tobacco tabak) throws ParseException {
        System.out.println("Tobacco Item. Price with tax:");
        return numberFormat.parse(String.format("%,.2f", tabak.getPrice() * 0.32 + tabak.getPrice())).doubleValue();
    }

    @Override
    public double visit(Necessity bearnecessity) throws ParseException {
        System.out.println("Bare necessity Item. Price with tax:");
        return numberFormat.parse(String.format("%,.2f", bearnecessity.getPrice())).doubleValue();

    }
}
