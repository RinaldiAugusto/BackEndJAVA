package _2_POO.PracticaIntegradora;

public class VehicleStandar extends Vehicle{
    private static Integer consumo = 13;

    public VehicleStandar(String licencePlate, String color, Double pricePerKilometer) {
        super(licencePlate, color, pricePerKilometer);
    }

    @Override
    public Double calculateFare(Double distanceKilometers) {
        return (distanceKilometers/consumo)*getPricePerKilometer();
    }
}
