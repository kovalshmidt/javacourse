package lesson_1.excercises.invoice;

public class Invoice {

    public String number;
    public String description;
    public int quantity;
    public double price;
    public double invoiceAmount;


    public Invoice(String number, String description, int quantity, double price) {
        this.number = number;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public Invoice() {
        this.number = "000000000";
        this.description = "Standard Item";
        this.quantity = 0;
        this.price = 0.00;

    }

    public void setNumber(String input) {
        this.number = input;
    }

    public void setDescription(String input) {
        this.description = input;
    }

    public void setQuantity(int input) {
        this.quantity = input;
        if (input < 0) quantity = 0;
    }
    
    public void setPrice(double input) {
        this.price = input;
        if (input < 0) price = 0;
    }

    public String getNumber() {
        return this.number;
    }

    public String getDescription() {
        return this.description;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public double getInvoiceAmount() {
        return invoiceAmount = price * quantity;
    }
}
