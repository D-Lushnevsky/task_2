package task.sorting;

public class BinarySearch {
    public int searchingFunction(double[] array, double value) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            /*
            **пока искомое значение меньше значения в середине массива, вехрняя граница
            * сдвигается вниз и наоборот.
            * После уменьшения границ  массив снова делиться пополам и т.д.
            * Так пока не станет value == mid
             */
            if (value < array[mid]) {
                high = mid - 1;
            } else if (value > array[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
