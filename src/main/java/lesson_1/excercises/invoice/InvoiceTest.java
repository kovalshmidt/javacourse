package lesson_1.excercises.invoice;

import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Invoice item = new Invoice();

        System.out.println("Put in the item details:");
        System.out.println("Put in the item number:");
        item.setNumber(input.next());
        System.out.println("Put in the item description:");
        item.setDescription(input.next());
        System.out.println("Put in the item quantity:");
        item.setQuantity(input.nextInt());
        System.out.println("Put in the item price");
        item.setPrice(input.nextDouble());
        String itemNumber = item.getNumber();
        String itemDescription = item.getDescription();
        int itemQuantity = item.getQuantity();
        double itemPrice = item.getPrice();
        System.out.println("The item number is: " + itemNumber);
        System.out.println("The item description is: " + itemDescription);
        System.out.println("The item quantity is: " + itemQuantity);
        System.out.println("The item price is: " + itemPrice);
        double itemTotalPrice = item.getInvoiceAmount();
        System.out.println("The price of all the items is: " + itemTotalPrice);
    }
}
