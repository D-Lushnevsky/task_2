package task.sorting;

public class BubbleSort implements SortingFunction {
    boolean isSorted = false;
    @Override
    public double[] InsertFunction(double[] arrayIn) {
        while(!isSorted) {
            isSorted = true;
            for (int i = 1; i < arrayIn.length; i++) {
                if (arrayIn[i] < arrayIn[i-1]) {
                    double buff = arrayIn[i];
                    arrayIn[i] = arrayIn[i-1];
                    arrayIn[i-1] = buff;
                    isSorted = false;
                }
            }
        }
        return arrayIn;
    }
}
