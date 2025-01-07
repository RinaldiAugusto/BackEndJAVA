package _2_POO.Asociacion;

public class Owner {
    private String name;
    private Vehicle vehicle;

    public Owner(String name, Vehicle vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Nombre: " + name + " Tipo de Vehiculo: " + vehicle + " Numero patente: " + vehicle.getLicencePlate() + " Color del vehiculo: " + vehicle.getColor() + " Numero de ruedas: " + vehicle.getNumberOfWheels();
    }
}
