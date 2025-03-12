package _2_POO.Colecciones.MAPAS;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){

//        Map<String, String > countryCapitals = new HashMap<>();
//
//        countryCapitals.put("Argentina", "Buenos Aires");
//        countryCapitals.put("Colombia", "Bogota");
//        countryCapitals.put("Peru", "Lima");
//
//        System.out.println(countryCapitals);
//
//        countryCapitals.remove("Peru");
//
//        System.out.println(countryCapitals);

        Map<Integer, Students> studentsMap = new HashMap<>();

        studentsMap.put(1,new Students("Augusto", 1));
        studentsMap.put(2,new Students("Tomas", 2));
        studentsMap.put(3,new Students("Ignacio", 3));

        System.out.println(studentsMap);

    }
}
