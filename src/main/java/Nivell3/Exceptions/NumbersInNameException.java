package Nivell3.Exceptions;

public class NumbersInNameException extends RuntimeException{
    public NumbersInNameException()
    {
        super("Has posat números al nom. Error.");
    }
}
