package DesignPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class StockGrabber implements Subject{

    private List<Observer> observers;
    private double applePrice;
    private double ibmPrice;
    private double googlePrice;

    public StockGrabber() {
      this.observers= new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unRegister(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer: observers) {
            observer.update(this.ibmPrice,this.applePrice,this.googlePrice);
        }
    }

    public void setApplePrice(double applePrice) {
        this.applePrice = applePrice;
        notifyObserver();
    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObserver();
    }

    public void setGooglePrice(double googlePrice) {
        this.googlePrice = googlePrice;
        notifyObserver();
    }
}
