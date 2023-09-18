package decorator;

public class Smile extends VehicleDecorator {
    private Vehicle vehicle;

    public Smile(Vehicle vehicle) {
        super(vehicle.lines);
        integrateDecor(FileReader.getLines("decorator/Smile.java"));
    }
}