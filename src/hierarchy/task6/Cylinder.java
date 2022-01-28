package hierarchy.task6;

public class Cylinder extends SolidOfRevolution {
    private double height;

    public Cylinder(double radius, double height) {
        volume = 3.14 * radius * radius * height;
    }

    @Override
    public double getVolume() {
        return super.getVolume();
    }
}
