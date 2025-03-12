package _2_POO.PracticaIntegradora;

public abstract class Vehicle {
    private String licencePlate;
    private String color;
    private Double pricePerKilometer;

    public Vehicle(String licencePlate, String color, Double pricePerKilometer) {
        this.licencePlate = licencePlate;
        this.color = color;
        this.pricePerKilometer = pricePerKilometer;
    }

    public Double calculateFare(Double distanceKilometers){
        return distanceKilometers;
    }

    public Double getPricePerKilometer() {
        return pricePerKilometer;
    }
}
