package Nivell3;

import Nivell3.Exceptions.EmptyNumberException;
import Nivell3.Exceptions.NumbersInNameException;

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
                else
                {
                    return number;
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
        while(true) {
            try {


                System.out.println(message);
                Scanner scanner = new Scanner(System.in);
                String text = scanner.nextLine();
                String numeros = "0123456789";
                boolean sal = false;
                boolean encontrado = false;
                boolean salb = false;
                int cont = 0;
                int contb;
                while (!sal) {
                    if (cont < text.length()) {
                        contb = 0;
                        salb = false;
                        while (!salb) {
                            if (contb < numeros.length()) {
                                if (numeros.charAt(contb) == text.charAt(cont)) {
                                    encontrado = true;
                                    salb = true;
                                    sal = true;
                                } else {
                                    contb++;
                                }
                            } else {
                                salb = true;
                            }
                        }
                        if (!encontrado) {
                            cont++;
                        }
                    } else {
                        sal = true;
                    }
                }
                if (encontrado) {
                    throw new NumbersInNameException();
                } else {
                    return text;
                }
            } catch(Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
