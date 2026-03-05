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
        if (getPositionSeat(row,seat) == -1)
        {
            seats.add(new Seat(row,seat,name));
        }
        else
        {
            throw new AlreadyTakenException("El seient ja ha estat reservat amb anterioritat.");
        }
    }

    public void cancelSeat(int row, int seat)
    {
        int position = getPositionSeat(row,seat);
        if(position!=-1)
        {
            seats.remove(position);
        }
        else
        {
            throw new SeatFreeException("La butaca no està reservada.");
        }

    }

    public void cancelAllByPerson(String name)
    {
        if(seats.isEmpty())
        {
            throw new NoSeatsReservedException("No hi ha butaques reservades.");
        }
        int count=0;
        int countPersons=0;
        while(count<seats.size())
        {
            if(seats.get(count).getPersonName().equals(name))
            {
                seats.remove(count);
                countPersons++;
            }
            else
            {
                count++;
            }
        }
       if(countPersons==0)
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
        int count, countPerson = 0;
        List<Seat> seatsPerson = new ArrayList<>();
        for(count=0;count<seats.size();count++)
        {
            if(seats.get(count).getPersonName().equals(name))
            {
                seatsPerson.add(seats.get(count));
                countPerson++;
            }
        }
        if(countPerson==0)
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

    private int getPositionSeat(int row, int seat){
        boolean found=false;
        checkValidPosition(row,seat);
        Seat seatValidate = new Seat(row,seat);
        int count;
        for(count = 0;count<seats.size();count++)
        {
            if(seatValidate.equals(seats.get(count)))
            {
                found=true;
                break;
            }
            else
            {
                count++;
            }
        }
        if(found)
        {
           return count;
        }
        else
        {
            return -1;
        }
    }
}
