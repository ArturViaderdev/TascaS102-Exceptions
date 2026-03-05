package level3;

public class Main {
    private static int rows;
    private static int seatsPerRow;
    public static void main(String[] args)
    {
        rows = Reader.readInt("Quantes files te la sala?",true);
        seatsPerRow = Reader.readInt("Quants seients per fila te la sala",true);
        ReservationService reserva = new ReservationService(seatsPerRow, rows);
        ConsoleUI consola = new ConsoleUI(reserva);
        consola.start();
    }
}
