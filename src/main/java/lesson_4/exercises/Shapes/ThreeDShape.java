package lesson_4.exercises.Shapes;

public class ThreeDShape extends Shape {

    public ThreeDShape(double xLength, double yLength, double height, double area, double zLength, double volume) {
        super(xLength, yLength, height, area);
        this.zLength = zLength;
        this.volume = volume;
    }

    public double getVolume() {
        return this.volume;
    }

    public double getZLength() {
        return this.zLength;
    }

    public void setLengths(double x, double y, double z) {
        this.xLength = x;
        this.yLength = y;
        this.zLength = z;
    }
}
