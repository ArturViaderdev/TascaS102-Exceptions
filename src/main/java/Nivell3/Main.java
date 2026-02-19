package Nivell3;

import Nivell3.Exceptions.EmptyNumber;

public class Main {
    private static int files;
    private static int seients;
    public static void main(String[] args)
    {
        files = Reader.readInt("Quantes files te la sala?",true);
        seients = Reader.readInt("Quants seients per fila te la sala",true);
        ReservationService reserva = new ReservationService(files, seients);
        ConsoleUI consola = new ConsoleUI(reserva);
        consola.start();
    }


}
