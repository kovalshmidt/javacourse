package lesson_4.exercises.Shapes;

public class Cube extends ThreeDShape {

    public Cube() {
        super(0, 0, 0, 0, 0, 0);
    }

    public double getArea() {
        this.area = 2 * (this.xLength * this.yLength) + 2 * (this.xLength * this.zLength) + 2 * (this.yLength * this.zLength);
        return this.area;
    }

    public double getVolume() {
        this.volume = this.xLength * this.yLength * this.zLength;
        return this.volume;
    }

    public double getHeight() {
        this.height = this.yLength;
        return this.height;
    }
}
