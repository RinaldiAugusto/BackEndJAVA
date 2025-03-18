package _3_Exercises.Ej7.RelacionAsociacion;

public class Main {
    public static void main(String[] args){
        Profesor teacher1 = new Profesor("Bottino", "Filosofia 1");
        Curso course1 = new Curso("Soro 701", teacher1);

        System.out.println(course1);
    }
}
