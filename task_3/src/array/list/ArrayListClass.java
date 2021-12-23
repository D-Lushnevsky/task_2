package array.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListClass implements ProcessingArray{
    List<Double> arrayListNum = new ArrayList<>();
    int size = 10;

    @Override
    public Double[] sorting(Double[] arraySorting) {
        Double[] listToDouble = new Double[size];
        Collections.sort(arrayListNum);
        listToDouble = arrayListNum.toArray(new Double[size]);
        //arrayNum.addA(TestCollection.generateArray()) ;
        return listToDouble;
    }
}
