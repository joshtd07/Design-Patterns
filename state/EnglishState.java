public class EnglishState extends State {

    /**
     * Constructs a new {@code EnglishState} object associated with the provided {@code BabyBook}.
     *
     * @param book The {@code BabyBook} instance associated with this state.
     */
    public EnglishState(BabyBook book) {
        super(book);
    }

    /**
     * Initializes English animal sounds in the {@code animalSounds} map.
     */
    protected void initializeAnimalSounds() {
        animalSounds.put("bird", "Tweet");
        animalSounds.put("cat", "Meow");
        animalSounds.put("chicken", "Cluck");
        animalSounds.put("dog", "Woof");
        animalSounds.put("horse", "Neigh");
        animalSounds.put("mouse", "Sqeek");
        animalSounds.put("sheep", "Baah");
    }

    /**
     * Simulates pressing the English language button. Since the book is already in the English state,
     * this method prints a message indicating that the book is already in English.
     */
    public void pressEnglishButton() {
        System.out.println("Already in English state");
    }

    /**
     * Simulates pressing the Spanish language button, transitioning to the Spanish state.
     * Updates the state of the associated {@code BabyBook} to the Spanish state.
     */
    public void pressSpanishButton() {
        book.setState(book.getSpanishState());
    }

    /**
     * Simulates pressing the French language button, transitioning to the French state.
     * Updates the state of the associated {@code BabyBook} to the French state.
     */
    public void pressFrenchButton() {
        book.setState(book.getFrenchState());
    }
}
