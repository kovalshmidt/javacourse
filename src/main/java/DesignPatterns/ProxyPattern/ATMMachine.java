package DesignPatterns.ProxyPattern;


public class ATMMachine implements GetATMData{
    ATMState hasCard;
    ATMState noCard;
    ATMState hasCorrectPin;
    ATMState outOfCash;

    ATMState atmState;

    int cashInMachine;
    boolean correctPinEntered = false;

    public ATMMachine(int cash) {
        this.hasCard = new HasCard(this);
        this.noCard = new NoCard(this);
        this.hasCorrectPin = new HasPIN(this);
        this.outOfCash = new NoCash(this);
        this.atmState = noCard;
        this.cashInMachine = cash;
        if (cashInMachine < 0) {
            this.atmState = outOfCash;
        }
    }

    public void insertCard(){
        this.atmState.insertCard();
    }

    public void ejectCard(){
        this.atmState.ejectCard();
    }

    public void insertPin(int pin){
        this.atmState.insertPin(pin);
    }

    public void requestCash(int amount){
        this.atmState.requestCash(amount);
    }

    public ATMState getNoCardState() {
        return noCard;
    }

    public ATMState getHasCorrectPin() {
        return hasCorrectPin;
    }

    public void setAtmState(ATMState atmState) {
        this.atmState = atmState;
    }

    public void setCashInMachine(int cashInMachine) {
        this.cashInMachine = cashInMachine;
    }

    public ATMState getOutOfCash() {
        return outOfCash;
    }

    public ATMState getHasCard() {
        return hasCard;
    }


    @Override
    public ATMState getATMState() {
        return atmState;
    }

    @Override
    public int getCashInATM() {
        return cashInMachine;
    }
}
