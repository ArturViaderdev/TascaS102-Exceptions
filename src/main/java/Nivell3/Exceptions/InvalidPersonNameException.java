package Nivell3.Exceptions;

public class InvalidPersonNameException extends RuntimeException{
    public InvalidPersonNameException()
    {
        super("No es troba la persona al cinema.");
    }
}
