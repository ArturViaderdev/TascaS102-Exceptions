package level3.exceptions;

public class InvalidSeatException extends RuntimeException{
    public InvalidSeatException()
    {
        super("Posició fora de rang.");
    }
}
