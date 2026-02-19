package Nivell1;

import Nivell1.Exceptions.EmtySaleException;

import java.util.ArrayList;

public class Sale {
    private ArrayList<Product> list;
    private Double totalPrice;

    private void setTotalPrice(Double price)
    {
        totalPrice = price;
    }

    public Double getTotalPrice()
    {
        return totalPrice;
    }

    public void calculateTotal() throws Exception
    {
        if(list.size()==0)
        {
            setTotalPrice(0.0);
            throw new EmtySaleException();
        }
        else
        {
            Double total=0.0;
            for(int cont=0;cont<list.size();cont++)
            {
                total+=list.get(cont).getPrice();
            }
            setTotalPrice(total);
        }

        System.out.println("El total és de: " + getTotalPrice().toString());
        //Obtenim un producte inexistent perque faci error
        Product inexistent = list.get(-1);
    }

    public Sale()
    {
        list = new ArrayList<>();
    }

    public void addProduct(Product producte)
    {
        list.add(producte);
    }
}
