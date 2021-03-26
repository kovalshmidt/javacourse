package DesignPatterns.DecoratorPattern;

public class PizzaMaker {
    public static void main(String[] args) {
        Pizza margarita = new TomatoSauce(new Mozzarella(new PlainPizza()));
        Pizza whitePizza = new Mozzarella(new PlainPizza());
        Pizza spicyPizza = new Wasabi(new TomatoSauce(new PlainPizza()));
        System.out.println(margarita.getDescription()+"  "+margarita.getCost());
        System.out.printf("%s  %f \n",whitePizza.getDescription(),whitePizza.getCost());
        System.out.printf("%s  %f \n",spicyPizza.getDescription(),spicyPizza.getCost());
    }
}
