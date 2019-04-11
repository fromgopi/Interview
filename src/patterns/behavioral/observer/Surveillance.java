package patterns.behavioral.observer;

public class Surveillance extends CheckList implements AlarmListener{
    @Override
    public void alarm() {
        System.out.println("Surveillance - by the numbers:");
        byTheNumbers();
    }

    protected void isolate() {
        System.out.println("   train the cameras");
    }
}
