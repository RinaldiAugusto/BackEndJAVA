package _2_POO.Exceptions;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);

        try {
            numbers.get(5);

        }catch (Exception e){
            System.out.println("No se pudo");
        }
    }
}
