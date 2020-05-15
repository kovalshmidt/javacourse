package lesson_4.exercises.Shapes;

public class Shape {
    protected double xLength;
    protected double yLength;
    protected double zLength;
    protected double originX, originY, originZ;
    protected double height;
    protected double area;
    protected double volume;

    public Shape(double xLength, double yLength, double height, double area) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.height = height;
        this.area = area;
    }


    public double getXLength() {
        return xLength;
    }

    public double getYLength() {
        return yLength;
    }

    public double getZLength() {
        return zLength;
    }

    public double getOriginX() {
        return originX;
    }

    public double getOriginY() {
        return originY;
    }

    public double getOriginZ() {
        return originZ;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return area;
    }

    public double getVolume() {
        return volume;
    }
}
