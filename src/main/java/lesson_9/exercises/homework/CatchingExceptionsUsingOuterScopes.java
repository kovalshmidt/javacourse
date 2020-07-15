package lesson_9.exercises.homework;

/**
 * Write a program showing that a method with its own
 * try block does not have to catch every possible error generated
 * within the try. Some exceptions can slip through to,
 * and be handled in, other scopes.
 */

public class CatchingExceptionsUsingOuterScopes {
    public static void innerScope () throws Exception{
        throw new Exception("Inner Scope");
    }
    public static void outerScope () throws Exception{
        throw new Exception("Inner Scope");
    }
    public static void main(String[] args) {
        try{
            outerScope();
            try{
                innerScope();
            }catch (Exception e){
                System.out.println("Inner Scope");
            }
        }catch (Exception e){
            System.out.println("Outer Scope");
        }

    }
}
