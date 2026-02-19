package Nivell3;

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

    public String toString()
    {
        return ("Persona - " + personName + " Fila - " + Integer.toString(row) + " Seient - " + Integer.toString(seat));
    }

    public boolean equals(Seat seat)
    {
        return this==seat;
    }

    public int getRow()
    {
        return row;
    }

    public int getSeat()
    {
        return seat;
    }
}
