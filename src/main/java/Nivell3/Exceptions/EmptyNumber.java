package Nivell3.Exceptions;

public class EmptyNumber extends Exception{
    public EmptyNumber()
    {
        super("Has introduit un nombre menor que 1 i no pot esser.");
    }
}
