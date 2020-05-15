package lesson_4.exercises.Shapes;

public class Tetrahedron extends ThreeDShape {
    public Tetrahedron() {
        super(0, 0, 0, 0, 0, 0);
    }

    public double getArea() {
        this.area = Math.pow(this.xLength, 2) * Math.sqrt(3);
        return this.area;
    }

    public double getVolume() {
        this.volume = Math.pow(this.xLength, 3) / 12 * Math.sqrt(2);
        return this.volume;
    }

    public double getHeight() {
        this.height = this.xLength / 3 * Math.sqrt(6);
        return this.height;
    }
}
