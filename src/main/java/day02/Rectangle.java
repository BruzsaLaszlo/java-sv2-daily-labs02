package day02;

public class Rectangle {
    double a,b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double calculateArea() {
        return a * b;
    }
}