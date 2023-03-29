package week5.InClassActivity;

public class RegularPolygon extends Polygon {
    private double length;
    private double apothem;

    public RegularPolygon(int sides, double length, double apothem) {
        super(sides);
        this.length = length;
        this.apothem = apothem;
    }

    @Override
    void draw() {
        System.out.println("A regular polygon with apothem + " + apothem + " and length "
                + length + " for each of the " + super.getSides() + " sides");
    }

    @Override
    double getArea() {
        return 0.5 * apothem * getPerimeter();
    }

    @Override
    double getPerimeter() {
        return length * super.getSides();
    }
}
