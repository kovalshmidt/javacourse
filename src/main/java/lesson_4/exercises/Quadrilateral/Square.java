package lesson_4.exercises.Quadrilateral;

public class Square extends Rectangle {
    public Square() {

    }

    public double getArea() {
        this.area = Math.pow(getVectorA(), 2);
        return area;
    }
}
