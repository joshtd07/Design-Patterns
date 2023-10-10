package Factory;

public abstract class Bike {
    // Attributes
    private String name;
    private double price;
    private int numWheels;
    private boolean hasPedals;
    private boolean hasTrainingWheels;

    // Constructor
    public Bike(String name, double price, int numWheels, boolean hasPedals, boolean hasTrainingWheels) {
        this.name = name;
        this.price = price;
        this.numWheels = numWheels;
        this.hasPedals = hasPedals;
        this.hasTrainingWheels = hasTrainingWheels;
    }

    // Abstract method to assemble the bike
    public abstract String assembleBike();

    // Protected method to create the bike frame
    protected String createFrame() {
        return "Assembling the " + name + " frame.";
    }

    // Protected method to add wheels to the bike
    protected String addWheels() {
        return "Adding " + numWheels + " wheels to the " + name + ".";
    }

    // Protected method to add pedals to the bike
    protected String addPedals() {
        if (hasPedals) {
            return "Adding pedals to the " + name + ".";
        } else {
            return "The " + name + " does not have pedals.";
        }
    }

    // Public method to get the price of the bike
    public double getPrice() {
        return price;
    }
}
