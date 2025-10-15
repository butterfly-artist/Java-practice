package demo;

public class CreditsNotSufficientException extends Exception {
    public CreditsNotSufficientException(String message) {
        super(message);
    }
}
