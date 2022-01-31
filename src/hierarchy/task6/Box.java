package hierarchy.task6;

import java.util.*;

public class Box extends Shape {

    private List<Shape> myShapes = new LinkedList<>();

    public Box(double volume) {
        super(volume);
    }

    public boolean add(Shape shape) {
        double requiredCapacity = 0;
        Shape proba = shape;
        myShapes.add(shape);
        Iterator<Shape> iter = myShapes.iterator();
        while (iter.hasNext()) {
            requiredCapacity += iter.next().getVolume();
        }
        if (getVolume() >= requiredCapacity) {
            return true;
        } else {
            return false;
        }
    }


}
