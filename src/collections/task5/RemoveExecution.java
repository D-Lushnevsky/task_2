package collections.task5;

import java.util.List;

public class RemoveExecution extends ManyExecutions implements Functions{
    private final List<Integer> list;

    public RemoveExecution(int count, List<Integer> list) {
        super(count);
        this.list = list;
    }

    @Override
    protected void execute1() {
        list.remove(0);
    }
}
