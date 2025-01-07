package _2_POO.Asociacion;

public class Main {
    public static void main(String[] args){
        Owner owner = new Owner("Augusto", new Vehicle("AC869LV", "Gris",4));
        System.out.println(owner);

        owner.setVehicle(new VehicleMoto("ACS324", "Rojo", "BMW"));
        System.out.println(owner);
    }
}
