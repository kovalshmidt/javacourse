package lesson_9.exercises.homework;

import lesson_9.exercises.exceptions.ExceptionA;
import lesson_9.exercises.exceptions.ExceptionB;

import java.io.IOException;
import java.util.Scanner;

public class OrderOfCatchBlocks {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int number = 0;

        try {
            number = Integer.parseInt(input.next());
            if (number > 5 && number <= 10)
                throwsExceptionB();
            if (number > 10)
                throwsExceptionA();
        } catch (NullPointerException nullPointerException) {
            System.out.println("please type in something!");
            //SuperClass ExceptionA before ExceptionB
        } catch (ExceptionA exA) {
            System.out.println("Number is higher than 10");
            //ExceptionB already caught by ExceptionA
            //} catch (ExceptionB exB) {
            //    System.out.println("Number is higher than 5");
        } catch (IOException ioException) {
            ioException.getLocalizedMessage();
        } finally {
            System.out.println("Number is " + number);
        }
    }

    public static void throwsExceptionA() throws Exception {
        throw new ExceptionA();
    }

    public static void throwsExceptionB() throws Exception {
        throw new ExceptionB();
    }

}
