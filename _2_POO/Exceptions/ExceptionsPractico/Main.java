package _2_POO.Exceptions.ExceptionsPractico;

public class Main {
    public static void main(String[] args){
        University university = new University("UTN");
        university.generateStudent(401036, "Rinaldi Augusto");
        university.generateCourse(700, "Algebra");

        try {
            university.suscribeStudent(7000, 401036);
        }catch (Exception e){
            System.out.println("Error " + e.getMessage());
        }
    }
}
