package Exercise1;

public class Reviews {
    //state
    private int id;
    private String description;
    private byte rating;

    //constructer
    public Reviews(int id, String description, byte rating) {
        this.id = id;
        this.description = description;
        this.rating = rating;
    }

    //behavior
    public String toString() {
        return description + " rating: " + rating;
    }
}
