package lesson_4.exercises.Shapes;

import lombok.Data;

@Data
public class Triangle implements TwoDShape {

    private double lengthX, lengthY, lengthZ;
    private double height;

    @Override
    public double perimeter() {
        return lengthX + lengthY + lengthZ;
    }

    @Override
    public double getArea() {
        return (height * lengthX) / 2;
    }
}
