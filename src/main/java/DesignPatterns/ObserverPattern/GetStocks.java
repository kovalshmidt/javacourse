package DesignPatterns.ObserverPattern;

import java.text.DecimalFormat;

public class GetStocks implements Runnable {
    private String stock;
    private double price;
    private Subject stockGrabber;

    public GetStocks(String stock, double newPrice, Subject stockGrabber) {
        this.stock = stock;
        this.price = newPrice;
        this.stockGrabber = stockGrabber;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }
            double randomNumber = (Math.random() * .06) - .03;
            DecimalFormat format = new DecimalFormat("#,##");
            price = Double.parseDouble(format.format((price + randomNumber)));

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
