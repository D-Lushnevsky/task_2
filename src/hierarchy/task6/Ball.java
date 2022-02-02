package hierarchy.task6;

public class Ball extends SolidOfRevolution {
    public Ball(double volume, double radius) {
        super(4/3 * 3.14 * radius * radius * radius, radius);
    }
}
