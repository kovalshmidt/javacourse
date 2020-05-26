package lesson_4.exercises.Quadrilateral;

public class QuadMain {
    public static void main(String[] args) {
        Quadrilateral test = new Quadrilateral();
        Trapezoid trapezoid = makeTrapezoid();
        System.out.println("Trapezoid");
        printSize(trapezoid.getVectorA(), trapezoid.getVectorB(), trapezoid.getVectorC(), trapezoid.getVectorD(), trapezoid.getHeight(), trapezoid.getArea());

        Parallelogram parallelogram = makeParallelogram();
        System.out.println("Parallelogram");
        printSize(parallelogram.getVectorA(), parallelogram.getVectorB(), parallelogram.getVectorC(), parallelogram.getVectorD(), parallelogram.getHeight(), parallelogram.getArea());

        Rectangle rectangle = makeRectangle();
        System.out.println("Rectangle");
        printSize(rectangle.getVectorA(),rectangle.getVectorB(),rectangle.getVectorC(),rectangle.getVectorD(),rectangle.getHeight(),rectangle.getArea());

        Square square = makeSquare();
        System.out.println("Square");
        printSize(square.getVectorA(),square.getVectorB(),square.getVectorC(),square.getVectorD(),square.getHeight(),square.getArea());
    }



    private static void printSize(double vectorA, double vectorB, double vectorC, double vectorD, double height, double area) {
        System.out.println("Length a: " + vectorA);
        System.out.println("Length b: " + vectorB);
        System.out.println("Length c: " + vectorC);
        System.out.println("Length d: " + vectorD);
        System.out.println("Height: " + height);
        System.out.println("Area: " + area);
        System.out.println();
    }

    private static Square makeSquare(){
        Square square = new Square();
        square.setPointA(3, 5);
        square.setPointB(8, 5);
        square.setPointC(8, 10);
        square.setPointD(3, 10);
        square.setAllVectors();
        return square;
    }

    private static Rectangle makeRectangle(){
        Rectangle rectangle = new Rectangle();
        rectangle.setPointA(0, 3);
        rectangle.setPointB(8, 3);
        rectangle.setPointC(8, 9);
        rectangle.setPointD(0, 9);
        rectangle.setAllVectors();
        return rectangle;
    }

    private static Parallelogram makeParallelogram() {
        Parallelogram parallelogram = new Parallelogram();
        parallelogram.setPointA(2, 3);
        parallelogram.setPointB(8, 3);
        parallelogram.setPointC(10, 9);
        parallelogram.setPointD(4, 9);
        parallelogram.setAllVectors();
        return parallelogram;
    }

    private static Trapezoid makeTrapezoid() {
        Trapezoid trapezoid = new Trapezoid();
        trapezoid.setPointA(3, 4);
        trapezoid.setPointB(6, 4);
        trapezoid.setPointC(5, 8);
        trapezoid.setPointD(4, 8);
        trapezoid.setAllVectors();
        return trapezoid;
    }
}
