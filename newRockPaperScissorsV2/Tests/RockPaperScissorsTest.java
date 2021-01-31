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

    //Tests when the randomComputerNumber is 0, 1, or 2.
    @Test
    public void testRandomNumber(){
        assertEquals("rock", new RockPaperScissors("rock", 0).getComputerInput());
        assertEquals("paper", new RockPaperScissors("rock", 1).getComputerInput());
        assertEquals("scissors", new RockPaperScissors("rock", 2).getComputerInput());
    }

    //Tests userInput for rock and when computerInput is rock, paper, and scissors
    @Test
    public void testUserChoiceRock(){
        assertEquals(0, new RockPaperScissors("rock", 0).getUserScore());
        assertEquals(-1, new RockPaperScissors("rock", 1).getUserScore());
        assertEquals(1, new RockPaperScissors("rock", 2).getUserScore());
    }

    //Tests userInput for paper and when computerInput is rock, paper, and scissors
    @Test
    public void testUserChoicePaper(){
        assertEquals(1, new RockPaperScissors("paper", 0).getUserScore());
        assertEquals(0, new RockPaperScissors("paper", 1).getUserScore());
        assertEquals(-1, new RockPaperScissors("paper", 2).getUserScore());
    }

    //Tests userInput for scissors and when computerInput is rock, paper, and scissors
    @Test
    public void testUserChoiceScissors(){
        assertEquals(-1, new RockPaperScissors("scissors", 0).getUserScore());
        assertEquals(1, new RockPaperScissors("scissors", 1).getUserScore());
        assertEquals(0, new RockPaperScissors("scissors", 2).getUserScore());
    }

    //Tests for an invalid userInput
    @Test
    public void testInvalidInput(){
        assertEquals("Invalid Input", new RockPaperScissors("sladgjask", 0).getErrorMessage());
    }
}
