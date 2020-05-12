package lesson_4.exercises.Quadrilateral;

import lombok.Getter;

@Getter
public class QuadSuper {
    protected double pointAX, pointAY;
    protected double pointBX, pointBY;
    protected double pointCX, pointCY;
    protected double pointDX, pointDY;
    protected double vectorA, vectorB, vectorC, vectorD;
    protected double area, height;

    public QuadSuper(double pointAX, double pointAY, double pointBX, double pointBY, double pointCX, double pointCY, double pointDX, double pointDY, double vectorA, double vectorB, double vectorC, double vectorD, double area, double height) {
        this.pointAX = pointAX;
        this.pointAY = pointAY;
        this.pointBX = pointBX;
        this.pointBY = pointBY;
        this.pointCX = pointCX;
        this.pointCY = pointCY;
        this.pointDX = pointDX;
        this.pointDY = pointDY;
        this.vectorA = vectorA;
        this.vectorB = vectorB;
        this.vectorC = vectorC;
        this.vectorD = vectorD;
        this.area = area;
        this.height = height;
    }

    public QuadSuper() {
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
        this.height = 0;
    }


    public void setPointA(double x, double y) {
        this.pointAX = x;
        this.pointAY = y;
    }

    public void setPointB(double x, double y) {
        this.pointBX = x;
        this.pointBY = y;
    }

    public void setPointC(double x, double y) {
        this.pointCX = x;
        this.pointCY = y;
    }

    public void setPointD(double x, double y) {
        this.pointDX = x;
        this.pointDY = y;
    }

    public void setAllVectors() {
        setVectorA(this.pointAX, this.pointBX, this.pointAY, this.pointBY);
        setVectorB(this.pointBX, this.pointCX, this.pointBY, this.pointCY);
        setVectorC(this.pointCX, this.pointDX, this.pointCY, this.pointDY);
        setVectorD(this.pointDX, this.pointAX, this.pointDY, this.pointAY);
        setHeight(this.pointDX, this.pointDY, this.pointAY);
    }

    public void setVectorA(double x1, double x2, double y1, double y2) {
        double provisionalX = x2 - x1;
        double provisionalY = y2 - y1;
        this.vectorA = Math.sqrt(Math.pow(provisionalX, 2) + Math.pow(provisionalY, 2));
    }

    public void setVectorB(double x1, double x2, double y1, double y2) {
        double provisionalX = x2 - x1;
        double provisionalY = y2 - y1;
        this.vectorB = Math.sqrt(Math.pow(provisionalX, 2) + Math.pow(provisionalY, 2));
    }

    public void setVectorC(double x1, double x2, double y1, double y2) {
        double provisionalX = x2 - x1;
        double provisionalY = y2 - y1;
        this.vectorC = Math.sqrt(Math.pow(provisionalX, 2) + Math.pow(provisionalY, 2));
    }

    public void setVectorD(double x1, double x2, double y1, double y2) {
        double provisionalX = x2 - x1;
        double provisionalY = y2 - y1;
        this.vectorD = Math.sqrt(Math.pow(provisionalX, 2) + Math.pow(provisionalY, 2));
    }

    //Height: DX/DY - DX/AY
    public void setHeight(double x1, double y1, double y2) {
        double provisionalX = x1 - x1;
        double provisionalY = y1 - y2;
        this.height = Math.sqrt(Math.pow(provisionalX, 2) + Math.pow(provisionalY, 2));
    }

    public double getHeight() {
        return this.height;
    }

    public double getArea() {
        return this.area;
    }

    public double getVectorA() {
        return vectorA;
    }

    public double getVectorB() {
        return vectorB;
    }

    public double getVectorC() {
        return vectorC;
    }

    public double getVectorD() {
        return vectorD;
    }
}
