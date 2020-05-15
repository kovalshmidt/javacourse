package lesson_4.exercises.Shapes;

public class Sphere extends Circle implements ThreeDShape {

    @Override
    public double getSurfaceArea() {
        return 4 * Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(getRadius(), 3);
    }
}
