package tips.enums;

public enum Season {
    WINTER(1), SPRING(2), SUMMER(3), FALL(4);
    //     0               1                2                3     : ordinal

    private int value;

    private Season(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}