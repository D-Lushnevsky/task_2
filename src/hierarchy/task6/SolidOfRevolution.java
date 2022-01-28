package hierarchy.task6;

public class SolidOfRevolution extends Shape {
    private final double radius;   //private final

    public SolidOfRevolution(double volume, double radius) {
        super(volume);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
