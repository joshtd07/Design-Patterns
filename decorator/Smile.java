package decorator;

import java.util.ArrayList;

public class Smile extends VehicleDecorator {
    private Vehicle vehicle;

    public Smile(Vehicle vehicle) {
        super(FileReader.getLines(fileName:C:/Users/Josh/Downloads/smile.txt));

        this.vehicle = vehicle;
        ArrayList<String> copy = new ArrayList<String>();
        copy.add(tree.lines.toString());
        copy.add(lines.toString());
        integrateDecor(copy);
    }
}