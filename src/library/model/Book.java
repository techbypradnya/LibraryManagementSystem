package library.model;

/**
 * Represents a Book entity in the library.
 */
public class Book {

    private int bookId;
    private String title;
    private String author;
    private int quantity;

    public Book(int bookId, String title, String author, int quantity) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.quantity = quantity;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookId +
               ", Title: " + title +
               ", Author: " + author +
               ", Quantity: " + quantity;
    }
}
