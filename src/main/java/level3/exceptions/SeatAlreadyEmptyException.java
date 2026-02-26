package level3.exceptions;

public class SeatAlreadyEmptyException extends RuntimeException{
    public SeatAlreadyEmptyException()
    {
        super("El seient no està reservat.");
    }
}
