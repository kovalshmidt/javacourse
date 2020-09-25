package lesson_9.exercises.homework;

/**
 * Write a program showing that a method with its own
 * try block does not have to catch every possible error generated
 * within the try. Some exceptions can slip through to,
 * and be handled in, other scopes.
 */

public class CatchingExceptionsUsingOuterScopes {

    //This method trhows IndexOutOfBOundsException
    public static void innerScope() throws IndexOutOfBoundsException {
        throw new IndexOutOfBoundsException("Inner Scope");
    }

    //This method handles NullPointerException but can throw IndexOutOfBoundsException
    public static void outerScope() throws Exception {
        try {
            innerScope();
        } catch (NullPointerException e) {
            System.out.println("Inner Scope");
        }

    }

    //This Method handles any Exception
    public static void main(String[] args) {
        try {
            outerScope();
        } catch (Exception e) {
            System.out.println("Outer Scope");
        }
    }
}
