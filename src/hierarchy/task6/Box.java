package hierarchy.task6;

public class Box extends Shape {
    public Box (double volume) {
        this.volume = volume;
    }

    public boolean add(Shape shape) {
        volume -= shape.getVolume();
        if (volume > 0) {
            return true;
        }
        return false;
    }
}
