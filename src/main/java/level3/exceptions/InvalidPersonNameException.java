package level3.exceptions;

public class InvalidPersonNameException extends RuntimeException{
    public InvalidPersonNameException()
    {
        super("No es troba la persona al cinema.");
    }
}
