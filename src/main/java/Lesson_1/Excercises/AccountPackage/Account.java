package Lesson_1.Excercises.AccountPackage;

public class Account {
    public String name;
    public double balance;

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

    public double deposit(double input) {
        return this.balance + input;
    }

    public double withdraw(double input) {
        if (balance >= input)
            return this.balance - input;
        else {
            System.out.println("You can't take more than you have!");
            return this.balance;
        }
    }
}
