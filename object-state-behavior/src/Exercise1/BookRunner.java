package Exercise1;

public class BookRunner {
    public static void main(String[] args) {
        Book book = new Book(123, "Object Oriented Programming with Java", "Ranga");

        book.addReview(new Reviews(10, "Great Book", (byte) 5));
        book.addReview(new Reviews(101, "Awsome", (byte) 5));

        System.out.println(book);
    }
}
