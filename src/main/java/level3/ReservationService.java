package level3;

import level3.exceptions.*;

import java.util.ArrayList;
import java.util.List;

public class ReservationService {
    private final int totalRows;
    private final int seatsPerRow;
    private final List<Seat> seats;

    public ReservationService(int seatsPerRow, int totalRows)
    {
        seats = new ArrayList<>();
        this.seatsPerRow = seatsPerRow;
        this.totalRows = totalRows;
    }

    public void reserveSeat(int row, int seat, String name){
        validateSeatPosition(row,seat);
        seats.add(new Seat(row,seat,name));
    }

    public void cancelSeat(int row, int seat)
    {
        int posicio = getPositionSeat(row,seat);
        seats.remove(posicio);
    }

    public void cancelAllByPerson(String name)
    {
        if(seats.isEmpty())
        {
            throw new NoSeatsReservedException("No hi ha butaques reservades.");
        }
        int cont=0;
        int contPersons=0;
        while(cont<seats.size())
        {
            if(seats.get(cont).getPersonName().equals(name))
            {
                seats.remove(cont);
                contPersons++;
            }
            else
            {
                cont++;
            }
        }
       if(contPersons==0)
       {
           throw new NoSeatsReservedException("No hi ha butaques reservades per a aquesta persona.");
       }
    }

    public List<Seat> getAllSeats()
    {
        if(seats.isEmpty())
        {
            throw new NoSeatsReservedException("No hi ha butaques reservades.");
        }
        else
        {
            return seats;
        }
    }

    public List<Seat> getSeatsByPerson(String name)
    {
        int cont, contPerson = 0;
        List<Seat> seatsPerson = new ArrayList<>();
        for(cont=0;cont<seats.size();cont++)
        {
            if(seats.get(cont).getPersonName().equals(name))
            {
                seatsPerson.add(seats.get(cont));
                contPerson++;
            }
        }
        if(contPerson==0)
        {
            throw new InvalidPersonNameException("No es troba la persona al cinema.");
        }
        return seatsPerson;
    }

    public void checkValidPosition(int row, int seat)
    {
        if(!(row>=0 && row<=totalRows && seat>=0 && seat<=seatsPerRow))
        {
            throw new InvalidSeatException("Posició fora de rang.");
        }
    }

    private void validateSeatPosition(int row,int seat) {
        boolean exit = false;
        boolean found = false;
        int cont =0;
        checkValidPosition(row,seat);
        System.out.println("Posició vàlida");
        Seat seatValidate = new Seat(row,seat);
        while(!exit)
        {
            if(cont<seats.size())
            {
                if(seatValidate.equals(seats.get(cont)))
                {
                    found = true;
                    exit = true;
                }
                else
                {
                    cont++;
                }
            }
            else
            {
                exit = true;
            }
        }
        if(found)
        {
            throw new AlreadyTakenException("Seient ja reservat amb anterioritat");
        }
    }

    private int getPositionSeat(int row, int seat){
        boolean exit = false;
        boolean found = false;
        int cont = 0;
        checkValidPosition(row,seat);
        System.out.println("Posició vàlida");
        Seat seatValidate = new Seat(row,seat);

        while(!exit)
        {
            if(cont<seats.size())
            {
                if(seatValidate.equals(seats.get(cont)))
                {
                    found = true;
                    exit = true;
                }
                else
                {
                    cont++;
                }
            }
            else
            {
                exit = true;
            }
        }
        if(found)
        {
            return cont;
        }
        else
        {
            throw new SeatFreeException("La butaca està lliure.");
        }
    }
}
