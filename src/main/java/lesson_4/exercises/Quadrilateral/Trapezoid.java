package lesson_4.exercises.Quadrilateral;

import lombok.Getter;

@Getter
public class Trapezoid extends Quadrilateral {

    public Trapezoid() {

    }

    public double getArea() {

        this.area = ((vectorA + vectorC) / 2) * (pointDY - pointAY);
        return area;
    }
}
