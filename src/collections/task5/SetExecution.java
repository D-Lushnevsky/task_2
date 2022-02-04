package collections.task5;

import java.util.List;

public class SetExecution extends ManyExecutions {
    private final List<Integer> list;
    public SetExecution(int count, List<Integer> list) {
        super(count);
        this.list = list;
    }

    @Override
    protected void execute1() {
        list.add(getCount());
    }
}
