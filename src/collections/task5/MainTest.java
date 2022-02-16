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

        timeCheck(new Action() {
            @Override
            public void execute() {
                array.add(1);
            }
        }, 100_000, false, "Добавление элементов в array ");

        timeCheck(() -> {
                list.add(1);
        },100_000, false, "Добавление элементов в list ");

        timeCheck(new Action() {
            @Override
            public void execute() {
                    int num = (int) (Math.random() * array.size());
                    array.get(num);
            }
        },10_000, false, "Извлечение элементов из array ");

        timeCheck(() -> {
                int num = (int) (Math.random() * list.size());
                list.get(num);
        },10_000, false, "Извлечение элементов из list ");

        timeCheck(new Action() {
            @Override
            public void execute() {
                    array.remove(0);
            }
        },50_000, false, "Удаление элементов из array ");

        timeCheck(() -> {
                list.remove(0);
        },50_000, false, "Удаление элементов из list ");

        timeCheck(new Action() {
            @Override
            public void execute() {
                iter = array.iterator();
            }
        },0, true, "Удаление каждого 2-го элемента из array ");

        timeCheck(() -> {
            iter = list.iterator();
        },0, true, "Удаление каждого 2-го элемента из list ");

    }

    public static void timeCheck(Action action, int count, boolean iterFlag, String string) {
        long start = System.nanoTime();
        if (iterFlag) {
            action.execute();
            while (iter.hasNext()) {
                count++;
                if (count % 2 == 0) {
                    iter.next();
                    iter.remove();
                }
            }
        } else {
            for (int i = 0; i < count; i++) {
                action.execute();
            }
        }
        long finish = System.nanoTime();
        System.out.println(string + ((finish - start) / 1000_000d));
    }
}
