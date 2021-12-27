package array.list;


public class ArrayClass implements ProcessingArray {
    int size = 10;
    int sizeAfter = 0;
    Double[] array = new Double[size];
    //


    @Override
    public void deleteElements(Double[] arraySorting) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= 0.5) {
                sizeAfter ++;
            }
        }
    }

    public Double[] returnArrayNew () {
        Double[] arrayNew = new Double[sizeAfter];
        int i = 0;
        int j = 0;
        for ( i = 0; i < array.length; i ++) {
            if (array[i] < 0.5) {
                arrayNew[j] = array[i];
                j ++;
            }
        }
        return arrayNew;
    }
}
