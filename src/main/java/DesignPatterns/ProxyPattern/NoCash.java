package DesignPatterns.ProxyPattern;


public class NoCash implements ATMState {

    ATMMachine atmMachine;

    public NoCash(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("We are out of money. Your card has been ejected");
    }

    @Override
    public void ejectCard() {
        System.out.println("We dont have any money. And no card");
    }

    @Override
    public void insertPin(int pin) {
        System.out.println("We dont have any cash");
    }

    @Override
    public void requestCash(int cashWithdraw) {
        System.out.println("We are out of money.");
    }
}

