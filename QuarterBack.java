package strategy;
import java.util.Random;

public class QuarterBack extends Player {
    public QuarterBack(String firstName, String lastName, boolean offense) {
        super(firstName, lastName, offense);
    }

    public void setOffenseBehavior() {
        random Rand = new Random();
        int upperbound = 2
        int random = rand.nextInt(upperbound);
        if (random = 1) {
            offenseBehavior = new runBehavior;
        }
        else if (random = 2) {
            offenseBehavior = new passBehavior;
        }
    }

    public void setDefenseBehavior() {
        defenseBehavior = null;
    }
}