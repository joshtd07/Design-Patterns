package Factory;

public class Strider extends Bike {
    // Constructor for Strider
    public Strider(String name, double price, int numWheels, boolean hasTrainingWheels) {
        super(name, price, numWheels, hasTrainingWheels);
    }

    // Implementation of the assembleBike method specific to Strider
    @Override
    public String assembleBike() {
        String assemblySteps = createFrame() + "\n";
        assemblySteps += addWheels() + "\n";
        assemblySteps += "Assembling the Strider handlebars.";
        return assemblySteps;
    }
}
