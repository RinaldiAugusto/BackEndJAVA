package _4_IntroBackEnd.Ejercicio;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<Person> people;

    public Group() {
        people = new ArrayList<>();
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    public void addPerson(Person person){
        if (person.isOlder(person) && person.name5Check(person)){
            people.add(person);
            System.out.println(person.getName() + " Se añadio correctamente al grupo...");
        }
        else System.out.println(person.getName() + " No cumple con los requisitos para entrar al grupo...");
        ;
    }

}
