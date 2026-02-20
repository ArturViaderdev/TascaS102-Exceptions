package Nivell3;

import java.util.Objects;

public class Seat {
    private int row;
    private int seat;
    private String personName;

    public Seat(int row, int seat, String personName)
    {
        this.row=row;
        this.seat = seat;
        this.personName = personName;
    }

    public Seat(int row,int seat)
    {
        this.row=row;
        this.seat=seat;
    }

    @Override
    public String toString()
    {
        return ("Persona - " + personName + " Fila - " + Integer.toString(row) + " Seient - " + Integer.toString(seat));
    }

    public int getRow()
    {
        return row;
    }

    public int getSeat()
    {
        return seat;
    }

    public String getPersonName()
    {
        return personName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Seat seat1 = (Seat) o;
        return row == seat1.row && seat == seat1.seat;
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, seat);
    }
}
