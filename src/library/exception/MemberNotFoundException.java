package library.exception;

/**
 * Thrown when member ID is not found.
 */
public class MemberNotFoundException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MemberNotFoundException(String message) {
        super(message);
    }
}
