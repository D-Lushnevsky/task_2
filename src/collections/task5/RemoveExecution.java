package collections.task5;

import java.util.List;

public class RemoveExecution extends ManyExecutions implements Actions {
    private final List<Integer> list;

    public RemoveExecution(int count, List<Integer> list) {
        super(count);
        this.list = list;
    }

    protected void setElements()
    {
        for (int i = 0; i < 10_000; i++) {
            list.add(i);
        }
    }

    @Override
    protected void execute1() {
        list.remove(0);
    }
}
