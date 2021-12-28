package task.sorting;

public class QuickSort implements Sorting {
    private static void quick (double[] arrayInitial, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = (leftMarker + rightMarker) / 2;
        do {
            /* Двигаем левый маркер слева направо пока элемент меньше, чем pivot */
            while (arrayInitial[leftMarker] < arrayInitial[pivot]) {
                leftMarker++;
            }
            /* Двигаем правый маркер, пока элемент больше, чем pivot */
            while (arrayInitial[rightMarker] > arrayInitial[pivot]) {
                rightMarker--;
            }
            /* Проверим, не нужно обменять местами элементы, на которые указывают маркеры */
            if (leftMarker <= rightMarker) {
                /* Левый маркер будет меньше правого только если мы должны выполнить swap */
                if (leftMarker < rightMarker) {
                    double buff = arrayInitial[leftMarker];
                    arrayInitial[leftMarker] = arrayInitial[rightMarker];
                    arrayInitial[rightMarker] = buff;
                }
                /* Сдвигаем маркеры, чтобы получить новые границы */
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        /* Выполняем рекурсивно для частей */
        if (leftMarker < rightBorder) {
            quick(arrayInitial, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quick(arrayInitial, leftBorder, rightMarker);
        }
    }

    @Override
    public void sortingFunction(double[] array) {
        quick(array,0, array.length-1);
    }
}
