package lesson_4.exercises.Shapes;

public class Square extends TwoDShape {
    public Square() {
        super(0, 0, 0, 0);
    }

    public double getArea() {
        this.area = xLength * xLength;
        return this.area;
    }
}
