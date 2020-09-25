package lesson_9.exercises.homework;

public class RethrowExceptions {
    public static void SomeMethod() throws Exception {
        System.out.println("SomeMethod()");
        throw new Exception("thrown from SomeMethod()");
    }

    public static void SomeMethod2() throws Throwable {
        try {
            SomeMethod();
        } catch (Exception e) {
            System.out.println("SomeMethod2()");
            throw e;
        }
    }

    public static void main(String[] args) throws Throwable {
        try {
            SomeMethod2();
        } catch (Exception e) {
            System.out.println("Main");
        }
    }
}
