package Nivell3;

public class ConsoleUI {
    ReservationService reserva;

    public ConsoleUI(ReservationService reserva)
    {
        this.reserva = reserva;
    }

    public void start()
    {
        showMenu();
        int opcio = Reader.readInt("Sel.lecciona una opció.",false);
        switch (opcio) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            default:
                System.out.println("Opció incorrecta.");}

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
