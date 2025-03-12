package _2_POO.Colecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args){

        // creacion
        List<Integer> numberList = new ArrayList<>();
        Set<Integer> numberSet = new HashSet<>();

        // add
        numberList.add(10);
        numberList.add(9);
        numberList.add(8);
        numberSet.add(7);
        numberSet.add(6);
        numberSet.add(5);

        // size
        System.out.println("Size");

        System.out.println(numberList.size());
        System.out.println(numberSet.size());

        // get
        System.out.println();
        System.out.println("get");

        System.out.println(numberList.get(0));

        // iter
        System.out.println();
        System.out.println("Iter");

        for(Integer numbers : numberList){
            System.out.println(numbers);
        }

        for(Integer number : numberSet){
            System.out.println(number);
        }

        System.out.println("xd");
        for (int i = 0; i < 10; i++) {
            numberList.add(i);
        }
        for(Integer numbers : numberList){
            System.out.print(numbers);
        }

        System.out.println();

        // SORT
        numberList.sort(null);
        for(Integer numbers : numberList){
            System.out.print(numbers);
        }


    }
}
