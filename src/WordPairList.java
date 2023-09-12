import java.lang.reflect.Array;
import java.util.ArrayList;

public class WordPairList {
    private ArrayList<WordPair> allPairs;

    public WordPairList(String[] words) {
        int wSize = words.length;
        allPairs = new ArrayList<>();
        for (int i = 0; i < wSize; ++i) {
            for (int j = i+1; j < wSize; ++j) {
                allPairs.add(new WordPair(words[i], words[j]));
            }
        }
    }

    public ArrayList<WordPair> getAllPairs() {return allPairs;}

    public int numMatches() {
        int matches = 0;
        for (WordPair wp : allPairs) {
            if (wp.getFirst().equals(wp.getSecond())) {
                matches++;
            }
        }
        return matches;
    }
}
