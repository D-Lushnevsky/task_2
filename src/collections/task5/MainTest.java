package collections.task5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainTest {
    public static void main(String args[]) {

        List<Integer> array = new ArrayList<>();
        List<Integer> list = new LinkedList<>();

        Executions ex1 = new Executions(100_000, array, list);

        ex1.setElements.execute();
        ex1.getElements.execute();
        ex1.remElements.execute();
        ex1.remEver2Elements.execute();


    }
}
