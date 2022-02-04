package collections.task5;

public abstract class ManyExecutions implements Functions{
    private final int count;

    public ManyExecutions(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    @Override
    public final void execute() {
        for (int i = 0; i < count; i++) {
            execute1();
        }
    }

    protected abstract void execute1();


}
