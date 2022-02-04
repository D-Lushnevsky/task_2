package collections.task5;

import java.util.List;

public class GetExecution extends ManyExecutions {
    private final List<Integer> list;

    public GetExecution(int count, List<Integer> list) {
        super(count);
        this.list = list;
    }

    @Override
    protected void execute1() {
        int num = (int) (Math.random() * list.size());
        list.get(num);
    }
}
