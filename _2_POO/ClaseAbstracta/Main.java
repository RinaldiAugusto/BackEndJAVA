package _2_POO.ClaseAbstracta;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10.0);
        Square square = new Square(4,5.0);

        System.out.println(circle.calculateArea());
        System.out.println(square.calculateArea());
    }
}
