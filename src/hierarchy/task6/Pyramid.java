package hierarchy.task6;

public class Pyramid extends Shape {
    private final double s;
    private final double h;

    public Pyramid(double s, double h) {   // присвоить s,h  для объекта пирамид
        super(s * h / 3);
        this.s = s;
        this.h = h;
    }

    public double getSquareOfBasis() {
        return s;
    }
    public double getHeight() {
        return h;
    }
}
