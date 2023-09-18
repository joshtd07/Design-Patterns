package decorator;

import java.util.ArrayList;

public class Rims extends VehicleDecorator {
    private Vehicle vehicle;

    public Rims(Vehicle vehicle) {
        super(FileReader.getLines("C:/Users/Brandon/OneDrive/Desktop/School/baby back/decorator/decorator/rims.txt"));

        this.vehicle = vehicle;
        ArrayList<String> copy = new ArrayList<String>();
        copy.add(vehicle.lines.toString());
        copy.add(lines.toString());
        integrateDecor(copy);
    }
}