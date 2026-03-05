package level2;

public class Main {
    public static void main(String[] args)
    {
        byte oneByte = ConsoleReader.readByte("Introdueix un byte");
        System.out.println(oneByte);
        int number = ConsoleReader.readInt("Introdueix un nombre enter.");
        System.out.println("Has introduït " + Integer.toString(number));
        float numberFloat = ConsoleReader.readFloat("Introdueix un nombre amb decimals float");
        System.out.println("Has introduït " + Float.toString(numberFloat));
        double numberDouble = ConsoleReader.readDouble("Introdueix un nombre amb decimals double.");
        System.out.println("Has introduït " + Double.toString(numberDouble));
        ConsoleReader.spendNextLine();
        char caracter = ConsoleReader.readChar("Introdueix un caràcter:");
        System.out.println("Has introduït " + caracter);
        String word = ConsoleReader.readString("Introdueix una paraula de mínim 4 lletres sense símbols.");
        System.out.println("Has introduït " + word);
        if(ConsoleReader.readYesNo("Introdueix s o n."))
        {
            System.out.println("Has introduït s");
        }
        else
        {
            System.out.println("Has introduït n");
        }
    }
}
