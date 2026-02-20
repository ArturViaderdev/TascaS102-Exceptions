package Nivell3;

import Nivell3.Exceptions.EmptyNumberException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Reader {
    public static int readInt(String message, boolean testzero)
    {
        int number;
        while(true)
        {
            try
            {
                System.out.println(message);
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
                if(testzero)
                {
                    if(number>0)
                    {
                        return number;
                    }
                    else
                    {
                        throw new EmptyNumberException();
                    }
                }
            }
            catch (InputMismatchException ex)
            {
                System.out.println("Entrada incorrecta.");
            } catch (EmptyNumberException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static String readString(String message)
    {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
