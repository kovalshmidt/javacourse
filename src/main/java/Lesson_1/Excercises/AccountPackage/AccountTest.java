package Lesson_1.Excercises.AccountPackage;

import java.util.Scanner;

public class AccountTest {

    private static String answer = "y";
    private static int counter;


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account[] acc = new Account[6];
        acc[0] = new Account();
        acc[1] = new Account("Franklin Bacon", 3567.45);
        acc[2] = new Account("Lana Yang", 5789.47);
        acc[3] = new Account("Richard Rich", 8907548.44);
        acc[4] = new Account("Old Man McZee", 675.98);
        int owner = 0;

        do {
            System.out.println("Select your account:");
            for (counter = 1; counter < 5; counter++) {
                System.out.println("[" + counter + "] " + acc[counter].getName());
            }


            //Check if its an assigned number
            owner = input.nextInt();

            if (owner > 4 || owner < 1) {
                System.out.println("Unregistered Account");
                continue;
                //owner = 0;
            }

            //Main Transaction Loop (Stops when "y(es)" is typed in)
            System.out.println("Welcome " + acc[owner].getName());
            System.out.println("Current balance: " + acc[owner].getBalance());

            System.out.println("Would you like to:");
            System.out.println("[Deposit] money");
            System.out.println("[Withdraw] money");
            System.out.println("[Transfer] money");
            String nameCheck2 = input.next();
            //Deposit
            deposit(input, acc, owner, nameCheck2);
            //Withdraw
            withdraw(input, acc, owner, nameCheck2);
            //Transfer
            transfer(input, acc, owner, nameCheck2);
            //End
            System.out.println("Anything else? [y/n]");
            answer = input.next();
        } while (answer.equals("y"));

    }

    private static void withdraw(Scanner input, Account[] acc, int owner, String nameCheck2) {
        if (nameCheck2.equals("Withdraw")) {
            System.out.println("Choose the amount you want to withdraw:");
            acc[owner].withdraw(input.nextDouble());
            System.out.println("New Balance: " + acc[owner].getBalance());

        }
    }

    private static void deposit(Scanner input, Account[] acc, int owner, String nameCheck2) {
        if (nameCheck2.equals("Deposit")) {
            System.out.println("Choose the amount you want to deposit:");
            acc[owner].deposit(input.nextDouble());
            System.out.println("New Balance: " + acc[owner].getBalance());

        }
    }

    private static void transfer(Scanner input, Account[] acc, int owner, String nameCheck2) {
        int target;
        if (nameCheck2.equals("Transfer")) {
            System.out.println("Choose the target account:");
            target = input.nextInt();
            System.out.println("Choose the amount you want to transfer:");
            double amount = input.nextDouble();
            if (acc[owner].getBalance() >= amount) {
                acc[owner].withdraw(amount);
                acc[target].deposit(amount);
            } else {
                System.out.println("You can't take more than you have!");
            }
            System.out.println("New Balance: " + acc[owner].getBalance());
            System.out.println("New Balance of " + acc[target].getName() + " is " + acc[target].getBalance());
        }
    }
}
