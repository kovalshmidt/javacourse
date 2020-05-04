package lesson_3.exercises;

public class Turtle {
    private boolean pen;
    private int direction;
    private int y, x;

    public Turtle(boolean pen, int direction, int y, int x) {
        this.pen = pen;
        this.direction = direction;
        this.y = y;
        this.x = x;

    }

    public Turtle() {
        this.pen = false;
        this.direction = 1;
        this.y = 0;
        this.x = 0;
    }

    public int getY() {
        return this.y;
    }

    public int getX() {
        return this.x;
    }

    public void addY() {
        this.y++;
        if (this.y > 19) {
            this.y = 19;
        }
    }

    public void addX() {
        this.x++;
        if (this.x > 19) {
            this.x = 19;
        }
    }

    public void subtractY() {
        this.y--;
        if (this.y < 0) {
            this.y = 0;
        }
    }

    public void subtractX() {
        this.x--;
        if (this.x < 0) {
            this.x = 0;
        }
    }

    public boolean getPen() {
        return this.pen;
    }

    public int getDirection() {
        return this.direction;
    }

    public void switchPen() {
        this.pen = !pen;
    }

    //1 = right, 2 = down, 3 = left, 4 = up
    public void turnRight() {
        switch (direction) {
            case 1:
                this.direction = 2;
                break;
            case 2:
                this.direction = 3;
                break;
            case 3:
                this.direction = 4;
                break;
            case 4:
                this.direction = 1;
        }
    }

    public void turnLeft() {
        switch (direction) {
            case 1:
                this.direction = 4;
                break;
            case 2:
                this.direction = 1;
                break;
            case 3:
                this.direction = 2;
                break;
            case 4:
                this.direction = 3;
        }

    }
    //Main block

    public static void executeOrder(int[][] canvas, Turtle painter, int order, int length) {
        switch (order) {
            case 1:
            case 2:
                painter.switchPen();
                break;
            case 3:
                painter.turnRight();
                System.out.println("Turn right");
                break;
            case 4:
                painter.turnLeft();
                System.out.println("Turn left");
                break;
            case 5:
                for (int l = 0; l <= length; l++) {
                    if (painter.getPen()) {
                        canvas[painter.getY()][painter.getX()] = 1;
                    }
                    switch (painter.getDirection()) {
                        case 1:
                            painter.addX();
                            break;
                        case 2:
                            painter.addY();
                            break;
                        case 3:
                            painter.subtractX();
                            break;
                        case 4:
                            painter.subtractY();
                            break;
                    }
                }
                break;
            case 6:
                for (int y = 0; y <= 19; y++) {
                    for (int x = 0; x <= 19; x++) {
                        if (canvas[x][y] == 1) {
                            System.out.print("*  ");
                        } else {
                            System.out.print("   ");
                        }
                        if (x == 19) {
                            System.out.println();
                        }
                    }
                }
                break;
            case 9:
                System.exit(0);
                break;
        }
    }


}
