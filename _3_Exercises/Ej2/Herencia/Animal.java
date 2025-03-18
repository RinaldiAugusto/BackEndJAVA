package _3_Exercises.Ej2.Herencia;

public class Animal {
    private String raza;
    private Integer age;

    public Animal(String raza, Integer age) {
        this.raza = raza;
        this.age = age;
    }

    public String makeSound(){
        return "ROar";
    }
}
