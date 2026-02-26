package level1;

import level1.exceptions.EmptySaleException;

import java.util.ArrayList;
import java.util.List;

public class Sale {
    private List<Product> productList;
    private double totalPrice;

    private void setTotalPrice(Double price)
    {
        totalPrice = price;
    }

    public Double getTotalPrice()
    {
        return totalPrice;
    }

    public void calculateTotal()
    {
        if(productList.isEmpty())
        {
            setTotalPrice(0.0);
            throw new EmptySaleException("The shopping cart is empty.");
        }

        Double total=0.0;
        for(Product product:productList)
        {
            total += product.getPrice();
        }

        setTotalPrice(total);


        System.out.println("El total és de: " + getTotalPrice().toString());
        //Obtenim un producte inexistent perque faci error
    }

    public void getInexistentPosition()
    {
        Product inexistent = productList.get(-1);
    }

    public Sale()
    {
        productList = new ArrayList<Product>();
    }

    public void addProduct(Product producte)
    {
        productList.add(producte);
    }
}
