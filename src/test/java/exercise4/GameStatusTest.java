package exercise4;

import org.junit.Test;

import static exercise4.GameState.*;
import static exercise4.Score.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by chris on 07/12/2017.
 */
public class GameStatusTest {
    @Test
    public void game_should_be_in_progress_at_15_0() throws Exception {
        setScoresAndAssert(FIFTEEN, LOVE, IN_PROGRESS);
    }

    @Test
    public void game_should_be_in_progress_at_30_0() throws Exception {
        setScoresAndAssert(THIRTY, LOVE, IN_PROGRESS);
    }

    @Test
    public void game_should_be_in_progress_at_40_0() throws Exception {
        setScoresAndAssert(FORTY, LOVE, IN_PROGRESS);
    }

    @Test
    public void game_should_be_won_by_player1_at_50_0() throws Exception {
        setScoresAndAssert(FIFTY, LOVE, WIN_P1);
    }

    @Test
    public void game_should_be_in_progress_at_0_15() throws Exception {
        setScoresAndAssert(LOVE, FIFTEEN, IN_PROGRESS);
    }

    @Test
    public void game_should_be_in_progress_at_0_30() throws Exception {
        setScoresAndAssert(LOVE, THIRTY, IN_PROGRESS);
    }

    @Test
    public void game_should_be_in_progress_at_0_40() throws Exception {
        setScoresAndAssert(LOVE, FORTY, IN_PROGRESS);
    }

    @Test
    public void game_should_be_won_by_player2_at_0_50() throws Exception {
        setScoresAndAssert(LOVE, FIFTY, WIN_P2);
    }


    private void setScoresAndAssert(Score player1Score, Score player2Score, GameState expectedGameState) {
        GameStatus gameStatus = new GameStatus(player1Score, player2Score);
        GameState gameState = gameStatus.calculateGameState();

        assertThat("Game state should be " + expectedGameState, gameState, is(expectedGameState));
    }

    @Test
    public void game_should_be_in_progress_at_15_15() throws Exception {
        setScoresAndAssert(FIFTEEN, FIFTEEN, IN_PROGRESS);
    }

    @Test
    public void game_should_be_in_progress_at_15_30() throws Exception {
        setScoresAndAssert(FIFTEEN, THIRTY, IN_PROGRESS);
    }

    @Test
    public void game_should_be_in_progress_at_15_40() throws Exception {
        setScoresAndAssert(FIFTEEN, FORTY, IN_PROGRESS);
    }

    @Test
    public void game_should_be_in_progress_at_30_15() throws Exception {
        setScoresAndAssert(THIRTY, FIFTEEN, IN_PROGRESS);
    }

    @Test
    public void game_should_be_in_progress_at_30_30() throws Exception {
        setScoresAndAssert(THIRTY, THIRTY, IN_PROGRESS);
    }

    @Test
    public void game_should_be_in_progress_at_30_40() throws Exception {
        setScoresAndAssert(THIRTY, FORTY, IN_PROGRESS);
    }

    @Test
    public void game_should_be_in_progress_at_40_15() throws Exception {
        setScoresAndAssert(FORTY, FIFTEEN, IN_PROGRESS);
    }

    @Test
    public void game_should_be_in_progress_at_40_30() throws Exception {
        setScoresAndAssert(FORTY, THIRTY, IN_PROGRESS);
    }

    @Test
    public void game_should_be_won_by_player1_at_50_15() throws Exception {
        setScoresAndAssert(FIFTY, FIFTEEN, WIN_P1);
    }

    @Test
    public void game_should_be_won_by_player1_at_50_30() throws Exception {
        setScoresAndAssert(FIFTY, THIRTY, WIN_P1);
    }

    @Test
    public void game_should_be_won_by_player2_at_15_50() throws Exception {
        setScoresAndAssert(FIFTEEN, FIFTY, WIN_P2);
    }

    @Test
    public void game_should_be_won_by_player2_at_30_50() throws Exception {
        setScoresAndAssert(THIRTY, FIFTY, WIN_P2);
    }

}