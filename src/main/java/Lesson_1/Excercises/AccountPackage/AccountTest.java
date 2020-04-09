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
        int counter = 1;
        boolean gotEm = false;
        String answer = "n";
        int owner = 0;

        System.out.println("Select your account:");
        while (counter < 5) {
            System.out.println(acc[counter].name);
            ++counter;
        }
        counter = 0;
        String nameCheck1 = input.next();
        while (counter < 5) {
            if (acc[counter].name.equals(nameCheck1)) {
                 owner = counter;}
                System.out.println("test");
            ++counter;
        }
        //Main Transaction Loop (Stops when "y(es)" is typed in)
        while (answer.equals("n")) {
            System.out.println("Welcome " + acc[owner].name);
            System.out.println("Current balance: " + acc[owner].balance);
            counter = 1;
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
            answer = "y";
        }

    }
}
