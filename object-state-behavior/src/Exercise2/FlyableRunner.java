package Exercise2;

public class FlyableRunner {
    public static void main(String[] args) {
        Flyable[] flyingObjects = {new Bird(), new Aeroplane()};

        for (Flyable object : flyingObjects) {
            object.fly();
        }
    }
}
