package lesson_9.exercises.homework;

/**
 *Write a program that shows a constructor passing information about constructor failure to an exception handler.
 *Define class SomeClass, which throws an Exception in the constructor. Your program should try to create an object of
 *type SomeClass and catch the exception that’s thrown from the constructor.
 */

public class ConstructorFailure {
    public Exception1()throws Exception
    {
        throw new Exception();
    }

    public static void main(String[] args) {
        try{

            Exception1 e = new Exception1();
        }catch(Exception exception)
        {
            System.out.println("Exception type: " + exception);
        }
    }
}
