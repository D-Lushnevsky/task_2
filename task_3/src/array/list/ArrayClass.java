package array.list;


public class ArrayClass implements ProcessingArray {
    int size = 10;
    Double[] array = new Double[size];

    @Override
    public Double[] deleteElements(Double[] arraySorting) {
        int sizeAfter = 0;
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= 0.5) {
                sizeAfter++;
            }

        }
        Double[] arrayNew = new Double[sizeAfter];
        for (int k = 0; k <= array.length-1; k++) {
            if (array[k] < 0.5) {
                arrayNew[j] = array[k];
                j++;
            }
        }
        return  arrayNew;
    }
}