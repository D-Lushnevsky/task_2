package hierarchy.task6;

public class Box extends Shape {

    private double volume;
    public double getVolume () {
        return 0;
    }
    public Box (double volume1) {

    }

    public boolean add (Shape shape1) {
        volume = volume - shape1.getVolume();
        if (volume > shape1.getVolume()) {
            return true;
        } else {
            return false;
        }
    }
}
