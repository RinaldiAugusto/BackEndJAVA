package _2_POO.Interfaces;

public class Helicopter extends Vehicle implements Flyable{
    public Helicopter(Integer numberOfWheels, String color) {
        super(numberOfWheels, color);
    }

    @Override
    public void fly() {
        if (itsOn = true){
            System.out.println("Can fly!");
        }
    }
}
