package OOPConcept;

public class Dog implements Machine {
    @Override
    public void run() {
        System.out.println("Dog is running");
    }

    @Override
    public boolean stop() {
        return false;
    }

    @Override
    public int start() {
        return 0;
    }
}
