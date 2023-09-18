package decorator;

public class Paint extends VehicleDecorator {
    private Vehicle vehicle;

    public String colorCode = null;


    public Paint(Vehicle vehicle, String color) {
        
        super(vehicle.lines);


        if (color == "Red") {
            colorCode = "\u001B[0m";

        } else if (color == "Red") {
            colorCode = "\u001B[31m";

        } else if (color == "Green") {
            colorCode = "\u001B[32m";

        } else if (color == "Yellow") {
            colorCode = "\u001B[33m";

        } else if (color == "Blue") {
            colorCode = "\u001B[34m";

        } else if (color == "Purple") {
            colorCode = "\u001B[35m";

        } else if (color == "Cyan") {
            colorCode = "\u001B[36m";

        }
    }
}