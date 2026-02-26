package level3.exceptions;

public class EmptyNumberException extends RuntimeException{
    public EmptyNumberException()
    {
        super("Has introduit un nombre menor que 1 i no pot esser.");
    }
}
