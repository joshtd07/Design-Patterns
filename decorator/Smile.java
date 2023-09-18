package decorator;

import java.util.ArrayList;

public class Smile extends VehicleDecorator {
    private Vehicle vehicle;

    public Smile(Vehicle vehicle) {
        super(vehicle.lines);
        integrateDecor(FileReader.getLines("C:/Users/Josh/OneDrive - University of South Carolina/CSCE247/Design-Patterns/decorator/rims.txt"));
    }
}