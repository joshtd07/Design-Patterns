import java.util.ArrayList;

public class BabyBook {

    private State state;
    private EnglishState englishState;
    private SpanishState spanishState;
    private FrenchState frenchState;


    /**
     * Constructs a new {@code BabyBook} object with an initial state set to English.
     */
    public BabyBook() {
        englishState = new EnglishState(this);
        spanishState = new SpanishState(this);
        frenchState = new FrenchState(this);
        setState(englishState);
    }

    /**
     * Sets the current state of the book.
     *
     * @param state The new state to set.
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * Gets the list of animals available in the current state.
     *
     * @return An {@code ArrayList<String>} containing the names of animals.
     */
    public ArrayList<String> getAnimalList() {
        return state.getAnimalList();
    }

    /**
     * Simulates pressing an animal button, producing the corresponding animal sound.
     *
     * @param animal The name of the animal button pressed.
     */
    public void pressAnimalButton(String animal) {
        state.pressAnimalButton(animal);
    }

    /**
     * Simulates pressing the English language button, transitioning to the English state.
     */
    public void pressEnglishButton() {
        state.pressEnglishButton();
    }

    /**
     * Simulates pressing the Spanish language button, transitioning to the Spanish state.
     */
    public void pressSpanishButton() {
        state.pressSpanishButton();
    }

    /**
     * Simulates pressing the French language button, transitioning to the French state.
     */
    public void pressFrenchButton() {
        state.pressFrenchButton();
    }

    /**
     * Gets the English state object.
     *
     * @return The English state object.
     */
    public State getEnglishState() {
        return englishState;
    }

    /**
     * Gets the Spanish state object.
     *
     * @return The Spanish state object.
     */
    public State getSpanishState() {
        return spanishState;
    }

    /**
     * Gets the French state object.
     *
     * @return The French state object.
     */
    public State getFrenchState() {
        return frenchState;
    }
}
