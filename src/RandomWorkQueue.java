import java.util.Random;

public class RandomWorkQueue implements IWorkQueue {
    private final Random random = new Random();

    @Override
    public int ReadNextItem() {
        return random.nextInt();
    }
}
