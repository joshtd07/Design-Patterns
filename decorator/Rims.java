package decorator;

import java.util.ArrayList;

public class Rims extends VehicleDecorator {
    private Vehicle vehicle;

    public Rims(Vehicle vehicle) {
        super(vehicle.lines);
        integrateDecor(FileReader.getLines("C:/Users/Josh/OneDrive - University of South Carolina/CSCE247/Design-Patterns/decorator/rims.txt"));
    }
}