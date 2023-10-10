package Factory;

public class Tricycle extends Bike {
    // Constructor for Tricycle
    public Tricycle(String name, double price, int numWheels, boolean hasPedals, boolean hasTrainingWheels) {
        // Tricycle always has 3 wheels
        super(name, price, numWheels, hasPedals, hasTrainingWheels);
    }

    // Implementation of the assembleBike method specific to Tricycle
    @Override
    public String assembleBike() {
        String assemblySteps = createFrame() + "\n";
        assemblySteps += addWheels() + "\n";
        if (hasPedals()) {
            assemblySteps += addPedals() + "\n";
        }
        assemblySteps += "Assembling the Tricycle handlebars.";
        return assemblySteps;
    }
}
