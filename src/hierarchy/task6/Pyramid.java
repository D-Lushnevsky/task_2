package hierarchy.task6;

public class Pyramid extends Shape {
    private double s;
    private double h;

    public Pyramid (double s, double h) {
        this.s = s;
        this.h = h;
    }

    public double getVolume() {
        volume = (s * h) / 3;
        return volume;
    }

}
