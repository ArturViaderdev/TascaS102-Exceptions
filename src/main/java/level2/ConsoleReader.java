package level2;

import level2.exceptions.MiniumLengthException;
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
                byte interruptor = scanner.nextByte();
                return interruptor;
            }
            catch (InputMismatchException ex) {
                System.out.println("Entrada incorrecta.");
                scanner.nextLine();

            }
            finally
            {
                scanner.nextLine();
            }
        }
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

            }
            finally
            {
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

            }
            finally
            {
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

            }
            finally
            {
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
                    throw new NotOneCharException("La entrada no te un caracter.");
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
                    if(!therearesymbols(cadena))
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
                   throw new MiniumLengthException("Has de posar mínim 4 caracters.");
                }
            }
            catch(MiniumLengthException exception)
            {
                System.out.println(exception.getMessage());
            }
            catch(NoSymbolsException exception)
            {
                System.out.println(exception.getMessage());
            }
        }
    }

    private static boolean therearesymbols(String cadena)
    {
        String letters ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int conta=0;

        boolean sal = false;
        boolean encontrado = false;
        while(!sal)
        {
            if(conta<cadena.length())
            {
                String letra = "";
                letra = letra + cadena.charAt(conta);
                if(letters.contains(letra))
                {
                    conta++;
                }
                else
                {
                    encontrado = true;
                    sal = true;
                }
            }
            else
            {
                sal=true;
            }
        }
        return encontrado;
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
                    throw new NotOneCharException("Has introduit més o menys de 1 caracter.");
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
                        throw new NotSOrNException("No has introduit s o n");
                    }
                }
            }
            catch(NotOneCharException | NotSOrNException exception){
                System.out.println(exception.getMessage());
            }
        }
    }
}

