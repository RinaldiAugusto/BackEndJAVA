package _2_POO.Colecciones.MAPAS;

public class Students {
    private String name;
    private Integer id;

    public Students(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return name;
    }
}
