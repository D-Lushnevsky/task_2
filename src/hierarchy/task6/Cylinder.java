package hierarchy.task6;

public class Cylinder extends SolidOfRevolution {
    private final double height;

    public Cylinder(double radius, double height) {   /// должен задавать радиус и высоту
        super(3.14 * radius * radius * height, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
}
