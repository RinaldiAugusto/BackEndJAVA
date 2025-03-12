package _2_POO.PracticaIntegradora;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Vehicle etios = new VehicleStandar("AC918AB", "grey", 1173.0);
        Vehicle ranger = new VehicleDeluxe("AG619VZ", "grey", 1447.0);

        Driver augusto = new Driver("Augusto", ranger);

        System.out.println("Costo viaje en etios: $"+ Math.round(etios.calculateFare(1968.0)));
        System.out.println("Costo viaje en ranger: $" + Math.round(ranger.calculateFare(1968.0)));
    }
}