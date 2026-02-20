package Nivell3;

import java.util.List;

public class ConsoleUI {
    private ReservationService reserva;

    public ConsoleUI(ReservationService reserva)
    {
        this.reserva = reserva;
    }

    public void start()
    {
        boolean sal = false;
        while(!sal)
        {
            showMenu();
            int opcio = Reader.readInt("Sel.lecciona una opció.",false);
            switch (opcio) {
                case 0:
                    sal=true;
                case 1:
                    showAllReservedSeats();
                    break;
                case 2:
                    showPersonReservedSeats();
                    break;
                case 3:
                    reserveSeat();
                    break;
                case 4:
                    cancelReserve();
                    break;
                case 5:
                    cancelPerson();
                    break;
                default:
                    System.out.println("Opció incorrecta.");}
        }
    }

    private void cancelPerson()
    {
        String person = Reader.readString("Introdueix el nom de la persona.");
        try
        {
            reserva.cancelAllByPerson(person);
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }

    }

    private void cancelReserve()
    {
        int row = Reader.readInt("Introdueix la fila.",true);
        int seat = Reader.readInt("Introdueix la butaca",true);
        try
        {
            reserva.cancelSeat(row,seat);
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    private void reserveSeat()
    {
        int row = Reader.readInt("Introdueix la fila.",true);
        int seat = Reader.readInt("Introdueix la butaca",true);
        try
        {
            reserva.checkValidPosition(row,seat);
            String person = Reader.readString("Introdueix el nom de la persona.");
            reserva.reserveSeat(row,seat,person);
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }

    }

    private void showPersonReservedSeats()
    {
        String person = Reader.readString("Introdueix el nom de la persona");
        try
        {
            List<Seat> seats = reserva.getSeatsByPerson(person);
            for(int cont=0;cont<seats.size();cont++)
            {
                System.out.println(seats.get(cont).toString());
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }

    }

    private void showAllReservedSeats()
    {
        List<Seat> seats = reserva.getAllSeats();
        for(int cont=0;cont<seats.size();cont++)
        {
            System.out.println(seats.get(cont).toString());
        }
    }

    private static void showMenu()
    {
        System.out.println("1.- Mostrar totes les butaques reservades.");
        System.out.println("2.- Mostrar les butaques reservades per una persona.");
        System.out.println("3.- Reservar una butaca.");
        System.out.println("4.- Anul·lar la reserva d’una butaca.");
        System.out.println("5.- Anul·lar totes les reserves d’una persona.");
        System.out.println("0.- Sortir.");

    }
}
