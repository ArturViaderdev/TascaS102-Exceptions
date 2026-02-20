package Nivell3.Exceptions;

public class InvalidSeatException extends RuntimeException{
    public InvalidSeatException()
    {
        super("Posició fora de rang.");
    }
}
