package strategy;

public abstract class Player {
    private String firstName;
    private String lastName;

    private boolean offense;

    protected DefenseBehavior defenseBehavior;
    protected OffenseBehavior offenseBehavior;

    public Player(String firstName, string lastName, boolean offense) {
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