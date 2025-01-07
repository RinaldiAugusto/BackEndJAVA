package _2_POO.Asociacion;

public class Vehicle {
    private String licencePlate;
    private String color;
    private Integer numberOfWheels;

    public Vehicle(String licencePlate, String color, Integer numberOfWheels) {
        this.licencePlate = licencePlate;
        this.color = color;
        this.numberOfWheels = numberOfWheels;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public String getColor() {
        return color;
    }

    public Integer getNumberOfWheels() {
        return numberOfWheels;
    }
}
