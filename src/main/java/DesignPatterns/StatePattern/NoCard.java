package DesignPatterns.StatePattern;

public class NoCard implements ATMState {

    ATMMachine atmMachine;

    public NoCard(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        atmMachine.setAtmState(atmMachine.getHasCard());
        System.out.println("Please enter your Pin");
    }

    @Override
    public void ejectCard() {
        System.out.println("No card there to be ejected!");
    }

    @Override
    public void insertPin(int pin) {
        System.out.println("Please enter a valid card first");
    }

    @Override
    public void requestCash(int cashWithdraw) {
        System.out.println("Please enter a valid card first");

    }
}
