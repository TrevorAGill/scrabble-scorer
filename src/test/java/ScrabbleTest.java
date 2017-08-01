import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 8/1/17.
 */
public class ScrabbleTest {

    @Test
    public void calculateScore_returnsScoreForSingleLetter_1() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 1;
        assertEquals(expected, testScrabble.calculateScore("a"));
    }

    @Test
    public void calculateScore_returnsNumberOfLettersForTwoLetters_2() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 2;
        assertEquals(expected, testScrabble.calculateScore("aa"));
    }

    @Test
    public void calculateScore_returnsScoreForSingleLetter_2() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 2;
        assertEquals(expected, testScrabble.calculateScore("d"));
    }

    @Test
    public void calculateScore_returnsScoreForSingleLetter_3() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 3;
        assertEquals(expected, testScrabble.calculateScore("b"));
    }

    @Test
    public void calculateScore_returnsScoreForMultiLetterMultiPointWord() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 8;
        assertEquals(expected, testScrabble.calculateScore("adidas"));
    }

    @Test
    public void calculateScore_returnsScoreForWordWithSpecialCharacters() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 8;
        assertEquals(expected, testScrabble.calculateScore("adi#$das"));
    }

}