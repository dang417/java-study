package Objects;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    };

    public int area(int length, int width) {
        return length * width;
    };

    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width + "]";
    }
}
