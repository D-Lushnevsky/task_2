package collections.task5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MainTest {
    private static final String someString = "111";
    static Iterator<Integer> iter;

    public static void main(String args[]) {
        List<Integer> array = new ArrayList<>();
        List<Integer> list = new LinkedList<>();


        //  timeCheck(new SomeRealClass(array, list), "");      /* при использовании какого либо класса из package в параметрах*/

        timeCheck("Добавление элементов ", list, array, action -> {
            for (int i = 0; i < 1000_000; ++i) {
                action.add(i);
            }
        });

        timeCheck("Извлечение элементов ", list, array, action -> {
            for (int i = 0; i < 10_000; ++i) {
                int num = (int) (Math.random() * action.size());
                action.get(num);
            }
        });

        timeCheck("Удаление элементов ", list, array, action -> {
            for (int i = 0; i < 5_000; ++i) {
                action.remove(0);
            }
        });

        timeCheck("Удаление каждого 2 элемента ", list, array, action -> {
            int i = 0;
            Iterator<Integer> iter = action.iterator();
            while (iter.hasNext()) {
                i++;
                if (i % 2 == 0) {
                    iter.next();
                    iter.remove();
                }
            }
        });
/*


        timeCheck(new Action() {
            @Override
            public void execute() {
                iter = array.iterator();
            }
        },0, true, "Удаление каждого 2-го элемента из array ");

        timeCheck(() -> {
            iter = list.iterator();
        },0, true, "Удаление каждого 2-го элемента из list ");

 */

    }

    private static final int TIMES = 100;
    public static void timeCheck(String name, List<Integer> list, List<Integer> array, Action action) {
        long start = System.nanoTime();
        action.execute(list);
        long finish = System.nanoTime();
        System.out.println("List: " + name + ((finish - start) / 1000_000d));
        start = System.nanoTime();
        action.execute(array);
        finish = System.nanoTime();
        System.out.println("Array: " + name + ((finish - start) / 1000_000d));
    }
}
