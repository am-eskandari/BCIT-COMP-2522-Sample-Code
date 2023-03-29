package week5.InClassActivity;

public class Circle extends Shape2D {
    private double radius;
    private static final double PI = 3.141592535;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("A circle with radius " + radius);
    }

    @Override
    double getArea() {
        return PI*radius*radius;
    }

    @Override
    double getPerimeter() {
        return 2*PI*radius;
    }
}
