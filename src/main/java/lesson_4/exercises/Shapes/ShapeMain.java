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
                    squareMain.setLengths(xLength, 0);
                    System.out.println("Area: " + squareMain.getArea());
                    break;
                case "Circle":
                    Circle circleMain = new Circle();
                    System.out.println("Set radius:");
                    xLength = input.nextDouble();
                    circleMain.setLengths(xLength, 0);
                    System.out.println("Area: " + circleMain.getArea());
                    break;
                case "Rectangle":
                    Rectangle rectangleMain = new Rectangle();
                    System.out.println("Set width:");
                    xLength = input.nextDouble();
                    System.out.println("Set height:");
                    yLength = input.nextDouble();
                    rectangleMain.setLengths(xLength, yLength);
                    System.out.println("Area: " + rectangleMain.getArea());
                    break;
                case "Triangle":
                    Triangle triangleMain = new Triangle();
                    System.out.println("Set width:");
                    xLength = input.nextDouble();
                    System.out.println("Set roof length:");
                    yLength = input.nextDouble();
                    triangleMain.setLengths(xLength, yLength);
                    System.out.println("Area: " + triangleMain.getArea());
                    break;
                case "Cube":
                    Cube cubeMain = new Cube();
                    System.out.println("Set width:");
                    xLength = input.nextDouble();
                    System.out.println("Set height:");
                    yLength = input.nextDouble();
                    System.out.println("Set depth:");
                    zLength = input.nextDouble();
                    cubeMain.setLengths(xLength, yLength, zLength);
                    System.out.println("Area: " + cubeMain.getArea());
                    System.out.println("Volume: " + cubeMain.getVolume());
                    break;
                case "Sphere":
                    Sphere sphereMain = new Sphere();
                    System.out.println("Set radius:");
                    xLength = input.nextDouble();
                    sphereMain.setLengths(xLength, 0, 0);
                    System.out.println("Area: " + sphereMain.getArea());
                    System.out.println("Volume: " + sphereMain.getVolume());
                    break;
                case "Tetrahedron":
                    Tetrahedron tetrahedronMain = new Tetrahedron();
                    System.out.println("Set edge length:");
                    xLength = input.nextDouble();
                    tetrahedronMain.setLengths(xLength, 0, 0);
                    System.out.println("Area: " + tetrahedronMain.getArea());
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
