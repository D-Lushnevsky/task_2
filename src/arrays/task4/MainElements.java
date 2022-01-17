package arrays.task4;

import java.util.Arrays;

public class MainElements {
    public static void main(String args[]) {
        double[] array = {1, 2, 3, 4, 5};
        double[] arrayWeights = {2, 3, 7, 11, 16};

        Elements e1 = new Elements(array, arrayWeights);

        for (int i = 0; i < 15; i++) {
            System.out.println(e1.elementsReturn(e1));
        }
        System.out.println(Arrays.toString(e1.values));
        System.out.println(Arrays.toString(e1.valuesWeights));


        double a = 0;
        double b = 10;
        double step = 0.001;
        Equation eq1 = new Equation(a, b);

        System.out.println(eq1.getRoot(a, b));

       // System.out.println(step);


    }

}
