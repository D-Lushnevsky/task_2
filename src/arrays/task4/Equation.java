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

    protected double getRoot(double a, double b) {
        double x = (b + a) / 2.0;
        // x = Math.floor(x * 1000) / 1000;

        if (solve(a) * solve(x) < 0) {
            b = x;
            System.out.print(x + "b ");
        } else if (solve(b) * solve(x) < 0) {
            a = x;
            System.out.print(x + "a ");
        }

        if ((Math.abs(b - a) > 0.001) & (solve(a) * solve(b) < 0)) {
            x = getRoot(a, b);
            //  System.out.print("111");
        } else {
            if (solve(a) == 0) {
                return a;
            } else if (solve(b) == 0) {
                return b;
            }
        }

        return x;
    }

    protected double solve(double y) {
        //double equat = Math.pow(y, 2) - 9;
        double equat = Math.cos(Math.pow(y, 5)) + Math.pow(y, 4) - 345.3 * y - 23;
        return equat;
    }
    /*
    if (solve(a) == 0) {
        return a;
    } else if (solve(b) == 0) {
        return b;
    }
*/
}

