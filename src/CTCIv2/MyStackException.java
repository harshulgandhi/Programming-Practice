package CTCIv2;

public class MyStackException extends RuntimeException {
	MyStackException() {
		super("Stack is empty");
	}
	MyStackException(String message) {
		super(message);
	}
}
