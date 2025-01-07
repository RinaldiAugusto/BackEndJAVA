package _1_Introduccion_POO;

import java.util.Scanner;

public class Scaner {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese primer numero: ");
        Integer firstInt = scanner.nextInt();

        System.out.print("Ingrese segundo numero: ");
        Integer secondInt = scanner.nextInt();

        Integer addition = firstInt + secondInt;

        System.out.println(addition);
    }
}
