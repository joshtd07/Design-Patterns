package decorator;

import java.util.ArrayList;

public class Rims extends VehicleDecorator {
    private Vehicle vehicle;

    public Rims(Vehicle vehicle) {
        super(FileReader.getLines(fileName:C:/Users/Josh/Downloads/.rimstxt));

        this.vehicle = vehicle;
        ArrayList<String> copy = new ArrayList<String>();
        copy.add(tree.lines.toString());
        copy.add(lines.toString());
        integrateDecor(copy);
    }
}