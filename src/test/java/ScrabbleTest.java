import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;


    public class ScrabbleTest {
        @Test
        public void calculateScore_returnsScoreForSingleLetter_1() throws Exception {
            Scrabble testScrabble = new Scrabble();
            Integer expected = 1;
            assertEquals(expected, testScrabble.calculateScore("a"));
        }

}