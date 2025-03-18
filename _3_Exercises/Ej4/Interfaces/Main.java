package _3_Exercises.Ej4.Interfaces;

public class Main {
    public static void main(String[] args){
        Pajaro pajaro = new Pajaro();
        Avion avion = new Avion();

        System.out.println(pajaro.volar());
        System.out.println(avion.volar());
    }
}
