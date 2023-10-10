package singleton;

import java.util.*;

public class Game {
    
    private static Game gameInstance;
    private Random rand;
    private Difficulty level;
    private HashMap<Difficulty, ArrayList<Anagram>> anagrams;
    private Anagram currentAnagram;
    private int score;

    private Game(){
        rand = new Random();
        level = Difficulty.EASY;
        anagrams = new HashMap<>();
        score = 0;

        for(Difficulty difficulty : Difficulty.values()){
            ArrayList<Anagram> anagramList = FileReader.getAnagrams(difficulty);
            anagrams.put(difficulty, anagramList);
        }
    }

    public static Game getInstance(){
        if(gameInstance == null){
            gameInstance = new Game();
        }
        return gameInstance;
    }

    public String getQuestion(){
        if(score>6){
            level = Difficulty.HARD;
        } else if(score>3){
            level = Difficulty.MEDIUM;
        } else{
            level = Difficulty.EASY;
        }

        ArrayList<Anagram> anagramsList = anagrams.get(level);

        if(anagramsList!=null && !anagramsList.isEmpty()){
            int randomIndex = rand.nextInt(anagramsList.size());
            currentAnagram = anagramsList.get(randomIndex);
            return currentAnagram.getQuestion();
        }

        return "No question available";
    }

    public boolean isCorrect(String UserAnswer){
        if(currentAnagram!=null){
            if(currentAnagram!=null){
                if(currentAnagram.isCorrect(UserAnswer)){
                    score++;
                    return true;
                }else{
                    score--;
                    return false;
                }
            }
        }

        return false;
    }

    public int getScore(){
        return score;
    }

}
