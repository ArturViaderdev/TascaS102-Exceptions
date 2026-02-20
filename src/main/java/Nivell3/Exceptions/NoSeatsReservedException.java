package Nivell3.Exceptions;

public class NoSeatsReservedException extends RuntimeException{
    public NoSeatsReservedException(){
        super("No hi ha butaques reservades.");
    }
}
