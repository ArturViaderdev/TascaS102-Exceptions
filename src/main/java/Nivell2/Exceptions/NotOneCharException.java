package Nivell2.Exceptions;

public class NotOneCharException extends Exception{
    public NotOneCharException()
    {
        super("Has introduit més o menys de 1 caracter.");
    }
}
