package decorator;

import java.util.ArrayList;

public class Smile extends VehicleDecorator {
    private Vehicle vehicle;

    public Smile(Vehicle vehicle) {
        super(FileReader.getLines("C:/Users/Brandon/OneDrive/Desktop/School/baby back/decorator/decorator/Smile.java"));

        this.vehicle = vehicle;
        ArrayList<String> copy = new ArrayList<String>();
        copy.add(vehicle.lines.toString());
        copy.add(lines.toString());
        integrateDecor(copy);
    }
}