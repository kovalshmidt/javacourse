package lesson_4.exercises.Shapes;

public class Tetrahedron extends Triangle implements ThreeDShape {


    @Override
    public double getSurfaceArea() {
        return Math.pow(getLengthX(), 2) * Math.sqrt(6);
    }

    //a³ / 12 * √2
    @Override
    public double getVolume() {
        return Math.pow(getLengthX(), 3) / 12 * Math.sqrt(2);
    }
}
