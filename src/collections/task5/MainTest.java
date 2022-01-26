package collections.task5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainTest {
    public static void main(String args[]) {

        int size = 1000000;

        List<Integer> array = new ArrayList<>();

        List<Integer> list = new LinkedList<>();

        long start = System.nanoTime();
        setElement(array);
        long finish = System.nanoTime();
        System.out.println("Прошло времени для array: " + ((finish - start) / 1000_000d));

        start = System.nanoTime();
        getElement(array);
        finish = System.nanoTime();
        System.out.println("Прошло времени для array: " + ((finish - start) / 1000_000d));

        start = System.nanoTime();
        setElement(list);
        finish = System.nanoTime();
        System.out.println("Прошло времени для list: " + ((finish - start) / 1000_000d));

        start = System.nanoTime();
        getElement(list);
        finish = System.nanoTime();
        System.out.println("Прошло времени для list: " + ((finish - start) / 1000_000d));

        start = System.nanoTime();
        getRemove(array);
        finish = System.nanoTime();
        System.out.println("Время удаления для array: " + ((finish - start) / 1000_000d));

        start = System.nanoTime();
        getRemove(list);
        finish = System.nanoTime();
        System.out.println("Время удаления для list: " + ((finish - start) / 1000_000.d));


    }

    public static void setElement(List<Integer> a1) {
        for (int i = 0; i < 1_000_000; i++) {
            a1.add(i);
        }
    }

    public static void getElement(List<Integer> a1) {
        for (int i = 0; i < 10_000; i++) {
            int num = (int) (Math.random() * a1.size());
            a1.get(num);
        }
    }


    public static void getRemove(List<Integer> a1) {
        for (int i = 355_000; i < 365_000; i++) {
            a1.remove(0);
        }
    }
}
