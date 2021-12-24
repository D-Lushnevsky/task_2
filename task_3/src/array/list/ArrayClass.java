package array.list;

import java.util.List;

public class ArrayClass implements ProcessingArray {
    int size = 10;
    boolean isSorted = true;
    Double[] array = new Double[size];

    @Override
    public Double[] sorting(Double[] arraySorting) {
        while (isSorted) {
            isSorted = false;

            for (int i = 0; i < arraySorting.length - 1; i++) {
                if (arraySorting[i] > arraySorting[i + 1]) {
                    isSorted = true;

                    double buff = arraySorting[i];
                    arraySorting[i] = arraySorting[i + 1];
                    arraySorting[i + 1] = buff;
                }
            }
        }
        return arraySorting;
    }

    @Override
    public Double[] deleteElements(Double[] arraySorting) {
        return new Double[0];
    }


}
