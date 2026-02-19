package Nivell3;

import Nivell3.Exceptions.AlreadyReserved;

import java.util.List;

public class ReservationService {
    private int totalRows;
    private int seatsPerRow;
    private List<Seat> seats;

    public ReservationService(int seatsPerRow, int totalRows)
    {
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

    private void reserveSeat(int row, int seat, String name) throws AlreadyReserved {
        if(!reservedSeat(row,seat))
        {
            seats.add(new Seat(row,seat,name));
        }
        else
        {
            throw new AlreadyReserved();

        }
    }

    private boolean reservedSeat(int row, int seat)
    {
        boolean sal = false;
        boolean encontrado = false;
        int cont = 0;
        while(!sal)
        {
            if(cont<seats.size())
            {
                if(seats.get(cont).getSeat() == seat && seats.get(cont).getRow() == row)
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
        return encontrado;
    }
}
