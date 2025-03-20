package _9_Exercises.Ej2.Herencia;

public class Perro extends Animal{
    public Perro(String raza, Integer age) {
        super(raza, age);
    }

    @Override
    public String makeSound() {
        return "Guof guof";
    }
}
