package week5.InClassActivity;

public abstract class Polygon extends Shape2D {
    private int sides;

    public Polygon(int sides) {
        this.sides = sides;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }
}
