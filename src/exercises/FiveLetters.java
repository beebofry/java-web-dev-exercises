package exercises;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FiveLetters {
    public static ArrayList<String> fiveLetterFinder(ArrayList<String> wordList, int input){
        ArrayList<String> fiveLetterList = new ArrayList<>();
        for (String word : wordList) {
            if (word.length() == input) {
                fiveLetterList.add(word);
            }
        }
        return fiveLetterList;
    }
}
