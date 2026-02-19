package Nivell1;

public class Main {
    public static void main(String[] args)
    {
        Sale sale = new Sale();
        try
       {
            sale.calculateTotal();
       }
        catch(Exception ex) //Excepció genèrica
        {
            System.out.println(ex.getMessage());
        }
        Product product = new Product("Producte",10.0);
        sale.addProduct(product);
        try
        {
            sale.calculateTotal();
        }
        catch(IndexOutOfBoundsException ex)
        {
            System.out.println("S'ha intentat accedir a un element inexistent");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
