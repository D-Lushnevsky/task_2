package task.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class TestSorting {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Chose array generating mode (manual or random)");
        String modeName = scan.next();
        GeneratingMode mode = createSortingMode(modeName);

        System.out.println("Input array size");
        int size = scan.nextInt();

        double[] array = mode.generatingArray(size);
        System.out.println(Arrays.toString(array));                      //выводит несортированный(начальный) массив

        System.out.println("Chose sorting function (bubble, insert or quick)");
        String funcName = scan.next();
        Sorting func = createSortingAlg(funcName);

        func.sortingFunction(array);
        double[] result = array;
        System.out.println("array sorted " + Arrays.toString(result));

        System.out.println("Input value for binary search" + Arrays.toString(result));
        BinarySearch myBinary = new BinarySearch();

        double value = scan.nextDouble();
        System.out.println("Index of value equal " + myBinary.searchingFunction(result, value));

        //list1.arrayListNum = new ArrayList<>(Arrays.asList(arrayListBuff));
    }


    private static Sorting createSortingAlg(String func) {
        switch (func) {
            case "insert":
                return new InsertSort();
            case "bubble":
                return new BubbleSort();
            case "quick":
                return new QuickSort();
            default:
                throw new IllegalArgumentException("Unknown type" + func);
        }
    }

    private static GeneratingMode createSortingMode (String mode) {
        switch (mode) {
            case "manual":
                return new ManualMode();
            case "random":
                return new RandomMode();
            default:
                throw new IllegalArgumentException("Unknown mode" + mode);

        }
    }


}


