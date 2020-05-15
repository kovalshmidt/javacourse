package lesson_4.exercises.Shapes;


public class Rectangle extends TwoDShape {
    public Rectangle() {
        super(0, 0, 0, 0);
    }

    public double getArea() {
        this.area = xLength * yLength;
        return this.area;
    }
}
