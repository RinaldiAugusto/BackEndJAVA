package _2_POO.Colecciones.SORT;

public class Worker implements Comparable<Worker>{
    private String name;
    private Integer workerHours;

    public Worker(String name, Integer workerHours) {
        this.name = name;
        this.workerHours = workerHours;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Worker o) {
        return this.workerHours.compareTo(o.workerHours);
    }


//    @Override
//    public int compareTo(Worker o) {
//        return o.workerHours - this.workerHours;
//    }
}
