package Nivell1.Exceptions;

public class EmtySaleException extends Exception{
    public EmtySaleException()
    {
        super("Per fer una venda primer has d’afegir productes");
    }
}
