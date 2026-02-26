package level3.exceptions;

public class NumbersInNameException extends RuntimeException{
    public NumbersInNameException()
    {
        super("Has posat números al nom. Error.");
    }
}
