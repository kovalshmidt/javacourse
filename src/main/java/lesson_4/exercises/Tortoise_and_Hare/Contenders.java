package lesson_4.exercises.Tortoise_and_Hare;

/**
 * Tortoise
 * Fast Plod    50%     3 squares right
 * Slip         20%     6 squares left
 * Slow Plod    30%     1 square right
 * <p>
 * Hare
 * Sleep        20%     none
 * Big Hop      20%     9 squares right
 * Big Slip     10%     12 squares left
 * Small Hop    30%     1 right
 * Small Slip   20%     2 left
 */

import java.util.Random;

public class Contenders {
    private int tortoisePosition;
    private int harePosition;
    private int tortoiseLine;
    private int hareLine;

    public Contenders(int tortoisePosition, int harePosition, int tortoiseLine, int hareline) {
        this.tortoisePosition = tortoisePosition;
        this.harePosition = harePosition;
        this.tortoiseLine = tortoiseLine;
        this.hareLine = hareline;
    }

    public Contenders() {
        this.tortoisePosition = 1;
        this.harePosition = 1;
    }

    public void moveTortoise() {
        int RNGT = new Random().nextInt(10) + 1;
        if (RNGT <= 5) {
            this.tortoisePosition += 3;
        } else {
            if (RNGT >= 8) {
                this.tortoisePosition++;
            } else {
                if (tortoisePosition > 5) {
                    this.tortoisePosition -= 6;
                } else {
                    this.tortoisePosition = 0;
                }
            }
        }
    }

    public void moveHare() {
        int RNGH = new Random().nextInt(10) + 1;

        switch (RNGH) {
            case 3:
            case 4:
                this.harePosition += 9;
                break;
            case 5:
                if (harePosition > 11) {
                    this.harePosition -= 12;
                    break;
                } else {
                    this.harePosition = 0;
                    break;
                }
            case 6:
            case 7:
            case 8:
                this.harePosition++;
                break;
            case 9:
            case 10:
                if (harePosition > 1) {
                    this.harePosition -= 2;
                    break;
                } else {
                    this.harePosition = 0;
                    break;
                }
            default:
        }
    }

    public int getTortoisePosition() {
        return tortoisePosition;
    }

    public int getHarePosition() {
        return harePosition;
    }

}
