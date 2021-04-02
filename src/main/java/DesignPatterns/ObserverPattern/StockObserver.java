package DesignPatterns.ObserverPattern;

public class StockObserver implements Observer {

    private double ibmPrice;
    private double applePrice;
    private double googlePrice;

    private static int observerIDTracker = 0;
    private int observerID;
    private Subject stackGrabber;

    public StockObserver(Subject stackGrabber) {
        this.stackGrabber = stackGrabber;
        this.observerID = ++observerIDTracker;
        System.out.println("New observer " + this.observerID);
        this.stackGrabber.register(this);
    }

    @Override
    public void update(double IBMPrice, double ApplePrice, double GooglePrice) {
        this.ibmPrice = IBMPrice;
        this.applePrice = ApplePrice;
        this.googlePrice = GooglePrice;
        this.printPrices();
    }

    public void printPrices() {
        System.out.println(
                "Observer: " + this.observerID +
                " | ibmPrice=" + ibmPrice +
                ", applePrice=" + applePrice +
                ", googlePrice=" + googlePrice);
    }
}
