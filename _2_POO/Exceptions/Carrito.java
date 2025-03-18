package _2_POO.Exceptions;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<Products> productsList;

    public Carrito(){
        productsList = new ArrayList<>();
    }
    public void addProduct(Products products)throws Exception{
        if (products == null){
            throw new CarritoExceptions("El producto es nulo");
        }
        productsList.add(products);
    }

}
