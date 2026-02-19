package Nivell2;

import Nivell2.Exceptions.MiniumLengthException;
import Nivell2.Exceptions.NoSymbolsException;
import Nivell2.Exceptions.NotOneCharException;
import Nivell2.Exceptions.NotSOrNException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleReader {
    public static byte readByte(String message)
    {
        byte interruptor;
        while(true)
        {
            try
            {
                System.out.println(message);
                Scanner scanner = new Scanner(System.in);
                interruptor = scanner.nextByte();
                return interruptor;
            }
            catch (InputMismatchException ex) {
                System.out.println("Entrada incorrecta.");
            }
        }
    }

    public static int readInt(String message)
    {
        int number;
        while(true)
        {
            try
            {
                System.out.println(message);
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
                return number;
            }
            catch (InputMismatchException ex)
            {
                System.out.println("Entrada incorrecta.");
            }
        }
    }

    public static float readFloat(String message)
    {
        float number;
        while(true)
        {
            try
            {
                System.out.println(message);
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextFloat();
                return number;
            }
            catch (InputMismatchException ex)
            {
                System.out.println("Entrada incorrecta.");
            }
        }
    }
    public static double readDouble(String message)
    {
        double number;
        while(true)
        {
            try
            {
                System.out.println(message);
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextDouble();
                return number;
            }
            catch (InputMismatchException ex)
            {
                System.out.println("Entrada incorrecta.");
            }
        }
    }

    public static char readChar(String message) {
        while(true)
        {
            try
            {
                System.out.println(message);
                Scanner scanner = new Scanner(System.in);
                String cadena = scanner.nextLine();
                if(cadena.length()!=1)
                {
                    throw new NotOneCharException();
                }
                else
                {
                    return cadena.charAt(0);
                }
            }
            catch(NotOneCharException exception)
            {
                System.out.println(exception.getMessage());
            }
        }
    }

    public static String readString(String message)
    {
        while(true)
        {
            try
            {
                System.out.println(message);
                Scanner scanner = new Scanner(System.in);
                String cadena = scanner.nextLine();
                if(cadena.length()>=4)
                {
                    if(!therearesymbols(cadena))
                    {
                        return cadena;
                    }
                    else
                    {
                        throw new NoSymbolsException();
                    }
                }
                else
                {
                   throw new MiniumLengthException();
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
            try
            {
                System.out.println(message);
                Scanner scanner = new Scanner(System.in);
                String cadena = scanner.nextLine();
                if(cadena.length()!=1)
                {
                    throw new NotOneCharException();
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
                        throw new NotSOrNException();
                    }
                }
            }
            catch(NotOneCharException exception)
            {
                System.out.println(exception.getMessage());
            } catch (NotSOrNException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}

