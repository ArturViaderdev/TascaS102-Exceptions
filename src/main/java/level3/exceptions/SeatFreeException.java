package level3.exceptions;

public class SeatFreeException extends RuntimeException {
    public SeatFreeException(String message)
    {
        super(message);
    }
}
