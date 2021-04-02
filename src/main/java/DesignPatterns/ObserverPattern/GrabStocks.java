package DesignPatterns.ObserverPattern;

public class GrabStocks {
    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();
        StockObserver stockObserver1 = new StockObserver(stockGrabber);

        /*
        stockGrabber.setIbmPrice(100.97);
        stockGrabber.setApplePrice(400.33);
        stockGrabber.setGooglePrice(541.48);
        */
        /*
        StockObserver stockObserver2 = new StockObserver(stockGrabber);
        stockGrabber.setIbmPrice(4.55);
        stockGrabber.setApplePrice(51.88);
        stockGrabber.setGooglePrice(666.66);
        */
        StockObserver stockObserver2 = new StockObserver(stockGrabber);

        Runnable getIBM = new GetStocks("ibm",4.55,stockGrabber);
        Runnable getApple = new GetStocks("apple",500.3,stockGrabber);
        Runnable getGoogle = new GetStocks("google",1046.77,stockGrabber);

        new Thread(getIBM).start();
        new Thread(getApple).start();
        new Thread(getGoogle).start();

    }
}
