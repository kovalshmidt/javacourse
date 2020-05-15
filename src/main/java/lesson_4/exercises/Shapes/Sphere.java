package lesson_4.exercises.Shapes;

public class Sphere extends ThreeDShape {
    public Sphere() {
        super(0, 0, 0, 0, 0, 0);
    }

    public double getArea() {
        this.area = 4 * Math.PI * Math.pow(this.xLength, 2);
        return this.area;
    }

    public double getVolume() {
        this.volume = (4 / 3) * Math.PI * Math.pow(this.xLength, 3);
        return this.area;
    }

    public double getHeight() {
        this.height = this.xLength * 2;
        return this.height;
    }
}
