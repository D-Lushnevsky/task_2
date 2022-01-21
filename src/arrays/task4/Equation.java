package arrays.task4;

/*
    Класс для решения задачи №2
 */
public class Equation {

    Equation() {
    }

    public double getRoot(double a, double b) {
        if (b - a < 0.001) {
            return b;
        }
        double middle = (b + a) / 2.0;
        double min = solve(a);
        double max = solve(b);
        double mid = solve(middle);

        if (max == 0) {
            return b;
        } else if (min == 0) {
            return a;
        } else if (mid == 0) {
            return middle;
        }
            if (min * mid < 0) {
                 return getRoot(a, middle);
            } else {
                return getRoot(middle, b);
            }

    }

    private double solve(double x) {
        double equat = Math.cos(Math.pow(x, 5)) + Math.pow(x, 4) - 345.3 * x - 23;
        return equat;
    }
}

