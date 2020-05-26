package lesson_4.exercises.Shapes;

public class Cube extends Square implements ThreeDShape {

    @Override
    public double getSurfaceArea() {
        return 6 * getArea();
    }

    @Override
    public double getVolume() {
        return getArea() * getLengthXY();
    }

}
