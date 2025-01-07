package _1_Introduccion_POO;

public class Bases_java {
    public static void main(String args[]){

        System.out.println("Hola mundo");

        String name = "Augusto";
        Integer age = 20;
        Double height = 1.80;

        System.out.println("Datos: Nombre= " + name + ", Edad= " + age + ", Altura= " + height + ".");

        if (age > 18 && height >= 1.5){
            System.out.println("Podes subir!!");
        }else{
            System.out.println("No podes subir...");
        }

        for(Integer i = 0; i < 10; i ++){
            System.out.println(i);
        }


    }
}
