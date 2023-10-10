package Factory;

public class KidsBike extends Bike {
    // Constructor for KidsBike
    public KidsBike(String name, double price, int numWheels, boolean hasPedals, boolean hasTrainingWheels) {
        super(name, price, numWheels, hasPedals, hasTrainingWheels);
    }

    // Implementation of the assembleBike method specific to KidsBike
    @Override
    public String assembleBike() {
        String assemblySteps = createFrame() + "\n";
        assemblySteps += addWheels() + "\n";
        if (hasPedals()) {
            assemblySteps += addPedals() + "\n";
        }
        assemblySteps += "Assembling the KidsBike handlebars.";
        return assemblySteps;
    }
}
