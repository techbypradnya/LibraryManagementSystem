package library.exception;

/**
 * Thrown when book quantity is zero.
 */
public class BookNotAvailableException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BookNotAvailableException(String message) {
        super(message);
    }
}
