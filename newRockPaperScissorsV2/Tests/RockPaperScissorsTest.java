import game.RockPaperScissors;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RockPaperScissorsTest {
    /**
     * Testing Strategy
     *
     * Partition the user input as follows:
     * userInput = ROCK, PAPER, SCISSORS, or INVALID
     *
     */
    @Test
    public void testUserInput(){
        assertEquals(RockPaperScissors.userInput());
    }

}
