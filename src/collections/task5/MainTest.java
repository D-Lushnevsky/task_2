package collections.task5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.BiConsumer;

public class MainTest {
    public static void main(String args[]) {

        List<Integer> array = new ArrayList<>();
        List<Integer> list = new LinkedList<>();

/*
        AnonExecutions ex1 = new AnonExecutions(100_000, array, list);

        ex1.setElements.execute();
        ex1.getElements.execute();
        ex1.remElements.execute();
        ex1.remEver2Elements.execute();
*/
        LambdaExecutions ex2 = new LambdaExecutions(100_000, array, list);
        ex2.setElements.execute(100_000, array, list);
        ex2.getElements.execute(100_000, array, list);
        ex2.remElements.execute(100_000, array, list);
        ex2.remEver2Elements.execute(100_000, array, list);


    }
}


/*        BiConsumer<List, List> listListBiConsumer = (List array, List list) -> {

        };

 */