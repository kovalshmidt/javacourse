package Lesson_1.Excercises.AccountPackage;

public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public Account() {
        this.name = "John Doe";
        this.balance = 0.0;
    }

    public String getName() {
        return this.name;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double input) {
        this.balance = balance + input;
    }

    public void withdraw(double input) {
        if (balance >= input) {
            this.balance = balance - input;
        } else {
            System.out.println("You can't take more than you have!");
        }
    }
}
