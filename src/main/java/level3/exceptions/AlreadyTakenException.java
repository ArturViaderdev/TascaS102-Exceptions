package level3.exceptions;

public class AlreadyTakenException extends RuntimeException{
    public AlreadyTakenException(String message)
    {
        super(message);
    }
}
