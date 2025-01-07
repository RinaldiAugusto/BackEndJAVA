package _2_POO.RelacionDeHerencia;

public class Main {
    public static void main(String[] args){
        Worker worker = new Worker("Manuel",2000.0);
        System.out.println(worker.getName() + " tiene un sueldo de: " + worker.calculateSalary());

        WorkerExtraHours workerExtraHours = new WorkerExtraHours("Maria", 2000.0, 3, 100.0);
        System.out.println(workerExtraHours.getName() + " tiene un sueldo de: "+ workerExtraHours.calculateSalary());
    }
}
