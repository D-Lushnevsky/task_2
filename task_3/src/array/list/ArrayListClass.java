package array.list;

import java.util.*;


public class ArrayListClass implements ProcessingArray {
    List<Double> arrayListNum = new ArrayList<>();

    @Override
    public void deleteElements(Double[] arraySorting) {
        double boarder = 0.5;
        for (Iterator<Double> iterator = arrayListNum.iterator(); iterator.hasNext(); ) {
            Double next = iterator.next();
            if (next > boarder)  {
                iterator.remove();
            }
        }
    }


}


