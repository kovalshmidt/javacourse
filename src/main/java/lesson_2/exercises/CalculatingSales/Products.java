package lesson_2.exercises.CalculatingSales;

public class Products {
    private String name;
    private double price;
    private double totalPrice;
    private int productsSold;

    public Products(String name, double price, int productsSold) {
        this.name = name;
        this.price = price;
        this.productsSold = productsSold;
    }

    public Products() {
        this.name = "Test";
        this.price = 3.50;
        this.productsSold = 0;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public void higherQuantity(int quantity) {
        productsSold += quantity;
    }

    public int getProductsSold() {
        return this.productsSold;
    }

    public double calcTotalPrice(int quantity) {
        return this.totalPrice = price * quantity;
    }
}
