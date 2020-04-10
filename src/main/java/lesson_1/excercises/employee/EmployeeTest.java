package lesson_1.excercises.employee;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Employee emp1 = new Employee();
        Employee emp2 = new Employee("Joane", "Avery", 2055.54);

        System.out.println("Give the details of the new employees");
        System.out.println("First name of the first new employee:");
        emp1.setFirstName(input.next());
        System.out.println("Last name:");
        emp1.setLastName(input.next());
        System.out.println("Salary:");
        emp1.setSalary(input.nextDouble());

        System.out.println("First name of the second new employee:");
        emp2.setFirstName(input.next());
        System.out.println("Last name:");
        emp2.setLastName(input.next());
        System.out.println("Salary:");
        emp2.setSalary(input.nextDouble());

        System.out.println("The new employees are:");
        String emp1Name = emp1.getFirstName() + " " + emp1.getLastName();
        double emp1Salary = emp1.getSalary();
        System.out.println(emp1Name + " Salary: " + emp1Salary);
        System.out.println();
        String emp2Name = emp2.getFirstName() + " " + emp2.getLastName();
        double emp2Salary = emp2.getSalary();
        System.out.println(emp2Name + " Salary: " + emp2Salary);

        System.out.println("Give initial raise? yes/no");
        String answer = input.next();
        if (answer.equals("yes")) {
            System.out.println("Salary raised by 10%:");
            System.out.println();
            emp1Salary = emp1.getRaise();
            emp2Salary = emp2.getRaise();
            System.out.println(emp1Name + " Salary: " + emp1Salary);
            System.out.println();
            System.out.println(emp2Name + " Salary: " + emp2Salary);
        }
        else {
            System.out.println("No raise given");
        }
    }
}
