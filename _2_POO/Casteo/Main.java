package _2_POO.Casteo;

public class Main {
    public static void main(String[] args){
        Animal perro = new Dog();
        Animal gato = new Cat();

        perro.makeSound();
        gato.makeSound();

        Dog dog = (Dog) perro;

        ((Dog) perro).fetchBall();
    }
}
