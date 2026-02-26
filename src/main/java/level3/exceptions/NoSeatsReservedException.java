package level3.exceptions;

public class NoSeatsReservedException extends RuntimeException{
    public NoSeatsReservedException(){
        super("No hi ha butaques reservades.");
    }
}
