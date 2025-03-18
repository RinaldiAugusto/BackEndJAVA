package _2_POO.Exceptions.ExceptionsPractico;

public class Main {
    public static void main(String[] args){
        University university = new University("UTN");

        university.generateCourse(1, "Algebra");
        university.generateStudent(2, "Augusto");

        university.suscribeStudent(1,2);
    }
}
