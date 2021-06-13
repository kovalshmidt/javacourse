package DesignPatterns.StatePattern;

public class HasCard implements ATMState{

    ATMMachine atmMachine;

    public HasCard(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("You can only insert one card at once!");
    }

    @Override
    public void ejectCard() {
        System.out.println("Your card is ejected, have a nice day");
        atmMachine.setAtmState(atmMachine.getNoCardState());
    }

    @Override
    public void insertPin(int pin) {
        if (pin==1234){
            System.out.println("Correct Pin.");
            atmMachine.correctPinEntered=true;
            atmMachine.setAtmState(atmMachine.getHasCorrectPin());
        }
    }

    @Override
    public void requestCash(int cashWithdraw) {
        System.out.println("You have not entered your PIN yet!");

    }
}
