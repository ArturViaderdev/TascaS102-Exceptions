package Nivell3;

import Nivell3.Exceptions.EmptyNumber;

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
                        throw new EmptyNumber();
                    }
                }
            }
            catch (InputMismatchException ex)
            {
                System.out.println("Entrada incorrecta.");
            } catch (EmptyNumber e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
