package _3_Exercises.Ej3.Polimor;

public class Circulo extends Figura{
    private Double radio;

    public Circulo(Double radio) {
        this.radio = radio;
    }

    @Override
    public Double calcularArea() {
        return (double) Math.round(Math.PI * Math.pow(radio, 2));
    }

    @Override
    public String toString() {
        return "Area del circulo: " + calcularArea();
    }
}
