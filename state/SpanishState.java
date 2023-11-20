public class SpanishState extends State {

    /**
     * Constructs a new {@code SpanishState} object associated with the provided {@code BabyBook}.
     *
     * @param book The {@code BabyBook} instance associated with this state.
     */
    public SpanishState(BabyBook book) {
        super(book);
    }

    /**
     * Initializes Spanish animal sounds in the {@code animalSounds} map.
     */
    protected void initializeAnimalSounds() {
        animalSounds.put("Pájaro", "pío");
        animalSounds.put("Gato", "miau");
        animalSounds.put("Gallina", "coc co co coc");
        animalSounds.put("Perro", "Guau");
        animalSounds.put("Caballo", "relinchar");
        animalSounds.put("Ratón", "cui-cui");
        animalSounds.put("Oveja", "bee, mee");
    }

    /**
     * Simulates pressing the English language button, transitioning to the English state.
     * Updates the state of the associated {@code BabyBook} to the English state.
     */
    public void pressEnglishButton() {
        book.setState(book.getEnglishState());
    }

    /**
     * Simulates pressing the Spanish language button. Since the book is already in the Spanish state,
     * this method prints a message indicating that the book is already in Spanish.
     */
    public void pressSpanishButton() {
        System.out.println("Already in Spanish state");
    }

    /**
     * Simulates pressing the French language button, transitioning to the French state.
     * Updates the state of the associated {@code BabyBook} to the French state.
     */
    public void pressFrenchButton() {
        book.setState(book.getFrenchState());
    }
}
