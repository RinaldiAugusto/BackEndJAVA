package Ejercicio;

public class Main {
    public static void main(String[] args){
        Person person = new Person("Augusto", 19);
        Person person1 = new Person("Mat1as", 19);

        Group group = new Group();

        group.addPerson(person);
        group.addPerson(person1);

    }
}
