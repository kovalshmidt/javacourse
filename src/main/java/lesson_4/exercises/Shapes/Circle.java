package lesson_4.exercises.Shapes;

import com.sun.corba.se.impl.interceptors.PICurrent;

public class Circle extends TwoDShape {
    public Circle() {
        super(0, 0, 0, 0);
    }

    public double getArea() {
        this.area = Math.PI * Math.pow(this.xLength, 2);
        return this.area;
    }

    public double getHeight() {
        this.height = this.xLength * 2;
        return this.height;
    }
}
