package _2_POO.RelacionDeHerencia;

public class WorkerExtraHours extends Worker{

    private Integer extraHoursWorked;
    private Double priceHour;

    public WorkerExtraHours(String name, Double salary, Integer extraHoursWorked, Double priceHour) {
        super(name, salary);
        this.extraHoursWorked = extraHoursWorked;
        this.priceHour = priceHour;
    }

    @Override
    public Double calculateSalary() {
        return getSalary() + (extraHoursWorked * priceHour);
    }
}
