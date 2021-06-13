package DesignPatterns.ProxyPattern;

public class ATMTest {
    public static void main(String[] args) {
        ATMMachine newATM = new ATMMachine(2000);
        newATM.insertCard();
        newATM.ejectCard();
        newATM.insertCard();
        newATM.insertPin(1234);
        newATM.requestCash(2000);
        newATM.insertCard();
        newATM.insertPin(1234);

        GetATMData ATMData = new ATMMachine(1000);
        GetATMData ATMProxy = new ATMProxy();


    }
}
