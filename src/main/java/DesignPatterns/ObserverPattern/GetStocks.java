package DesignPatterns.ObserverPattern;

import lombok.SneakyThrows;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class GetStocks implements Runnable {
    public final static NumberFormat numberFormat = NumberFormat.getInstance(Locale.getDefault());
    private String stock;
    private double price;
    private Subject stockGrabber;

    public GetStocks(String stock, double newPrice, Subject stockGrabber) {
        this.stock = stock;
        this.price = newPrice;
        this.stockGrabber = stockGrabber;
    }

    @SneakyThrows
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }
            double randomNumber = (Math.random() * .06) - .03;
            //price = Double.parseDouble(format.format((price + randomNumber)));
            price = numberFormat.parse(String.format("%,.2f", (price+randomNumber))).doubleValue();
            //ArrayList = array is a List = list
            // Downcasting (ArrayList) list = ArrayList

            if (stock.equals("ibm")) {
                ((StockGrabber) stockGrabber).setIbmPrice(price);
            }

            if (stock.equals("apple")) {
                ((StockGrabber) stockGrabber).setApplePrice(price);
            }

            if (stock.equals("google")) {
                ((StockGrabber) stockGrabber).setGooglePrice(price);
            }

            System.out.printf("Stock: %s Price: %f $ \n", this.stock, this.price);
        }
    }
}
