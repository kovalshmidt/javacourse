package lesson_4.exercises.Shapes;

public class Triangle extends TwoDShape {
    public Triangle() {
        super(0, 0, 0, 0);
    }

    public double getHeight() {
        this.height = Math.sqrt(Math.pow(this.yLength, 2) - Math.pow(this.xLength / 2, 2));
        return this.height;
    }

    public double getArea() {
        this.area = (getHeight() * this.xLength) / 2;
        return this.area;
    }
}
