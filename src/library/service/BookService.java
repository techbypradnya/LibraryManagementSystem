package library.service;

import java.util.ArrayList;
import library.model.Book;
import library.exception.BookNotFoundException;

/**
 * Handles book-related CRUD operations.
 */
public class BookService {

    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        }
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public Book findBook(int id) throws BookNotFoundException {
        for (Book b : books) {
            if (b.getBookId() == id) {
                return b;
            }
        }
        throw new BookNotFoundException("Book ID not found!");
    }

    public void deleteBook(int id) throws BookNotFoundException {
        Book book = findBook(id);
        books.remove(book);
    }
}
