package edu.jose.challengeControlFlow;

public class InvalidParametersException extends Exception {
    public InvalidParametersException(String msg) {
        super(msg);
    }
    public InvalidParametersException(String msg, Throwable cause) {
        super(msg,cause);
    }
    public InvalidParametersException() {
        super("The second parameter must be greater than the first.");
    }


}
