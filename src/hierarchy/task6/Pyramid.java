package hierarchy.task6;

public class Pyramid extends Shape {
    private double s;
    private double h;

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
