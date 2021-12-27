package task.sorting;

public class InsertSort implements Sorting {
    @Override
    public void sortingFunction(double[] array) {
        for (int i = 0; i < array.length; i++) {
            double value = array[i];
            int j = i - 1;
            for ( ; j >= 0; j--) {
                if (value < array[j]) {
                    array [j + 1] = array[j];
                }
                else {
                    break;
                }
            }
            array[j + 1] = value;
        }
    }
}
