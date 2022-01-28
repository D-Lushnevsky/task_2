package hierarchy.task6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Box extends Shape {

    private Set<Shape> myShapes = new HashSet<Shape>();

    public Box(double volume) {
        super(volume);
    }

    public boolean add (Shape shape) {
        double capacity = 0;
        Shape proba = shape;
        myShapes.add(shape);
        Iterator<Shape> iter = myShapes.iterator();
        if (iter.hasNext()) {
           capacity += iter.next().getVolume();
        }
    }
}
