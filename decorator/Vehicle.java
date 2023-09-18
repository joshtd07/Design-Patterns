package decorator;

import java.util.ArrayList;

public abstract class Vehicle {
    protected ArrayList<String> lines = new ArrayList<>();
    protected String ColorC;

    public Vehicle(ArrayList<String> lines) {
        this.lines = lines;
    }

    public String toString() {
        String sVehicle = "";
        for(String line : lines) {
            sVehicle = sVehicle + "\n" + line;
        }
        return sVehicle;
    }
}