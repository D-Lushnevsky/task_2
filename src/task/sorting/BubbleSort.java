package task.sorting;

public class BubbleSort implements Sorting {
    boolean isSorted = true;
    @Override
    public void sortingFunction(double[] array) {
        while(isSorted) {
            isSorted = false;

            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = true;

                    double buff = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buff;

                }
            }
        }

    }
}
