package _1_Introduccion_POO.GettersAndSetters;

public class Main {
    public static void main(String[] args){
        Persona persona1 = new Persona("Augusto", 20);
        System.out.println(persona1.getName() + " " + persona1.getAge());

        persona1.setAge(21);
        persona1.setName("Marcelo");

        System.out.println(persona1.getName() + " " + persona1.getAge());
    }
}
