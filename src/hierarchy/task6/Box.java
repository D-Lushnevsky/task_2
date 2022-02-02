package hierarchy.task6;

import java.util.*;

public class Box extends Shape {

    private final List<Shape> myShapes = new LinkedList<>();

    public Box(double volume) {
        super(volume);
    }

    public boolean add(Shape shape) {
        double requiredCapacity = 0;
        Iterator<Shape> iter = myShapes.iterator();
        while (iter.hasNext()) {
            requiredCapacity += iter.next().getVolume();
        }
        if (getVolume() >= requiredCapacity + shape.getVolume()) {
            myShapes.add(shape);
            return true;
        } else {
            return false;
        }
    }


}
