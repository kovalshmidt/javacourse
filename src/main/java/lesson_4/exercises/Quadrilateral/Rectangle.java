package lesson_4.exercises.Quadrilateral;

public class Rectangle extends Parallelogram {
    public Rectangle() {
        this.pointAX = 0;
        this.pointAY = 0;
        this.pointBX = 0;
        this.pointBY = 0;
        this.pointCX = 0;
        this.pointCY = 0;
        this.pointDX = 0;
        this.pointDY = 0;
        this.vectorA = 0;
        this.vectorB = 0;
        this.vectorC = 0;
        this.vectorD = 0;
        this.area = 0;
    }

    public double getArea() {
        this.area = getVectorA() * getVectorD();
        return area;
    }
}
