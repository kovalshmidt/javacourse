package lesson_4.exercises.Shapes;

import com.sun.corba.se.impl.interceptors.PICurrent;
import lombok.Data;

@Data
public class Circle implements TwoDShape {
    private double radius;

    @Override
    public double perimeter() {
        return  Math.PI*radius*2;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }
}
