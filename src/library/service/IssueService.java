package library.service;

import java.util.ArrayList;
import library.model.IssueRecord;
import library.model.Book;
import library.exception.BookNotAvailableException;

/**
 * Handles book issue & return.
 */
public class IssueService {

    private ArrayList<IssueRecord> issuedBooks = new ArrayList<>();

    public void issueBook(Book book, int memberId) throws BookNotAvailableException {
        if (book.getQuantity() <= 0) {
            throw new BookNotAvailableException("Book not available!");
        }
        book.setQuantity(book.getQuantity() - 1);
        issuedBooks.add(new IssueRecord(book.getBookId(), memberId));
    }

    public void viewIssuedBooks() {
        for (IssueRecord r : issuedBooks) {
            System.out.println("Book ID: " + r.getBookId() +
                               " issued to Member ID: " + r.getMemberId());
        }
    }
}
