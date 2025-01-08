package _2_POO.Interfaces;

public class Main {
    public static void main(String[] args) {
        Helicopter helicopter = new Helicopter(0,"Black");
        helicopter.turnOn();
        helicopter.fly();

        Bird bird = new Bird();
        bird.fly();
    }
}
