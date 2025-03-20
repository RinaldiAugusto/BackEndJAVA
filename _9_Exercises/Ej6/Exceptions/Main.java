package _9_Exercises.Ej6.Exceptions;

public class Main {
    public static void main(String[] args){
        try {
            Calculadoraa calculadora = new Calculadoraa();
            double a = calculadora.dividir(10, 0);
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("Error " + e.getMessage());
        }

        try {
            Calculadoraa calculadora = new Calculadoraa();
            double a = calculadora.dividir(220, 8);
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("Error " + e.getMessage());
        }


        try {
            Calculadoraa calculadora = new Calculadoraa();
            double a = calculadora.dividir(1390, 2);
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}
