package Nivell2.Exceptions;

public class NoSymbolsException extends Exception {
    public NoSymbolsException()
    {
        super("Només pots posar lletres i números, no posis símbols.");
    }
}
