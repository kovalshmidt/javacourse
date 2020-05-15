package lesson_4.exercises.Shapes;

import lombok.Data;

@Data
public class Rectangle implements TwoDShape {

    private double lengthX, lengthY;

    @Override
    public double perimeter() {
        return 2 * lengthX + 2 * lengthY;
    }

    @Override
    public double getArea() {
        return lengthX * lengthY;
    }
}
