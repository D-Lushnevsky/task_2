package collections.task5;

import java.util.Iterator;
import java.util.List;

public class LambdaExecutions {

    private final List<Integer> array;
    private final List<Integer> list;
    private final int count;

    public LambdaExecutions(int count, List<Integer> array, List<Integer> list) {
        this.count = count;
        this.list = list;
        this.array = array;
    }

    Actions setElements = ((int count, List<Integer> array, List<Integer> list) -> {
        long start = System.nanoTime();
        for (int i = 0; i < count; i++) {
            array.add(100);
        }
        long finish = System.nanoTime();
        System.out.println("Добавление элементов в array " + ((finish - start) / 1000_000d));

        start = System.nanoTime();
        for (int i = 0; i < count; i++) {
            list.add(100);
        }
        finish = System.nanoTime();
        System.out.println("Добавление элементов в list " + ((finish - start) / 1000_000d));
    });

    Actions getElements = ((int count, List<Integer> array, List<Integer> list) -> {
        long start = System.nanoTime();
        for (int i = 0; i < count; i++) {
            int num = (int) (Math.random() * list.size());
            array.get(num);
        }
        long finish = System.nanoTime();
        System.out.println("Извлечение элементов из array " + ((finish - start) / 1000_000d));

        start = System.nanoTime();
        for (int i = 0; i < count; i++) {
            int num = (int) (Math.random() * list.size());
            list.get(num);
        }
        finish = System.nanoTime();
        System.out.println("Извлечение элементов из list " + ((finish - start) / 1000_000d));
    });

    Actions remElements = ((int count, List<Integer> array, List<Integer> list) -> {
        long start = System.nanoTime();
        for (int i = 0; i < count; i++) {
            array.remove(0);
        }
        long finish = System.nanoTime();
        System.out.println("Удаление элементов из array " + ((finish - start) / 1000_000d));

        start = System.nanoTime();
        for (int i = 0; i < count; i++) {
            list.remove(0);
        }
        finish = System.nanoTime();
        System.out.println("Удаление элементов из list " + ((finish - start) / 1000_000d));
    });

    Actions remEver2Elements = ((int count, List<Integer> array, List<Integer> list) -> {
        long start = System.nanoTime();
        int i = 0;
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
            i++;
            if (i % 2 == 0) {
                iter.next();
                iter.remove();
            }
        }
        long finish = System.nanoTime();
        System.out.println("Удаление каждого 2-го из array " + ((finish - start) / 1000_000d));

        start = System.nanoTime();
        i = 0;
        Iterator<Integer> iter2 = list.iterator();
        while (iter2.hasNext()) {
            i++;
            if (i % 2 == 0) {
                iter2.next();
                iter2.remove();
            }
        }
        finish = System.nanoTime();
        System.out.println("Удаление каждого 2-го из list " + ((finish - start) / 1000_000d));
    });

}
