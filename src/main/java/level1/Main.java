package level1;

import level1.exceptions.EmptySaleException;

public class Main {
    public static void main(String[] args)
    {
        Sale sale = new Sale();
        try
       {
            sale.calculateTotal();
       }
        catch(EmptySaleException ex)
        {
            System.out.println(ex.getMessage());
        }
        Product product = new Product("Producte",10.0);
        sale.addProduct(product);
        sale.calculateTotal();
        double totalPrice = sale.getTotalPrice();
        System.out.println("El total és de: " + Double.toString(totalPrice));
        try
        {
            sale.getInexistentPosition();
        }
        catch(IndexOutOfBoundsException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
