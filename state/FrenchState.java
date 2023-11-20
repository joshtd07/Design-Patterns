public class FrenchState extends State {

    /**
     * Constructs a new {@code FrenchState} object associated with the provided {@code BabyBook}.
     *
     * @param book The {@code BabyBook} instance associated with this state.
     */
    public FrenchState(BabyBook book) {
        super(book);
    }

    /**
     * Initializes French animal sounds in the {@code animalSounds} map.
     */
    protected void initializeAnimalSounds() {
        animalSounds.put("oiseau", "Cui Cui");
        animalSounds.put("chat", "Miaou");
        animalSounds.put("poulet", "Cotcotcodet");
        animalSounds.put("chien", "Ouaf Ouaf");
        animalSounds.put("cheval", "NeHiiiiigh");
        animalSounds.put("souris", "Chicotement");
        animalSounds.put("mouton", "Bêlement");
    }

    /**
     * Simulates pressing the English language button, transitioning to the Spanish state.
     * Updates the state of the associated {@code BabyBook} to the English state.
     */
    public void pressEnglishButton() {
        book.setState(book.getEnglishState());
    }

    /**
     * Simulates pressing the Spanish language button, transitioning to the Spanish state.
     * Updates the state of the associated {@code BabyBook} to the Spanish state.
     */
    public void pressSpanishButton() {
        book.setState(book.getSpanishState());
    }

    /**
     * Simulates pressing the French language button. Since the book is already in the French state,
     * this method prints a message indicating that the book is already in French.
     */
    public void pressFrenchButton() {
        System.out.println("Already in French state");
    }
}
