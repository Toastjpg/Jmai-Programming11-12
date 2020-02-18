import game.RockPaperScissors;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RockPaperScissorsTest {
    /**
     * Testing Strategy
     *
     * Test when randomComputerNumber is 0, 1, or 2
     * Test userInput for ROCK and computerInput is ROCK, PAPER, or SCISSORS
     * Test userInput for PAPER and computerInput is ROCK, PAPER, or SCISSORS
     * Test userInput for SCISSORS and computerInput is ROCK, PAPER, or SCISSORS
     * Test when userInput is invalid
     */
    @Test
    public void testRandomNumber(){
        assertEquals("rock", new RockPaperScissors("rock", 0).getComputerInput());
        assertEquals("paper", new RockPaperScissors("rock", 1).getComputerInput());
        assertEquals("scissors", new RockPaperScissors("rock", 2).getComputerInput());
    }
}
