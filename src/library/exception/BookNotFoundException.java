package library.exception;

/**
 * Thrown when book ID is not found.
 */
public class BookNotFoundException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BookNotFoundException(String message) {
        super(message);
    }
}
