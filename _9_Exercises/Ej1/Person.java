package _9_Exercises.Ej1;

import java.util.HashSet;
import java.util.Set;

public class Person {
    private String name;
    private Integer age;
    private Integer dni;
    private Set<Person> personSet;



    public Person(String name, Integer age, Integer dni) {
        this.name = name;
        this.age = age;
        this.dni = dni;
        personSet = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getDni() {
        return dni;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Name: " + name + " /Age: " + age + " /DNI: " + dni;
    }

//    public void addPerson(Integer cant){
//        for (int i = 0; i < cant; i++) {
//            String name = "Persona" + (i + 1);
//            Integer dni = i + 1;
//            Integer age = i + 1;
//
//            Person person = new Person(name, age, dni);
//            personSet.add(person);
//        }
//    }
}
