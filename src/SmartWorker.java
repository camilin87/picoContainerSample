public class SmartWorker implements IWorker {
    private final IWorkQueue queue;

    public SmartWorker(IWorkQueue queue) {
        this.queue = queue;
    }

    @Override
    public void Run() {
        System.out.println("Doing smart work");
    }
}
