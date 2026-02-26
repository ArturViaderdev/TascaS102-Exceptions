package level3.exceptions;

public class NoSeatsReservedException extends RuntimeException{
    public NoSeatsReservedException(String message){
        super(message);
    }
}
