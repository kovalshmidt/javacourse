package lesson_4.exercises.Quadrilateral;

public class Rectangle extends Parallelogram {
    public Rectangle() {

    }

    public double getArea() {
        this.area = getVectorA() * getVectorD();
        return area;
    }
}
