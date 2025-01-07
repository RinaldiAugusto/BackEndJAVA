package _1_Introduccion_POO;

public class Metodo {
    public static void main(String args[]){
        Double uno = sumar(10.0, 20.0);
        System.out.println(sumar(10.0,10.0));
        System.out.println(uno);
    }

    public static Double sumar(Double uno, Double dos){
        return uno + dos;
    }

}
