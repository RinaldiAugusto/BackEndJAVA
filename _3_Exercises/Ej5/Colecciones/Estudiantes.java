package _3_Exercises.Ej5.Colecciones;

public class Estudiantes {
    private String name;
    private Integer age;
    private Double score;

    public Estudiantes(String name, Integer age, Double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Name: " + name + " |Age: " + age + " |Score: " + score;
    }
}
