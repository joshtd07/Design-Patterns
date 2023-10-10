package Factory;

import java.util.HashMap;
import java.util.Map;

public class BikeStore {
    // Map to store available bike types and their corresponding classes
    private Map<String, Class<? extends Bike>> bikeTypes;

    public BikeStore() {
        // Initialize the map with available bike types
        bikeTypes = new HashMap<>();
        bikeTypes.put("tricycle", Tricycle.class);
        bikeTypes.put("strider", Strider.class);
        bikeTypes.put("kids bike", KidsBike.class);
    }

    public Bike createBike(String bikeType, String name, double price, boolean hasPedals, boolean hasTrainingWheels) {
        // Check if the requested bike type exists in the map
        if (bikeTypes.containsKey(bikeType.toLowerCase())) {
            try {
                // Get the corresponding class for the requested bike type
                Class<? extends Bike> bikeClass = bikeTypes.get(bikeType.toLowerCase());

                // Create an instance of the specified bike type
                return bikeClass.getConstructor(String.class, double.class, boolean.class, boolean.class)
                        .newInstance(name, price, hasPedals, hasTrainingWheels);
            } catch (Exception e) {
                // Handle any exceptions (e.g., reflection or instantiation errors)
                e.printStackTrace();
            }
        }

        // If the requested bike type is not found or there's an error, return null
        return null;
    }
}
