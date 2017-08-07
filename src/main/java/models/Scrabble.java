package models;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Guest on 8/1/17.
 */
public class Scrabble {

    public Integer calculateScore(String word) {
        String[] arrayAT = {"a", "e", "i", "o", "u", "l", "n", "r", "s", "t"};
        String[] arrayDG = {"d", "g"};
        String[] arrayBP = {"b", "c", "m", "p"};
        String[] arrayFY = {"f", "h", "v", "w", "y"};
        String[] arrayK = {"k"};
        String[] arrayJX = {"j", "x"};
        String[] arrayQZ = {"q", "z"};

        Map<String[], Integer> scrabbleMap = new HashMap();

        scrabbleMap.put(arrayAT, 1);
        scrabbleMap.put(arrayDG, 2);
        scrabbleMap.put(arrayBP, 3);
        scrabbleMap.put(arrayFY, 4);
        scrabbleMap.put(arrayK, 5);
        scrabbleMap.put(arrayJX, 8);
        scrabbleMap.put(arrayQZ, 10);

        String [] lettersArray = word.replaceAll("\\W", "").split("");
        for (String str: lettersArray) {
            System.out.println(str);
        }


        int score = 0;


        for(String[] key : scrabbleMap.keySet()) {
            for(String mapLetter: key) {
                for (String letter : lettersArray) {
                    if (letter.equals(mapLetter)) {
                        score += scrabbleMap.get(key);
                    }
                }

            }
        }
        return score;
    }
}
