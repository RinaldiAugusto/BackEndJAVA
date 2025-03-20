package _9_Exercises.Ej3.Polimor;

public class Main {
    public static void main(String[] args){
        Circulo circulo = new Circulo(20.0);
        circulo.calcularArea();
        System.out.println(circulo);

        Rectangulo rectangulo = new Rectangulo(10.0, 10.0);
        rectangulo.calcularArea();
        System.out.println(rectangulo);
    }
}
