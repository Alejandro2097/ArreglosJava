package test.exception;

public class DivisionPorCeroException extends Exception {

	public DivisionPorCeroException() {
		super();
	}

	public DivisionPorCeroException(String message, Throwable cause) {
		super(message, cause);
	}

	public DivisionPorCeroException(String message) {
		super(message);
	}

	public DivisionPorCeroException(Throwable cause) {
		super(cause);
	}
}
