package _2_POO.Exceptions;

import _2_POO.Interfaces.Car;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
//        List<Integer> numbers = new ArrayList<>();
//
//        numbers.add(1);
//        numbers.add(2);
//
//        try {
//            numbers.get(5);
//
//        }catch (Exception e){
//            System.out.println("No se pudo");
//        }

        try {
            Carrito carrito = new Carrito();
            carrito.addProduct(new Products("Iphone 16", 1000.0));
            carrito.addProduct(new Products("Iphone 16 pro", 1100.0));
            carrito.addProduct(null);
        }catch (Exception e){
            System.out.println("Existe un producto nulo.");;
        }
    }
}
