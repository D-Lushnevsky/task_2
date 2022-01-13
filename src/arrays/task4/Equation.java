package arrays.task4;

public class Equation {


    double a;
    double b;


    Equation(double a, double b) {
        this.a = a;
        this.b = b;
    }

    protected double getRoot(double a, double b) {
        double step = 0.001;
        if (solve(a) == 0) {
            return a;
        } else if (solve(b) == 0) {
            return b;
        }
        while (b - a > step) {
            double x = (b - a) / 2.0;

            if (solve(a) * solve(x) < 0) {
                if (solve(x) == 0) {
                    return x;
                }
                b = x - 0.001;
                //getRoot(a, b);
                System.out.print(" true");

            } else if (solve(b) * solve(x) < 0) {
                if (solve(x) == 0) {
                    return x;
                }
                a = x + 0.001;
                // getRoot(a, b);
                System.out.print(" false");
            } else {
                return x;
            }
        }
        return -1;
    }

    protected double solve(double y) {
        // double x = (b - a) / 2;
        double equat = Math.cos(Math.pow(y, 5)) + Math.pow(y, 4) - 345.3 * y - 23;
        return equat;
    }


}

