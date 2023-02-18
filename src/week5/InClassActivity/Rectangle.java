package week5.InClassActivity;

public class Rectangle extends Shape2D {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    void draw() {
        System.out.println("A rectangle width " + width + " and height " + height);
    }

    @Override
    double getArea() {
        return height*width;
    }

    @Override
    double getPerimeter() {
        return 2*height + 2*width;
    }
}
