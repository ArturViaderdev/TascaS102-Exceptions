package level3;

import level3.exceptions.EmptyNumberException;
import level3.exceptions.NumbersInNameException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Reader {
    private static final Scanner scanner = new Scanner(System.in);
    public static int readInt(String message, boolean testzero)
    {
        int number;
        while(true)
        {
            try
            {
                System.out.println(message);
                number = scanner.nextInt();
                if(testzero)
                {
                    if(number>0)
                    {
                        return number;
                    }
                    else
                    {
                        throw new EmptyNumberException("Has introduit un nombre menor que 1 i no pot esser.");
                    }
                }
                else
                {
                    return number;
                }
            }
            catch (InputMismatchException ex)
            {
                System.out.println("Entrada incorrecta.");
                scanner.nextLine();
            } catch (EmptyNumberException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void spendNextLine()
    {
        scanner.nextLine();
    }

    public static String readString(String message)
    {
        while(true) {
            try {
                System.out.println(message);
                String text = scanner.nextLine();
                String numeros = "0123456789";
                boolean exit = false;
                boolean found = false;
                boolean exitB = false;
                int cont = 0;
                int contB;
                while (!exit) {
                    if (cont < text.length()) {
                        contB = 0;
                        exitB = false;
                        while (!exitB) {
                            if (contB < numeros.length()) {
                                if (numeros.charAt(contB) == text.charAt(cont)) {
                                    found = true;
                                    exitB = true;
                                    exit = true;
                                } else {
                                    contB++;
                                }
                            } else {
                                exitB = true;
                            }
                        }
                        if (!found) {
                            cont++;
                        }
                    } else {
                        exit = true;
                    }
                }
                if (found) {
                    throw new NumbersInNameException("Has posat números al nom. Error.");
                } else {
                    return text;
                }
            } catch(Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
