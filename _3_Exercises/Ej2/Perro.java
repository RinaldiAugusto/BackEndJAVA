package _3_Exercises.Ej2;

public class Perro extends Animal{
    public Perro(String raza, Integer age) {
        super(raza, age);
    }

    @Override
    public String makeSound() {
        return "Guof guof";
    }
}
