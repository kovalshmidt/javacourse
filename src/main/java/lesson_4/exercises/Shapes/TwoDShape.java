package lesson_4.exercises.Shapes;

import sun.security.util.Length;

public class TwoDShape extends Shape {

    public TwoDShape(double xLength, double yLength, double height, double area) {
        super(xLength, yLength, height, area);
    }

    public double getHeight() {
        this.height = this.yLength;
        return this.height;
    }

    public void setLengths(double x, double y) {
        this.xLength = x;
        this.yLength = y;
    }
}
