package Objects;

public class FanRunner {
    public static void main(String[] args) {
        Fan fan = new Fan("Manufacturer 1", 0.34567, "GREEN");
        fan.switchOn();
        System.out.println(fan);
        fan.changeSpeed((byte) 3);
        System.out.println(fan);
        fan.switchOff();
        System.out.println(fan);
    }
}
