package Nivell2;

public class Main {
    public static void main(String[] args)
    {
        byte interruptor = ConsoleReader.readByte("Introdueix un byte");
        System.out.println(interruptor);
        int nombre = ConsoleReader.readInt("Introdueix un nombre enter.");
        System.out.println("Has introduit " + Integer.toString(nombre));
        float nombref = ConsoleReader.readFloat("Introdueix un nombre amb decimals float");
        System.out.println("Has introduit " + Float.toString(nombref));
        double nombred = ConsoleReader.readDouble("Introdueix un nombre amb decimals double.");
        System.out.println("Has introduit " + Double.toString(nombred));
        char caracter = ConsoleReader.readChar("Introdueix un caracter:");
        System.out.println("Has introduit " + caracter);
        String word = ConsoleReader.readString("Introdueix una paraula de mínim 4 lletres sense símbols.");
        System.out.println("Has introduit " + word);
        if(ConsoleReader.readYesNo("Introdueix s o n."))
        {
            System.out.println("Has introduit s");
        }
        else
        {
            System.out.println("Has introduit n");
        }
    }
}
