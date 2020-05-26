package lesson_4.exercises.Quadrilateral;

public class Parallelogram extends Quadrilateral {
    public Parallelogram() {

    }

    public double getArea() {
        this.area = vectorA * height;
        return area;
    }
}
