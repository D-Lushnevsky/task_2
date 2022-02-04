package collections.task5;

import java.util.Iterator;
import java.util.List;

public class RemoveEverSecond extends ManyExecutions implements Functions{
    private final List<Integer> list;

    public RemoveEverSecond(int count, List<Integer> list) {
        super(count);
        this.list = list;
    }

    @Override
    protected void execute1() {
        int i = 0;
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
            i++;
            if (i % 2 == 0) {
                iter.next();
                iter.remove();
            }
        }
    }
}
