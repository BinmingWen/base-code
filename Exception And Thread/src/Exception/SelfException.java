package Exception;

public class SelfException extends RuntimeException {
    public SelfException(){}

    public SelfException(String s) {
        super(s);
    }

}

