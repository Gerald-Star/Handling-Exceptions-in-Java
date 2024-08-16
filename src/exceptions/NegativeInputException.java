package exceptions;

public class NegativeInputException extends Exception {
    public NegativeInputException() {
        this("Input must be greater than 0.");
    }
    public NegativeInputException(String message) {
        super("Negative input exception.");
    }
    
}
