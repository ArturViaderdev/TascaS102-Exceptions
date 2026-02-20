package Nivell3.Exceptions;

public class SeatAlreadyEmptyException extends RuntimeException{
    public SeatAlreadyEmptyException()
    {
        super("El seient no està reservat.");
    }
}
