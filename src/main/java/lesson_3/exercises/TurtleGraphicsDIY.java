package lesson_3.exercises;

import java.util.Scanner;

public class TurtleGraphicsDIY {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] canvas = new int[20][20];
        Turtle painter = new Turtle();
        int order, length = 0;
        for (int y = 0; y <= 19; y++) {
            for (int x = 0; x <= 19; x++) {
                canvas[y][x] = 0;
            }
        }
        System.out.println("Turtle graphics Painter:");
        System.out.println("1       Pen off");
        System.out.println("2       Pen on");
        System.out.println("3       Turn right");
        System.out.println("4       Turn left");
        System.out.println("5       Move pen");
        System.out.println("6       Print graphic");
        System.out.println();
        System.out.println();
        while (true) {
            order = input.nextInt();
            if (order == 5) {
                System.out.println("Please give a length");
                length = input.nextInt();
            }
            Turtle.executeOrder(canvas, painter, order, length);
            if ((order == 5)&&(painter.getPen())) {
                order = 6;
                Turtle.executeOrder(canvas, painter, order, length);
            }
        }
    }
}
