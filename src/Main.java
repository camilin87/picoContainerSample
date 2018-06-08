import org.picocontainer.DefaultPicoContainer;

public class Main {

    public static void main(String[] args) {
        var resolver = new DefaultPicoContainer();
        resolver.addComponent(IWorker.class, SmartWorker.class);

        resolver.getComponent(IWorker.class).Run();
    }
}
