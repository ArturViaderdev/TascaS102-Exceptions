package Nivell3;

import Nivell3.Exceptions.*;

import java.util.ArrayList;
import java.util.List;

public class ReservationService {
    private int totalRows;
    private int seatsPerRow;
    private List<Seat> seats;

    public ReservationService(int seatsPerRow, int totalRows)
    {
        seats = new ArrayList<>();
        this.seatsPerRow = seatsPerRow;
        this.totalRows = totalRows;
    }

    public int getSeatsPerRow()
    {
       return seatsPerRow;
    }

    public int getTotalRowss()
    {
        return totalRows;
    }

    public void reserveSeat(int row, int seat, String name){
        validateSeatPosition(row,seat);
        seats.add(new Seat(row,seat,name));
    }

    public void cancelSeat(int row, int seat) throws Exception
    {
        try
        {
            int posicio = getPositionSeat(row,seat);
            seats.remove(posicio);
        }
        catch(Exception ex)
        {
            System.out.printf(ex.getMessage());
        }

    }

    public void cancelAllByPerson(String name)
    {
        int cont=0;
        while(cont<seats.size())
        {
            if(seats.get(cont).getPersonName().equals(name))
            {
                seats.remove(cont);
            }
            else
            {
                cont++;
            }
        }
    }

    public List<Seat> getAllSeats()
    {
        return seats;
    }

    public List<Seat> getSeatsByPerson(String name)
    {
        int cont=0;
        List<Seat> seatsperson = new ArrayList<>();
        int contperson = 0;
        for(cont=0;cont<seats.size();cont++)
        {
            if(seats.get(cont).getPersonName().equals(name))
            {
                seatsperson.add(seats.get(cont));
                contperson++;
            }
        }
        if(contperson==0)
        {
            throw new InvalidPersonNameException();
        }
        return seatsperson;
    }

    public void checkValidPosition(int row, int seat)
    {
        if(!(row>=0 && row<=totalRows && seat>=0 && seat<=seatsPerRow))
        {
            throw new InvalidSeatException();
        }
    }

    private void validateSeatPosition(int row,int seat) {
        boolean sal = false;
        boolean encontrado = false;
        int cont =0;
        checkValidPosition(row,seat);
        System.out.println("Posicio vàlida");
        Seat seatValidate = new Seat(row,seat,"");
        while(!sal)
        {
            if(cont<seats.size())
            {
                if(seatValidate.equals(seats.get(cont)))
                {
                    encontrado = true;
                    sal = true;
                }
                else
                {
                    cont++;
                }
            }
            else
            {
                sal = true;
            }
        }
        if(encontrado)
        {
            throw new AlreadyTakenException();
        }
    }

    private int getPositionSeat(int row, int seat){
        boolean sal = false;
        boolean encontrado = false;
        int cont = 0;
        checkValidPosition(row,seat);
        System.out.println("Posicio vàlida");
        Seat seatValidate = new Seat(row,seat,"");

        while(!sal)
        {
            if(cont<seats.size())
            {
                if(seatValidate.equals(seats.get(cont)))
                {
                    encontrado = true;
                    sal = true;
                }
                else
                {
                    cont++;
                }
            }
            else
            {
                sal = true;
            }
        }
        if(encontrado)
        {
            return cont;
        }
        else
        {
            throw new SeatFreeException();
        }
    }
}
