package game;

import org.junit.Test;
import static org.junit.Assert.*;

public class RPSwTest {
    @Test
    public void roundEvaluator_returnsScoreForSingleLetter_1() throws Exception {
        RPSw testRPSw = new RPSw();
        String expected = "Tie!";
        assertEquals(expected, testRPSw.roundEvaluator("rock", "rock"));
    }
    @Test
    public void roundEvaluator_returnsScoreForSingleLetter_2() throws Exception {
        RPSw testRPSw = new RPSw();
        String expected = "Paper Wins!";
        assertEquals(expected, testRPSw.roundEvaluator("rock", "paper"));
    }
    @Test
    public void roundEvaluator_returnsScoreForSingleLetter_3() throws Exception {
        RPSw testRPSw = new RPSw();
        String expected = "Scissors Wins!";
        assertEquals(expected, testRPSw.roundEvaluator("paper", "scissors"));
    }
    @Test
    public void roundEvaluator_returnsScoreForSingleLetter_4() throws Exception {
        RPSw testRPSw = new RPSw();
        String expected = "Rock Wins!";
        assertEquals(expected, testRPSw.roundEvaluator("rock", "scissors"));
    }
}