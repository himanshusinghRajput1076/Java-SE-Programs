package exceptionHandling;

public class custom1Exception {
    static class InvalidNumeratorException extends Exception {
        public InvalidNumeratorException(String message) {
            super(message);
        }
    }
}
