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

        if (solve(a) * solve(middle) < 0) {
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

