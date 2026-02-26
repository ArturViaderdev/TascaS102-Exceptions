package level3.exceptions;

public class InvalidPersonNameException extends RuntimeException{
    public InvalidPersonNameException(String message)
    {
        super(message);
    }
}
