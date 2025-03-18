package _3_Exercises.Ej2.Herencia;

public class Main {
    public static void main(String[] args){
        Animal animal = new Animal("Tigre", 2);
        Perro perro = new Perro("Pitbull", 2);

        System.out.println(animal.makeSound());
        System.out.println(perro.makeSound());
    }
}
