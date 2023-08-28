package patterns.behavioral.observer;

public class SensorDemo {

    public static void main(String[] args) {

        SensorSystem sensorSystem = new SensorSystem();
        sensorSystem.register(new Gates());
        sensorSystem.register(new Lighting());
        sensorSystem.register(new Surveillance()); 
        sensorSystem.soundTheAlarm();
    }
}
