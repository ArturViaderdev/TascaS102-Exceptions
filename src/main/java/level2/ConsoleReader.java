package level2;

import level2.exceptions.MinimumLengthException;
import level2.exceptions.NoSymbolsException;
import level2.exceptions.NotOneCharException;
import level2.exceptions.NotSOrNException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleReader {
    private static final Scanner scanner = new Scanner(System.in);

    public static byte readByte(String message)
    {
        while(true)
        {
            System.out.println(message);
            try
            {
                byte oneByte = scanner.nextByte();
                return oneByte;
            }
            catch (InputMismatchException ex) {
                System.out.println("Entrada incorrecta.");
                scanner.nextLine();

            }
        }
    }

    public static void spendNextLine()
    {
        scanner.nextLine();
    }

    public static int readInt(String message)
    {
        int number;
        while(true)
        {
            System.out.println(message);
            try
            {
                number = scanner.nextInt();
                return number;
            }
            catch (InputMismatchException ex)
            {
                System.out.println("Entrada incorrecta.");
                scanner.nextLine();
            }
        }
    }

    public static float readFloat(String message)
    {
        float number;
        while(true)
        {
            System.out.println(message);
            try
            {
                number = scanner.nextFloat();
                return number;
            }
            catch (InputMismatchException ex)
            {
                System.out.println("Entrada incorrecta.");
                scanner.nextLine();

            }
        }
    }
    public static double readDouble(String message)
    {
        double number;
        while(true)
        {
            System.out.println(message);
            try
            {
                number = scanner.nextDouble();
                return number;
            }
            catch (InputMismatchException ex)
            {
                System.out.println("Entrada incorrecta.");
                scanner.nextLine();
            }
        }
    }

    public static char readChar(String message) {
        while(true)
        {
            System.out.println(message);
            String cadena = scanner.nextLine();
            try {
                if (cadena.length() == 1) {
                    return cadena.charAt(0);
                } else {
                    throw new NotOneCharException("La entrada no te un caràcter.");
                }
            }
            catch(NotOneCharException ex)
            {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static String readString(String message)
    {
        while(true)
        {
            System.out.println(message);
            String cadena = scanner.nextLine();
            try
            {
                if(cadena.length()>=4)
                {
                    if(!thereAreSymbols(cadena))
                    {
                        return cadena;
                    }
                    else
                    {
                        throw new NoSymbolsException("Només pots posar lletres i números, no posis símbols.");
                    }
                }
                else
                {
                   throw new MinimumLengthException("Has de posar mínim 4 caràcters.");
                }
            }
            catch(MinimumLengthException | NoSymbolsException exception)
            {
                System.out.println(exception.getMessage());
            }
        }
    }



    private static boolean thereAreSymbols(String cadena)
    {
        boolean foundSymbol = false;
        for(int count=0;count<cadena.length();count++)
        {
            if(!(Character.isLetterOrDigit(cadena.charAt(count)))) {
                foundSymbol = true;
                break;
            }
        }
        return foundSymbol;
    }

    public static boolean readYesNo(String message)
    {
        while(true)
        {
            System.out.println(message);
            String cadena = scanner.nextLine();
            try
            {
                if(cadena.length()!=1)
                {
                    throw new NotOneCharException("Has introduït més o menys de 1 caràcter.");
                }
                else
                {
                    if(cadena.charAt(0)=='s')
                    {
                        return true;
                    }
                    else if(cadena.charAt(0)=='n')
                    {
                        return false;
                    }
                    else
                    {
                        throw new NotSOrNException("No has introduït s o n");
                    }
                }
            }
            catch(NotOneCharException | NotSOrNException exception){
                System.out.println(exception.getMessage());
            }
        }
    }
}

