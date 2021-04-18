package DesignPatterns.VisitorPattern;

public class VisitorTest {
    public static void main(String[] args) {
        TaxVisitor taxVisitor = new TaxVisitor();
        TaxHolidayVisitor taxHolidayVisitor = new TaxHolidayVisitor();
        Liquor beer = new Liquor(5.00);
        Tobacco gauloises = new Tobacco(7.50);
        Necessity bread = new Necessity(3.00);

        System.out.println(beer);
        System.out.println(gauloises);
        System.out.println(bread);

        System.out.println(beer.accept(taxVisitor));
        System.out.println(gauloises.accept(taxVisitor));
        System.out.println(bread.accept(taxVisitor));

        System.out.println(beer.accept(taxHolidayVisitor));
        System.out.println(gauloises.accept(taxHolidayVisitor));
        System.out.println(bread.accept(taxHolidayVisitor));

    }
}
