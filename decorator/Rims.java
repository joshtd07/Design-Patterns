package decorator;

public class Rims extends VehicleDecorator {
    private Vehicle vehicle;

    public Rims(Vehicle vehicle) {
        super(vehicle.lines);
        integrateDecor(FileReader.getLines("decorator/Rims.java"));
    }
}