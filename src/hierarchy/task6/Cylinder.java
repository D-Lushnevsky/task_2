package hierarchy.task6;

public class Cylinder extends SolidOfRevolution{
    private double height;

    public Cylinder (double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getVolume () {
        volume = 3.14 * radius * radius * height;
        return volume;
    }
}
