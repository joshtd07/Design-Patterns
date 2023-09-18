package decorator;

import java.util.ArrayList;

public class Paint extends VehicleDecorator {
    private Vehicle vehicle;

    public Paint(Vehicle vehicle, String color) {
        
        super(FileReader.getLines("C:/Users/Josh/Downloads/paint.txt"));
//MAY BE DIFFRENT FROM SMILE AND RIMS
        this.vehicle = vehicle;
        ArrayList<String> copy = new ArrayList<String>();
        copy.add(vehicle.lines.toString());
        copy.add(lines.toString());
        integrateDecor(copy);
    }
}