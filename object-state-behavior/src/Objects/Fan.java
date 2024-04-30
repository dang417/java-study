package Objects;

public class Fan {
    //states
    private String make;
    private double radius;
    private String color;
    private boolean isOn;
    private byte speed;

    //constructors
    public Fan(String make, double radius, String color) {
        this.make = make;
        this.radius = radius;
        this.color = color;
    }

    //behavior
    public void switchOn() {
        this.isOn = true;
        this.speed = (byte) 5;
    }

    public void switchOff() {
        this.isOn = false;
        this.speed = (byte) 0;
    }

    public void changeSpeed(byte speed) {
        this.speed = speed;
    }

    public String toString() {
        return String.format("makr - %s, radius - %f, color - %s, isOn - %b, speed - %d", make, radius, color, isOn, speed);
    }
}
