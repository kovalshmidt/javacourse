package DesignPatterns.StatePattern;

public class HasPIN implements ATMState{

    ATMMachine atmMachine;

    public HasPIN(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("You already entered a card");
    }

    @Override
    public void ejectCard() {
        System.out.println("Your card is ejected, have a nice day");
        atmMachine.setAtmState(atmMachine.getNoCardState());
    }

    @Override
    public void insertPin(int pin) {
        System.out.println("PIN already entered");
    }

    @Override
    public void requestCash(int cashWithdraw) {
        if (cashWithdraw>atmMachine.cashInMachine){
            System.out.println("You have not that much cash available!");
            System.out.println("Your card has been ejected");
            atmMachine.setAtmState(atmMachine.getNoCardState());
        }else {
            System.out.printf("Withdrawing %d from %d Euros in your account \n",cashWithdraw,atmMachine.cashInMachine);
            atmMachine.setCashInMachine(atmMachine.cashInMachine-cashWithdraw);

            System.out.println("Your card has been ejected.");
            atmMachine.setAtmState(atmMachine.getNoCardState());
            if (atmMachine.cashInMachine<=0){
                atmMachine.setAtmState(atmMachine.getOutOfCash());
            }
        }
    }
}
