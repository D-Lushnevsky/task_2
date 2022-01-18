package arrays.task4;

import java.util.Arrays;

public class MainElements {
    public static void main(String args[]) {
        double[] array = {1, 2, 3, 4, 5};
        double[] arrayWeights = {2, 3, 7, 12, 16};

        Elements e1 = new Elements(array, arrayWeights);

        for (int i = 0; i < 15; i++) {
            System.out.println(e1.elementsReturn());
        }
       // System.out.println(Arrays.toString(e1.values));
       // System.out.println(Arrays.toString(e1.valueWeights));


        double a = 0;
        double b = 10;

        Equation eq1 = new Equation(a, b);

        System.out.println(eq1.getRoot());

    }

}
