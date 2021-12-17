package task.sorting;

public class BubbleSort implements Sorting {
    boolean isSorted = false;
    @Override
    public double[] sortingFunction(double[] arrayIn) {
        while(!isSorted) {
            isSorted = true;

            for (int i = 0; i < arrayIn.length-1; i++) {
                if (arrayIn[i] > arrayIn[i + 1]) {
                    isSorted = false;

                    double buff = arrayIn[i];
                    arrayIn[i] = arrayIn[i + 1];
                    arrayIn[i + 1] = buff;

                }
            }
        }
        return arrayIn;
    }
}
