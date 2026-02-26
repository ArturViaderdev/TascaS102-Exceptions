package level3.exceptions;

public class AlreadyTakenException extends RuntimeException{
    public AlreadyTakenException()
    {
        super("Seient ja reservat amb anterioritat");
    }
}
