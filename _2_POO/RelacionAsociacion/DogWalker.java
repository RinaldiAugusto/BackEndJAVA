package _2_POO.RelacionAsociacion;

public class DogWalker {
    private String name;

    public DogWalker(String name) {
        this.name = name;
    }

    public void walkDog (Dog dog){
        System.out.println("Estoy paseando a " + dog.getName());
    }
}
