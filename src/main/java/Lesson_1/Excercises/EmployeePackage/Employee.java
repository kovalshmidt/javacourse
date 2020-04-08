package Lesson_1.Excercises.EmployeePackage;

public class Employee {
    public String firstName;
    public String lastName;
    public double salary;

    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public Employee() {
        this.firstName = "Maximillian";
        this.lastName = "Mustermann";
        this.salary = 2050.49;
    }

    public void setFirstName(String input) {
        this.firstName = input;
    }

    public void setLastName(String input) {
        this.lastName = input;
    }

    public void setSalary(double input) {
        this.salary = input;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public double getSalary() {
        return this.salary;
    }

    public double getRaise() {
        return this.salary * 1.1;
    }
}
