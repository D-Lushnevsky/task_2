package hierarchy.task6;

public class Box extends Shape {

    public double getVolume () {
        return volume;
    }

    public Box (double volume) {
        this.volume = volume;

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
