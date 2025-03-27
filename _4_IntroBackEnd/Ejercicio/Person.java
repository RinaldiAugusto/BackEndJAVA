package _4_IntroBackEnd.Ejercicio;

public class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isOlder(Person person){
        if (person.age > 18){
            return true;
        }
        return false;
    }

//    public boolean ageCheck(){
//        return false;
//    }

    public boolean name5Check(Person person){
        int cont = 0;
        for (int i = 0; i < person.name.length(); i++) {
            cont += 1;
        }
        if (cont >= 5){
            return true;
        }
        return false;
    }
//
//    public boolean nameAZCheck(){
//        return false;
//    }
}
