import java.util.ArrayList;
import java.util.HashMap;

public abstract class State {

    protected BabyBook book;
    protected HashMap<String, String> animalSounds;

    /**
     * Constructs a new {@code State} object associated with the provided {@code BabyBook}.
     *
     * @param book The {@code BabyBook} instance associated with this state.
     */
    public State(BabyBook book) {
        this.book = book;
        this.animalSounds = new HashMap<>();
        initializeAnimalSounds();
    }

    /**
     * Initializes animal sounds for the specific language state. Concrete state classes
     * must implement this method to set up the corresponding animal sounds in the {@code animalSounds} map.
     */
    protected abstract void initializeAnimalSounds();

    /**
     * Gets the list of animals available in the current state.
     *
     * @return An {@code ArrayList<String>} containing the names of animals.
     */
    public ArrayList<String> getAnimalList() {
        return new ArrayList<>(animalSounds.keySet());
    }

    /**
     * Simulates pressing an animal button, producing the corresponding animal sound.
     *
     * @param animal The name of the animal button pressed.
     */
    public void pressAnimalButton(String animal) {
        String sound = animalSounds.get(animal);
        System.out.println("Animal: " + animal + ", Sound: " + sound);
    }

    /**
     * Simulates pressing the English language button, transitioning to the English state.
     */
    public abstract void pressEnglishButton();

    /**
     * Simulates pressing the Spanish language button, transitioning to the Spanish state.
     */
    public abstract void pressSpanishButton();

    /**
     * Simulates pressing the French language button, transitioning to the French state.
     */
    public abstract void pressFrenchButton();
}
