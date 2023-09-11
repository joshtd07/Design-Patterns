package strategy;
import java.util.Random;

public class QuarterBack extends Player {
    public QuarterBack(String firstName, String lastName, boolean offense) {
        super(firstName, lastName, offense);
    }

    public void setOffenseBehavior() {

// Determines what action will be taken when the quarterback runs a play on offense. 50/50 chance to run or pass.

        random Rand = new Random();
        int upperbound = 2
        int random = rand.nextInt(upperbound);
        if (random = 1) {
            offenseBehavior = new RunBehavior();
        }
        else if (random = 2) {
            offenseBehavior = new PassBehavior();
        }
    }

    public void setDefenseBehavior() {

// Quarterback does not play defense, so his defense behavior is set to null.

        defenseBehavior = null;
    }
}