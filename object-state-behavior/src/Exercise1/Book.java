package Exercise1;

import java.util.ArrayList;

public class Book {
    //state
    private int id;
    private String name;
    private String author;
    private ArrayList<Reviews> reviews = new ArrayList<Reviews>();

    //constructer
    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    //behavior
    public void addReview(Reviews review) {
        this.reviews.add(review);
    }

    public String toString() {
        return "Name: " + this.name + ", Author: " + this.author + ", Reviews: " + this.reviews;
    }
}
