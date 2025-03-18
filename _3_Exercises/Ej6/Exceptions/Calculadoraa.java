package _3_Exercises.Ej6.Exceptions;

public class Calculadoraa {
    public double dividir(Integer a, Integer b) throws ArithmeticException {
        if (b == 0){
            throw new ArithmeticException("No se puede dividir por 0...");
        }
        return a/b;
    }
}
