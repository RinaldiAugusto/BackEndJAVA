package _2_POO.PracticaIntegradora;

public class VehicleDeluxe extends Vehicle{
    private static Integer consumo = 10;
    public VehicleDeluxe(String licencePlate, String color, Double pricePerKilometer) {
        super(licencePlate, color, pricePerKilometer);
    }

    @Override
    public Double calculateFare(Double distanceKilometers) {
        return (distanceKilometers/consumo)*getPricePerKilometer();
    }
}
