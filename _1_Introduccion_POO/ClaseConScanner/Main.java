package _1_Introduccion_POO.ClaseConScanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del perro: ");
        String name = scanner.next();

        System.out.print("Ingrese la edad del perro: ");
        Integer age = scanner.nextInt();

        Dog dog = new Dog(name, age);

        System.out.println("Nombre: " + dog.getName() + " |Edad: " + dog.getAge());
    }
}
