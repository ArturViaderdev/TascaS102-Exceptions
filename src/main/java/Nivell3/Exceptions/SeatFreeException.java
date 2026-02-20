package Nivell3.Exceptions;

public class SeatFreeException extends RuntimeException {
    public SeatFreeException()
    {
        super("La butaca està lliure.");
    }
}
