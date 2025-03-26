package _3_Patrones._4_Observer;

public class Reader implements Observer{
    private String name;
    private Integer age;

    public Reader(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void update() {
        System.out.println("Iam " + name +  " and i read the new article...");
    }
}
