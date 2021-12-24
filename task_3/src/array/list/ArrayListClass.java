package array.list;

import java.util.*;
import java.util.function.Predicate;

public class ArrayListClass implements ProcessingArray {
    List<Double> arrayListNum = new ArrayList<>();
    Double[] listToDouble;
    int size = 10;

    @Override
    public Double[] sorting(Double[] arraySorting) {
        Collections.sort(arrayListNum);
        listToDouble = arrayListNum.toArray(new Double[size]);
        //boolean bol = arrayListNum.removeIf((Predicate<? super Double>) arrayListNum);
        return listToDouble;
    }

    @Override
    public Double[] deleteElements(Double[] arraySorting) {
        double boarder = 0.5;

        for (Iterator<Double> iterator = arrayListNum.iterator(); iterator.hasNext(); ) {
            Double next = iterator.next();
            if (next > boarder)  {
                iterator.remove();
            }
        }


        listToDouble = arrayListNum.toArray(new Double[size]);
        return listToDouble;
    }


}

/*boolean isDeleted = arrayListNum.removeIf((Predicate<? super Double>) arrayListNum);
        for (double element: arrayListNum) {
            if (Math.min(element,boarder) == boarder) {
                arrayListNum.remove(this);
            }
        }

         */
