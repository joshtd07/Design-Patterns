package strategy;
import java.util.Random;

public class BlockBehavior implements DefenseBehavior{
    public void play() {

        // Decides what defensive block behavior the player will perform with an equal 25% chance for all of the options

        int upperbound = 4
        int random = rand.nextInt(upperbound);
        if(random = 1){
        Print.out.ln("block a kick");
        } else if(random = 2){
        Print.out.ln("block a pass");
        } else if(random = 3) {
        Print.out.ln("block a punt");
        } else {
        Print.out.ln("block a catch");
        }
    }
}