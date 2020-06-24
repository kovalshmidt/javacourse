package lesson_9.exercises.exceptions;

/**
 * Use inheritance to create an exception superclass (called ExceptionA) and exception subclasses ExceptionB and ExceptionC,
 * where ExceptionB inherits from ExceptionA and ExceptionC inherits from ExceptionB. Write a program to demonstrate that
 * the catch block for type ExceptionA catches exceptions of types ExceptionB and ExceptionC.
 */

public class ExceptionsTest {
    public static void main(String[] args) throws Exception {


        try {
            throwNullPointerException();
            throwsException();


//        } catch (ExceptionC exceptionC) {
//            System.out.println("Exception C caught");
//        } catch (ExceptionB exceptionB) {
//            System.out.println("Exception B caught");
//        } catch (ExceptionA | NullPointerException ex) {
//           System.out.println("Exception A caught");
        } catch (NullPointerException nullPoints) {
            System.out.println(nullPoints.getLocalizedMessage());
            nullPoints.getLocalizedMessage();
//        }catch(Exception exception){
//            System.out.println("General Exception");
        }finally {
            System.out.println("This is finally");
        }
    }


    public static void throwsException() throws Exception {
        throw new ExceptionB();
    }

    public static void throwNullPointerException() throws Exception {
        throw new NullPointerException("a null pointer exception has occurred because we wanted so");
    }

}
