package _9_Exercises.Ej5.Colecciones;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Estudiantes> estudiantesList = new ArrayList<>();

        Estudiantes estudiante1 = new Estudiantes("Augusto", 17, 10.0);
        Estudiantes estudiante2 = new Estudiantes("Tomas", 17, 10.0);
        Estudiantes estudiante3 = new Estudiantes("Ignacio", 17, 10.0);

        estudiantesList.add(estudiante1);
        estudiantesList.add(estudiante2);
        estudiantesList.add(estudiante3);

        for (Estudiantes estudiantes:estudiantesList){
            System.out.println(estudiantes);
        }
    }
}
