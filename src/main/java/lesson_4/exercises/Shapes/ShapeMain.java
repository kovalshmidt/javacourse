package lesson_4.exercises.Shapes;

import java.util.Scanner;

public class ShapeMain {
    public static void main(String[] args) {
        String answer;
        double xLength, yLength, zLength;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Type in what shape you want (Type in a shape or stop if you wish to do so):");
            answer = input.next();
            switch (answer) {
                case "Square":
                    Square squareMain = new Square();
                    System.out.println("Set width:");
                    xLength = input.nextDouble();
                    squareMain.setLengthXY(xLength);
                    System.out.println("Area: " + squareMain.getArea());
                    System.out.println("Perimeter: " + squareMain.perimeter());
                    break;
                case "Circle":
                    Circle circleMain = new Circle();
                    System.out.println("Set radius:");
                    xLength = input.nextDouble();
                    circleMain.setRadius(xLength);
                    System.out.println("Area: " + circleMain.getArea());
                    System.out.println("Perimeter: " + circleMain.perimeter());
                    break;
                case "Rectangle":
                    Rectangle rectangleMain = new Rectangle();
                    System.out.println("Set width:");
                    xLength = input.nextDouble();
                    System.out.println("Set height:");
                    yLength = input.nextDouble();
                    rectangleMain.setLengthX(xLength);
                    rectangleMain.setLengthY(yLength);
                    System.out.println("Area: " + rectangleMain.getArea());
                    System.out.println("Perimeter: " + rectangleMain.perimeter());
                    break;
                case "Triangle":
                    Triangle triangleMain = new Triangle();
                    System.out.println("Set width:");
                    xLength = input.nextDouble();
                    System.out.println("Set roof length:");
                    yLength = input.nextDouble();
                    System.out.println("other roof: ");
                    zLength = input.nextDouble();
                    triangleMain.setLengthX(xLength);
                    triangleMain.setLengthY(yLength);
                    triangleMain.setLengthZ(zLength);
                    System.out.println("Area: " + triangleMain.getArea());
                    System.out.println("Perimeter: " + triangleMain.perimeter());
                    break;
                case "Cube":
                    Cube cubeMain = new Cube();
                    System.out.println("Set edge length:");
                    xLength = input.nextDouble();
                    cubeMain.setLengthXY(xLength);
                    System.out.println("Area: " + cubeMain.getSurfaceArea());
                    System.out.println("Volume: " + cubeMain.getVolume());
                    break;
                case "Sphere":
                    Sphere sphereMain = new Sphere();
                    System.out.println("Set radius:");
                    xLength = input.nextDouble();
                    sphereMain.setRadius(xLength);
                    System.out.println("Area: " + sphereMain.getSurfaceArea());
                    System.out.println("Volume: " + sphereMain.getVolume());
                    break;
                case "Tetrahedron":
                    Tetrahedron tetrahedronMain = new Tetrahedron();
                    System.out.println("Set edge length:");
                    xLength = input.nextDouble();
                    tetrahedronMain.setLengthX(xLength);
                    System.out.println("Area: " + tetrahedronMain.getSurfaceArea());
                    System.out.println("Volume: " + tetrahedronMain.getVolume());
                    break;
                case "Stop":
                    System.exit(0);
                default:
                    System.out.println(answer + " is not a shape or a stop order.");
            }
        }

    }
}
