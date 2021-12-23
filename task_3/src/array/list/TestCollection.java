package array.list;

import java.util.Arrays;

public class TestCollection {
    private static int size = 10;
    public static void main(String args[]) {

        ArrayListClass list1 = new ArrayListClass();
        list1.arrayListNum = Arrays.asList(generateArray());

        System.out.println("Initial ArrayList ");
        for (int i = 0; i < size; i++ ) {
            System.out.println("  " + list1.arrayListNum.get(i));
        }

        list1.sorting(list1.arrayListNum);
        System.out.println("Sorting ArrayList ");
        for (int i = 0; i < size; i++ ) {
            System.out.println("  " + list1.arrayListNum.get(i));
        }

        ArrayClass array1 = new ArrayClass();
        array1.array = generateArray();

        System.out.println("Initial Array " + "\n " + Arrays.toString(array1.array));


     //   Double[] array = new Double[size];
      //  array = generateArray();
      //  System.out.println("Initial Array " + "\n " + Arrays.toString(array));



    }

    private static Double[] generateArray() {
        Double[] arrayGen = new Double[size];
        for (int i = 0; i < size; i++) {
            arrayGen[i] = Math.random();
        }
        return arrayGen;
    }


}
