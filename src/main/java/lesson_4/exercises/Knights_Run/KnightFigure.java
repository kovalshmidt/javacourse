package lesson_4.exercises.Knights_Run;


public class KnightFigure {
    private int yPosition;
    private int xPosition;

    public KnightFigure(int yPosition, int xPosition) {
        this.yPosition = yPosition;
        this.xPosition = xPosition;
    }

    public KnightFigure() {
        this.yPosition = 3;
        this.xPosition = 4;
    }

    public int get_yPosition() {
        return yPosition;
    }

    public int get_xPosition() {
        return xPosition;
    }

    public void set_yPosition(int factorY, int factorX) {
        if ((yPosition + factorY <= 7)&&(yPosition + factorY>=0)) {
            this.yPosition += factorY;
        }
        if ((xPosition + factorX <= 7)&&(xPosition + factorX>=0)) {
            this.xPosition += factorX;
        }
    }

    public void chessMove(int option) {
        switch (option) {
            case 0:
                set_yPosition(-1, 2);
                break;
            case 1:
                set_yPosition(-2, 1);
                break;
            case 2:
                set_yPosition(-2, -1);
                break;
            case 3:
                set_yPosition(-1, -2);
                break;
            case 4:
                set_yPosition(1, -2);
                break;
            case 5:
                set_yPosition(2, -1);
                break;
            case 6:
                set_yPosition(2, 1);
                break;
            case 7:
                set_yPosition(1, 2);
        }
    }

    public void reverseMove(int option) {
        switch (option) {
            case 0:
                set_yPosition(1, -2);
                break;
            case 1:
                set_yPosition(2, -1);
                break;
            case 2:
                set_yPosition(2, 1);
                break;
            case 3:
                set_yPosition(1, 2);
                break;
            case 4:
                set_yPosition(-1, 2);
                break;
            case 5:
                set_yPosition(-2, 1);
                break;
            case 6:
                set_yPosition(-2, -1);
                break;
            case 7:
                set_yPosition(-1, -2);
        }
    }

}
