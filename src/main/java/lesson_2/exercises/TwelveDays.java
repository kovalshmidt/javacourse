package lesson_2.exercises;

public class TwelveDays {
    public static void main(String[] args) {
        String dayString;

        System.out.println("Twelve Days of Christmas: \n \n");
        for (int day = 1; day <= 12; day++) {
            switch (day) {
                case 1:
                    dayString = " 1st ";
                    break;
                case 2:
                    dayString = " 2nd ";
                    break;
                case 3:
                    dayString = " 3rd ";
                    break;
                default:
                    dayString = " " + day + "th ";
                    break;
            }
            System.out.println("On the"+dayString+"day of Christmas my true love sent to me:\n");
            switch (day) {
                case 12:
                    System.out.println("Twelve Drummers Drumming");
                case 11:
                    System.out.println("Eleven Pipers Piping");
                case 10:
                    System.out.println("Ten Lords a Leaping");
                case 9:
                    System.out.println("Nine Ladies Dancing");
                case 8:
                    System.out.println("Eight Maids a Milking");
                case 7:
                    System.out.println("Sevens Swans a Swimming");
                case 6:
                    System.out.println("Six Geese a Laying");
                case 5:
                    System.out.println("Five Golden Rings");
                case 4:
                    System.out.println("Four Calling Birds");
                case 3:
                    System.out.println("Three French Hens");
                case 2:
                    System.out.println("Two Turtle Doves");
                    System.out.println("and a Partridge in a Pear Tree");
                    break;
                case 1:
                    System.out.println("A Partridge in a Pear Tree");
                    break;
            }
            System.out.println();
        }

    }
}

