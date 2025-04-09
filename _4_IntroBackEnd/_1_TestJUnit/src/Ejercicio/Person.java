package Ejercicio;

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

    public boolean isOlder(){
        return age >= 18;
    }


    public boolean name5Check(){
        return name.length() > 4;
    }

    public boolean ageCheck(){
        boolean check = false;
        if (age > 0 && age < 120){
            check = true;
        }
        return check;
    }


    public boolean nameAZCheck(){
        boolean check = false;
        char [] nametoChars = name.toCharArray();
        for (Character letter : nametoChars){
            if (!Character.isLetter(letter)){
                return check;
            }
        }
        check = true;
        return check;
    }


}
