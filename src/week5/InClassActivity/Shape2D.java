package week5.InClassActivity;

public abstract class Shape2D {
    abstract void draw();
    abstract double getArea();
    abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape2D{}";
    }
}
