package DesignPatterns.ProxyPattern;

public class ATMProxy implements GetATMData{



    @Override
    public ATMState getATMState() {
        ATMMachine testATM = new ATMMachine(1000);
        return testATM.getATMState();
    }

    @Override
    public int getCashInATM() {
        ATMMachine testATM = new ATMMachine(1000);
        return testATM.getCashInATM();
    }
}
