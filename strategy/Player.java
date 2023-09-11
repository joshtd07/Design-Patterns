package strategy;

public abstract class Player {
    // Creates the Strings that hold a player's first and last name, as well as a boolean to determine if they are on offense or not

    private String firstName;
    private String lastName;

    private boolean offense;

    protected DefenseBehavior defenseBehavior;
    protected OffenseBehavior offenseBehavior;

    public Player(String firstName, string lastName, boolean offense) {

// Creates a player using the given names and position

        this.firstName = firstName;
        this.lastName = lastName;
        this.offense = offense;
    }

    public abstract void setDefenseBehavior;
    public abstract void setOffenseBehavior;

    public void play() {

    }

    public void turnover() {

    }

    public String toString() {

    }
}