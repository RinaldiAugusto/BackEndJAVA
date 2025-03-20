package _9_Exercises.Ej3.Polimor;

public class Rectangulo extends Figura{
    private Double base;
    private Double altura;

    public Rectangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double calcularArea() {
        return (base*altura);
    }

    @Override
    public String toString() {
        return "Area del rectangulo: " + calcularArea();
    }
}
