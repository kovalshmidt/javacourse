package Lesson_1.Excercises.AccountPackage;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account[] acc = new Account[6];
        acc[0] = new Account();
        acc[1] = new Account("Franklin Bacon", 3567.45);
        acc[2] = new Account("Lana Yang", 5789.47);
        acc[3] = new Account("Richard Rich", 8907548.44);
        acc[4] = new Account("Old Man McZee", 675.98);
        int counter;
        String answer = "y";
        int owner = 0;
        int target =0;

        System.out.println("Select your account:");
        for (counter =1; counter < 5;++counter){
            System.out.println(acc[counter].name);
        }


        //This part is still not working
        String nameCheck1 = input.next();
        for (counter =0; counter < 5;++counter) {
            String accName = acc[counter].getName();
            System.out.println(acc[counter].name);
            if (accName.equals(nameCheck1)) {
                System.out.println("Registered Account");
                 owner = counter;}
        }


        //Main Transaction Loop (Stops when "y(es)" is typed in)
        System.out.println("Welcome " + acc[owner].name);
        System.out.println("Current balance: " + acc[owner].balance);
        while (answer.equals("y")) {
            System.out.println("Would you like to:");
            System.out.println("[Deposit] money");
            System.out.println("[Withdraw] money");
            System.out.println("[Transfer] money");
           String nameCheck2 = input.next();
            if (nameCheck2.equals("Deposit")) {
                System.out.println("Choose the amount you want to deposit:");
                acc[owner].deposit(input.nextDouble());
                System.out.println("New Balance: "+ acc[owner].balance);
            }
            if (nameCheck2.equals("Withdraw")) {
                System.out.println("Choose the amount you want to withdraw:");
                acc[owner].withdraw(input.nextDouble());
                System.out.println("New Balance: " + acc[owner].balance);
            }
            if (nameCheck2.equals("Transfer")) {
                System.out.println("Choose the target account:");
                String targetCheck = input.next();
                for (counter =0; counter < 5;++counter) {
                    String accName = acc[counter].getName();
                    if (accName.equals(targetCheck)) {
                        System.out.println("If-Test");
                        target = counter;
                    }
                    System.out.println("test");
                }
                System.out.println("Choose the amount you want to transfer:");
                double amount = input.nextDouble();
                acc[owner].withdraw(amount);
                acc[target].deposit(amount);
                System.out.println("New Balance: " + acc[owner].balance);
                System.out.println("New Balance of " + acc[target] +" is " + acc[target].balance);
            }
            System.out.println("anything else? [y/n]");
            answer = input.next();
        }

    }
}
