package _2_POO.RelacionDeHerencia;

public class Worker {
    private String name;
    private Double salary;

    public Worker(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Double calculateSalary(){
        return this.salary;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }
}
