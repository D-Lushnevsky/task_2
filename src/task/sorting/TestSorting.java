package task.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class TestSorting {
    public static void main(String args[]) {

        double[] array = generateArray();
        System.out.println(Arrays.toString(array));

        Scanner scan = new Scanner(System.in);
        System.out.println("Chose sorting function (bubble or insert)");

        String funcName = scan.next();
        Sorting func = createSortingFunc(funcName);

        double[] result = applySortingFunction(func, array);
        System.out.println("array sorted" + Arrays.toString(result));

    }

    private static double[] applySortingFunction (Sorting func, double[] array ) {
        double[] res =  func.SortingFunction(array);
        return res;
    }

    private static Sorting createSortingFunc(String func) {
        switch (func) {
            case "insert":
                return new InsertSort();
            case "bubble":
                return new BubbleSort();
            default:
                throw new IllegalArgumentException("Unknown type" + func);
        }
    }

    private static double[] generateArray() {
        double[] arrayGen = {15, 3, 65, 6, 34, 22, 21};
        return arrayGen;
    }


}


