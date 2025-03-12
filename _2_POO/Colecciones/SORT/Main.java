package _2_POO.Colecciones.SORT;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        List<Worker> workerList = new ArrayList<>();

        workerList.add(new Worker("Augusto", 11));
        workerList.add(new Worker("Tomas", 0));
        workerList.add(new Worker("Ignacio", 3));

        System.out.println(workerList);

        workerList.sort(Worker::compareTo);

        System.out.println(workerList);

    }
}
