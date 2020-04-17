package lesson_2.exercises.CalculatingSales;

import java.util.Scanner;

public class MerchantCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Products[] product = new Products[5];
        product[0] = new Products("Product 1", 2.980, 0);
        product[1] = new Products("Product 2", 4.50, 0);
        product[2] = new Products("Product 3", 9.98, 0);
        product[3] = new Products("Product 4", 4.49, 0);
        product[4] = new Products("Product 5", 6.87, 0);
        int selection;
        int quantity;
        double totalPrice = 0;
        boolean end = true;

        do {
            System.out.println("Type in a product number:");
            selection = input.nextInt() - 1;
            System.out.println("Type in the product quantity:");
            quantity = input.nextInt();
            double priceTimesQuant;
            switch (selection) {
                case 0:
                    System.out.println("Product: " + product[0].getName());
                    System.out.println("Price per item: " + product[0].getPrice());
                    priceTimesQuant = product[0].calcTotalPrice(quantity);
                    System.out.println("The price of this order is: " + priceTimesQuant);
                    totalPrice += priceTimesQuant;
                    product[0].higherQuantity(quantity);
                    break;
                case 1:
                    System.out.println("Product: " + product[1].getName());
                    System.out.println("Price per item: " + product[1].getPrice());
                    priceTimesQuant = product[1].calcTotalPrice(quantity);
                    System.out.println("The price of this order is: " + priceTimesQuant);
                    totalPrice += priceTimesQuant;
                    product[1].higherQuantity(quantity);
                    break;
                case 2:
                    System.out.println("Product: " + product[2].getName());
                    System.out.println("Price per item: " + product[2].getPrice());
                    priceTimesQuant = product[2].calcTotalPrice(quantity);
                    System.out.println("The price of this order is: " + priceTimesQuant);
                    totalPrice += priceTimesQuant;
                    product[2].higherQuantity(quantity);
                    break;
                case 3:
                    System.out.println("Product: " + product[3].getName());
                    System.out.println("Price per item: " + product[3].getPrice());
                    priceTimesQuant = product[3].calcTotalPrice(quantity);
                    System.out.println("The price of this order is: " + priceTimesQuant);
                    totalPrice += priceTimesQuant;
                    product[3].higherQuantity(quantity);
                    break;
                case 4:
                    System.out.println("Product: " + product[4].getName());
                    System.out.println("Price per item: " + product[4].getPrice());
                    priceTimesQuant = product[4].calcTotalPrice(quantity);
                    System.out.println("The price of this order is: " + priceTimesQuant);
                    totalPrice += priceTimesQuant;
                    product[4].higherQuantity(quantity);
                    break;
            }
            System.out.println("Anything else? (yes/no)");
            String answer = input.next();
            switch (answer) {
                case "yes":
                    end = false;
                    break;
                case "no":
                    end = true;
                    break;
            }

        } while (!end);
        System.out.println("The total order is:");
        for (int i = 0; i <= 4; i++) {
            System.out.println(product[i].getName() + " X " + product[i].getProductsSold());
            System.out.println("for " + product[i].getPrice() * product[i].getProductsSold());
            System.out.println();
        }
        System.out.println("Total price: " + totalPrice);
    }
}
