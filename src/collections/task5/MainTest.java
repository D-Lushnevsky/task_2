package collections.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MainTest {
    public static void main(String args[]) {

        int size = 1000000;

        List<Integer> array = new ArrayList<>();

        List<Integer> list = new LinkedList<>();

        long start = System.nanoTime();
        setElement(array);
        getElement(array);
        long finish = System.nanoTime();
        System.out.println("Прошло времени для array: " + ((finish - start) / 1000_000));

        start = System.nanoTime();
        setElement(list);
        getElement(list);
        finish = System.nanoTime();
        System.out.println("Прошло времени для list: " + ((finish - start) / 1000_000));

        start = System.nanoTime();
        getMid(array);
        finish = System.nanoTime();
        System.out.println("Прошло времени для array: " + ((finish - start) / 1000_000));

        start = System.nanoTime();
        getMid(list);
        finish = System.nanoTime();
        System.out.println("Прошло времени для list: " + ((finish - start) / 1000_000));


    }

    public static void setElement(List a1) {
        for (int i = 0; i < 1_000_000; i++) {
            a1.add(i);
        }
    }

    public static Integer getElement(List a1) {
        int num = (int) Math.random() * 1_000_000;
        return (Integer) a1.get(num);           // метод get возвращает объект(элемент) c указанной позиции, зач
    }                                            // его дополнительно необходимо преобразовывать в (Integer)

    public static void getMid (List a1) {
        for (int i = 355_000; i < 365_000; i++) {
            a1.remove(i);
        }
    }
}
