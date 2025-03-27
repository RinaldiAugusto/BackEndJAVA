package _4_IntroBackEnd.Ejercicio;

import javax.crypto.spec.PSource;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Person person = new Person("Augusto", 19);
        Person person1 = new Person("Matias", 19);

        Group group = new Group();

        group.addPerson(person);
        group.addPerson(person1);

    }
}
