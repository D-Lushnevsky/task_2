package task.sorting;

public class InsertSort implements Sorting {
    @Override
    public double[] sortingFunction(double[] arrayIn) {
        for (int i = 0; i < arrayIn.length; i++) {
            double value = arrayIn[i];
            int j = i - 1;
            for ( ; j >= 0; j--) {
                if (value < arrayIn[j]) {
                    arrayIn [j + 1] = arrayIn[j];
                }
                else {
                    break;
                }
            }
            arrayIn[j + 1] = value;
        }
        return  arrayIn;
    }
}
