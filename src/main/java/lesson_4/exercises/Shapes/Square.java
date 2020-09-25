package lesson_4.exercises.Shapes;

import lombok.Data;

@Data
public class Square implements TwoDShape {

    private double lengthXY;

    @Override
    public double perimeter() {
        return 4 * lengthXY;
    }

    @Override
    public double getArea() {
        return Math.pow(lengthXY, 2);
    }
}
