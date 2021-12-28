package array.list;

import java.util.*;


public class ArrayListClass implements ProcessingArray {
    List<Double> arrayListNum = new ArrayList<>();

    @Override
    public Double[] deleteElements(Double[] arraySorting) {
        double boarder = 0.5;
        int listLength = 0;
        for (Iterator<Double> iterator = arrayListNum.iterator(); iterator.hasNext(); ) {
            Double next = iterator.next();
            if (next > boarder)  {
                iterator.remove();
            }
            listLength = arrayListNum.size();
        }
        Double[] array = new Double[listLength];
        array = arrayListNum.toArray(new Double[listLength]);

        return array;
    }


}


