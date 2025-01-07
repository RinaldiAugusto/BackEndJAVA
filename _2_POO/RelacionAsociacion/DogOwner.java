package _2_POO.RelacionAsociacion;

public class DogOwner {

    private String name;
    private Dog dog;

    public DogOwner(String name, Dog dog) {
        this.name = name;
        this.dog = dog;
    }

    public void play(){
        System.out.println("Estoy jugando con mi perro");
    }
}
