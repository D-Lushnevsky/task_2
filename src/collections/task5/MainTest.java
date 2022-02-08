package collections.task5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MainTest {
    private static final String someString = "111";

    public static void main(String args[]) {
        List<Integer> array = new ArrayList<>();
        List<Integer> list = new LinkedList<>();

        //  timeCheck(new SomeRealClass(array, list), "");      /* при использовании какого либо класса из package в параметрах*/

        timeCheck(new Action() {
            @Override
            public void execute() {
                for (int i = 0; i < 100_000; i++) {
                    array.add(1);
                }
            }
        }, "Добавление элементов в array ");

        timeCheck(() -> {
            for (int i = 0; i < 100_000; i++) {
                list.add(1);
            }
        }, "Добавление элементов в list ");

        timeCheck(new Action() {
            @Override
            public void execute() {
                for (int i = 0; i < 10_000; i++) {
                    int num = (int) (Math.random() * array.size());
                    array.get(num);
                }
            }
        }, "Извлечение элементов из array ");

        timeCheck(() -> {
            for (int i = 0; i < 10_000; i++) {
                int num = (int) (Math.random() * list.size());
                list.get(num);
            }
        }, "Извлечение элементов из list ");

        timeCheck(new Action() {
            @Override
            public void execute() {
                for (int i = 0; i < 50_000; i++) {
                    array.remove(0);
                }
            }
        }, "Удаление элементов из array ");

        timeCheck(() -> {
            for (int i = 0; i < 50_000; i++) {
                list.remove(0);
            }
        }, "Удаление элементов из list ");

        timeCheck(new Action() {
            @Override
            public void execute() {
                int i = 0;
                Iterator<Integer> iter = array.iterator();
                while (iter.hasNext()) {
                    i++;
                    if (i % 2 == 0) {
                        iter.next();
                        iter.remove();
                    }
                }
            }
        }, "Удаление каждого 2-го элемента из array ");

        timeCheck(() -> {
            int i = 0;
            Iterator<Integer> iter = list.iterator();
            while (iter.hasNext()) {
                i++;
                if (i % 2 == 0) {
                    iter.next();
                    iter.remove();
                }
            }
        }, "Удаление каждого 2-го элемента из list ");

    }

    public static void timeCheck(Action action, String string) {
        long start = System.nanoTime();
        action.execute();
        long finish = System.nanoTime();
        System.out.println(string + ((finish - start) / 1000_000d));
    }
}
