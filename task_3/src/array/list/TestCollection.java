package array.list;

import java.util.ArrayList;
import java.util.Arrays;

public class TestCollection {
    private static int size = 10;

    public static void main(String args[]) {

        ArrayListClass list1 = new ArrayListClass();

        Double[] arrayListBuff = generateArray();
        list1.arrayListNum = new ArrayList<>(Arrays.asList(arrayListBuff));

        System.out.println("Initial ArrayList ");
        System.out.print("  " + list1.arrayListNum);

        list1.deleteElements(arrayListBuff);
        System.out.println("\n" + "Deleted elements from ArrayList ");
        System.out.print("  " + list1.arrayListNum);

        ArrayClass array1 = new ArrayClass();
        array1.array = generateArray();
        System.out.println("\n" + "Initial Array " + "\n " + Arrays.toString(array1.array));

        System.out.println("\n" + "Deleted elements from Array " + "\n "
                + Arrays.toString(array1.deleteElements(array1.array)));

    }

    private static Double[] generateArray() {
        Double[] arrayGen = new Double[size];
        for (int i = 0; i < size; i++) {
            arrayGen[i] = Math.random();
        }
        return arrayGen;
    }

}
