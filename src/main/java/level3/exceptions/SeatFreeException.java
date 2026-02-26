package level3.exceptions;

public class SeatFreeException extends RuntimeException {
    public SeatFreeException()
    {
        super("La butaca està lliure.");
    }
}
