package _2_POO.RelacionAsociacion;

public class Main {
    public static void main(String[] args){
        Dog dog = new Dog("India");
        Dog anotherDog = new Dog("Roma");
        DogOwner dogOwner = new DogOwner("Augusto", dog);

        dogOwner.play();

        DogWalker dogWalker = new DogWalker("Juan");

        dogWalker.walkDog(dog);
        dogWalker.walkDog(anotherDog);
    }
}
