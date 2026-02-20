package Nivell3.Exceptions;

public class AlreadyTakenException extends RuntimeException{
    public AlreadyTakenException()
    {
        super("Seient ja reservat amb anterioritat");
    }
}
