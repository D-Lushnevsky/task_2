package arrays.task4;

/*
    Класс для решения задачи №2
 */
public class Equation {

    double a;
    double b;

    Equation(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getRoot() {

        if (solve(a) == 0) {
            return a;
        } else if (solve(b) == 0) {
            return b;
        }

        double mid = (b + a) / 2.0;

        if (Math.abs(b - a) < 0.001) {
            return b;
        }
        if (solve(a) * solve(mid) < 0) {
            b = mid;
            return getRoot();
        } else if (solve(b) * solve(mid) < 0) {
            a = mid;
            return getRoot();
        }
        return mid;
    }

    private double solve(double x) {
        double equat = Math.cos(Math.pow(x, 5)) + Math.pow(x, 4) - 345.3 * x - 23;
        return equat;
    }
}

